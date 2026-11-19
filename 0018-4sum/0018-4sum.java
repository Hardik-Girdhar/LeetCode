// BEST - n^3 , sc - O(1)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j != i+1 && nums[j]==nums[j-1]) continue;
                
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        ans.add(list);
                        k++;
                        l--;

                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if (sum>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}



// // BETTER APPROACH - n^3 + logn, but sc - n + 2*no of quads
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         HashSet<List<Integer>> set = new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 HashSet<Long> st = new HashSet<>();
//                 for(int k=j+1;k<n;k++){
//                     // long fourth = target - (nums[i]+ nums[j]+ nums[k]);
//                     long sum = nums[i] + nums[j];
//                     sum += nums[k];
//                     long fourth = target - sum; 
//                     if(st.contains(fourth)){
//                         List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
//                         Collections.sort(temp);
//                         set.add(temp);
//                     }
//                     st.add((long)nums[k]);
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }
// }


// // BRUTE FORCE - n^4
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         HashSet<List<Integer>> set = new HashSet<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     for(int l=k+1;l<n;l++){
//                         long sum = nums[i]+nums[j];
//                         sum += nums[k];
//                         sum += nums[l];

//                         if(sum == target){
//                             List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
//                             Collections.sort(list);
//                             set.add(list);
//                         }
//                     }
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(set);
//         return ans;
//     }
// }