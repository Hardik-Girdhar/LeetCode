class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        for(int i=1;i<arrays.size();i++){
            int currmin = arrays.get(i).get(0);
            int currmax = arrays.get(i).get(arrays.get(i).size()-1);

            result = Math.max(result, Math.max(Math.abs(currmax-min) , Math.abs(currmin - max)));

            max = Math.max(max,currmax);
            min = Math.min(min,currmin);
        }
        return result;
    }
}