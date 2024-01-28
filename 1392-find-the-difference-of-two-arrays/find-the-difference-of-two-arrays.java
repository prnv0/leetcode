class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
            }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
            }
        List<List<Integer>> result = new ArrayList<>(); 
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        for(int num : set1){                                           
			if(!set2.contains(num)){ result.get(0).add(num); }      
		}
		for(int num : set2){                                            
			if(!set1.contains(num)){ result.get(1).add(num); }      
		}
		return result;
        
    }
}