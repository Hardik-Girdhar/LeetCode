// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         List<List<Integer>> ans = new ArrayList<>();
//         for( int i = 0;i < 2; i++)
//             ans.add(new ArrayList());
//         HashSet<Integer> set1 = new HashSet();
//         HashSet<Integer> set2 = new HashSet();
//         for(int num : nums1)
//             set1.add(num);
//         for(int num : nums2)
//             set2.add(num);
        
//         for(int num : nums2)
//             if(set1.contains(num))
//                 set1.remove(num);
        
//         for(int num : nums1)
//             if(set2.contains(num))
//                 set2.remove(num);
        
//         for(Integer num: set1)
//             ans.get(0).add(num);
//         for(Integer num: set2)
//             ans.get(1).add(num);
//         return ans;
//     }
// }

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            list.add(new ArrayList<>());
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int ele: nums1){
            set1.add(ele);
        }
        for(int ele: nums2){
            set2.add(ele);
        }
        
        for(int ele: nums1){
            if(set2.contains(ele)){
                set2.remove(ele);
            }
        }
        for(int ele: nums2){
            if(set1.contains(ele)){
                set1.remove(ele);
            }
        }
        
        for(Integer ele: set1){
            list.get(0).add(ele);
        }
        for(Integer ele: set2){
            list.get(1).add(ele);
        }
        
        return list;
    }
}
