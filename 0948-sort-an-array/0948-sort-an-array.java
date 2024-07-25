class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        int idx=0;
        for(int i=min;i<=max;i++){
            while(map.getOrDefault(i,0)>0){
                nums[idx] = i;
                idx++;
                map.put(i,map.get(i)-1);
            }
        }
        return nums;
    }
}