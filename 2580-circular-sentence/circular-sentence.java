class Solution {
    public boolean isCircularSentence(String sentence) {
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '&&sentence.charAt(i-1)!=sentence.charAt(i+1))
                return false;
        }
        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1))
            return true;
        else 
            return false;
    }
}