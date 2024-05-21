class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result,temp,nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> main, List<Integer>temp,int[]arr,int start)
    {
        if(arr.length == start)
        {
            main.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[start]);
        backtrack(main,temp,arr,start+1);
        temp.remove(temp.size()-1);
        backtrack(main,temp,arr,start+1);
    }
}