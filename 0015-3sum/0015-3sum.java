// OPTIMIZED APPROACH - N^2 + nlogn = n2, No extra space of hash
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    res.add(list);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        return res;
    }
}


// // BETTER APPROACH - n^2, Sc - O(n)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i=0; i<nums.length; i++){
//             HashSet<Integer> st = new HashSet<>(); 
//             for(int j=i+1; j<nums.length; j++){
//                 int third = -(nums[i] + nums[j]);
//                 if(st.contains(third)){
//                     List<Integer> list = Arrays.asList(nums[i], nums[j], third);
//                     Collections.sort(list);
//                     set.add(list);
//                 }
//                 st.add(nums[j]);
//             }            
//         }

//         List<List<Integer>> list = new ArrayList<>(set);
//         return list;
//     }
// }


// // Brute Force, TC = O(n^3), SC = O(n)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 for(int k=j+1; k<nums.length; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(list);
//                         set.add(list);
//                     }
//                 }
//             }
//         }

//         List<List<Integer>> list = new ArrayList<>(set);
//         return list;
//     }
// }