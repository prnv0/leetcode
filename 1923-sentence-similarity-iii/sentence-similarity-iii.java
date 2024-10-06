class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()<=sentence2.length())
            return canequal(sentence1,sentence2);
        else
            return canequal(sentence2,sentence1);
    }
    public boolean canequal(String s1,String s2){
        String[] arr1= s1.split(" ");
        String[] arr2= s2.split(" ");
        int length=0;
        //check prefix length
        int i=0;
        while(i<arr1.length&&arr1[i].equals(arr2[i])){
            length++;
            i++;
        }
        int x=arr1.length-1;
        int y=arr2.length-1;
        //check suffix length
        while(x>=0&&length!=arr1.length&&arr1[x].equals(arr2[y])){
            length++;
            x--;
            y--;
        }
        if(length==arr1.length)
            return true;
        else return false;

    }
}