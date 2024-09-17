class Solution {
    private Boolean[][] dp;
    public boolean checkValidString(String s) {
        dp = new Boolean[s.length() + 1][s.length() + 1];
        return check(s, 0, 0);
    }
    private boolean check(String s, int start, int count) {
        if (count < 0) return false;
        int y = count;
        if (dp[start][y] != null) return dp[start][y];
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count <= 0) return false;
                count--;
            } else if (c == '*') {
                dp[start][y] = (check(s, i + 1, count + 1) || check(s, i + 1, count - 1) || check(s, i + 1, count));
                return dp[start][y];
            }
        }
        dp[start][y] = (count == 0);
        return dp[start][y];
    }
}