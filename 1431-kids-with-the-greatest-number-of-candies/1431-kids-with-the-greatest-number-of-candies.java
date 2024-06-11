class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max=0;
        for(int candy : candies){
            max=Math.max(max,candy);
        }
        for(int i=0;i<candies.length;i++){
            int curr = candies[i]+extraCandies;
            if(curr>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}