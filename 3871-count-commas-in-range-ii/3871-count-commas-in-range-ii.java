class Solution {
    public long countCommas(long n) {
        if(n < 1000) return 0;

        long commas = 0;
        long start = 1000;
        long currentCommas = 1;
        while(start <= n){
            long endRange = start * 1000 - 1;
            long currentRange = Math.min(n, endRange);

            if(start <= currentRange){
                long numbersWithCommas = currentRange - start + 1;
                commas += numbersWithCommas * currentCommas;
            }

            start *= 1000;
            currentCommas++;
        }
        return commas;
    }
}