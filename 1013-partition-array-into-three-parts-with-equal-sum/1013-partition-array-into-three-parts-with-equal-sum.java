class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        if( sum % 3 != 0){
            return false;
        }

        int target = sum/3;
        int currSum = 0;
        int counter = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum == target){
                currSum = 0;
                if(counter == 2) return true;
                counter++;
            }
        }

        return false;
    }
}