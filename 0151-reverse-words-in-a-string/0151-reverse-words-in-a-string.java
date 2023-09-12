class Solution {
    public String reverseWords(String s) {
        int i,j,count=0;
        s+=" ";
        String word="";
        String sentence="";
        List<String> words= new ArrayList<String>();
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else if((s.charAt(i)==' '&&s.charAt(i+1)!=' ')&&(!word.equals(""))){
                    words.add(word);
                word="";
                count++;
            }
        }
        if(!word.equals(" ")){
            words.add(word);
            count++;
        }
        Collections.reverse(words);
        System.out.println(words);
        sentence=sentence+words.get(0);
        for(i=1;i<count;i++){
            sentence=sentence.concat(" "+words.get(i));
        }
        return sentence;
    }
}