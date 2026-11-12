// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 for(int k=j+1; k<n; k++){
//                     for(int l=k+1; l<n; l++){
//                         int sum = target - (nums[i] + nums[j] + nums[k] + nums[l]);
//                         if(sum == 0){
//                             List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
//                             Collections.sort(list);
//                             set.add(list);
//                         }
//                     }
//                 }
//             }
//         }

//         List<List<Integer>> list = new ArrayList<>(set);
//         return list;
//     }
// }


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                HashSet<Long> st = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum = nums[i] + nums[j]; 
                    sum += nums[k];
                    long fourth = target - sum;
                    if(st.contains(fourth)){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
                        Collections.sort(list);
                        set.add(list);
                    } 

                    st.add((long)nums[k]);                   
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}