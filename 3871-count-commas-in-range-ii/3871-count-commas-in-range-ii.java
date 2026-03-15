class Solution {
    public long countCommas(long n) {
        if(n < 1000) return 0;

        long totalCommas = 0;
        long startRange = 1000;
        long currentCommas = 1;

        while(startRange <= n){
            long endRange = startRange * 1000 - 1;
            long currentRange = Math.min(n, endRange);

            long numbers = currentRange - startRange + 1;
            totalCommas += numbers * currentCommas;

            startRange *= 1000;
            currentCommas++;
        }

        return totalCommas;
    }
}