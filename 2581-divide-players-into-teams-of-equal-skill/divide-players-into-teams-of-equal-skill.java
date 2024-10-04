class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int check=skill[0]+skill[n-1];
        long result=0;
        for(int i=0;i<skill.length/2;i++){
            if(skill[i]+skill[n-i-1]!=check)
                return -1;
            else
                result+=(skill[i]*skill[n-i-1]);
        }
        return result;
    }
}