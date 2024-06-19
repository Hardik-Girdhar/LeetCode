class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s = 1;
        int e = maxofArray(bloomDay);
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                e = mid - 1;
            }
            else{
                s =mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] bloomDay, int mid, int nob, int nof) {
        int m = 0;
        int k = 0;
        for (int ele : bloomDay) {
            if (ele <= mid) {
                k++;
                if (k == nof) {
                    m++;
                    k = 0;
                }
            } else {
                k = 0;
            }
        }
        return m >= nob;
    }

    public int maxofArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}