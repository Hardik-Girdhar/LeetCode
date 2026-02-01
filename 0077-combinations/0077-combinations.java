class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backTrack(1, n, k, list, ans);
        return ans;
    }
    private void backTrack(int idx, int n, int k, List<Integer> list, List<List<Integer>> ans){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<=n; i++){
            list.add(i);
            backTrack(i+1, n, k, list, ans);
            list.remove(list.size()-1);
        }
    }
}