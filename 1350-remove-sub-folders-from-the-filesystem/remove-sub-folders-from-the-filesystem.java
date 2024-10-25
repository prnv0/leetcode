class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String prev=" ";
        List<String> result = new ArrayList<>();
        for(int i=0;i<folder.length;i++){
            if(folder[i].indexOf(prev)!=0){
                // System.out.println(folder[i]);
                result.add(folder[i]);
                prev=folder[i];
            }
            else if(folder[i].length()>prev.length()&&folder[i].contains(prev)&&folder[i].charAt(prev.length())!='/'){
                result.add(folder[i]);
                prev=folder[i];
            }
        }
        return result;
    }
}