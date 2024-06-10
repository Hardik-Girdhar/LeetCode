class Solution {
    public int heightChecker(int[] ht) {
        int arr[] = new int[ht.length];
        for(int i=0;i<ht.length;i++){
            arr[i] = ht[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<ht.length;i++){
            if(ht[i] != arr[i]){
                count++;
            }
        }
        return count;
    }
}