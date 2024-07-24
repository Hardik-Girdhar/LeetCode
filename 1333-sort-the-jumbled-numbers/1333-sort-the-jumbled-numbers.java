// class Solution {
//     public int[] sortJumbled(int[] mapping, int[] nums) {
//         int[] map = new int[nums.length];
//         int i = 0;
//         for (int ele : nums) {
//             StringBuilder sb = new StringBuilder();
//             int digit = 0;
//             if (ele == 0) {
//                 sb.append(mapping[0]);
//             } else {
//                 while (ele != 0) {
//                     int r = ele % 10;
//                     ele = ele / 10;
//                     digit = mapping[r];
//                     sb.insert(0, digit);
//                 }
//             }
//             map[i] = Integer.parseInt(sb.toString());
//             i++;
//         }

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//         for (int j = 0; j < nums.length; j++) {
//             pq.add(new int[] { nums[j], map[j] });
//         }
//         int[] res = new int[nums.length];
//         int k = 0;
//         while (!pq.isEmpty()) {
//             res[k++] = pq.poll()[0];
//         }
//         return res;
//     }
// }


class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] mapped = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            int original = nums[i];
            StringBuilder sb = new StringBuilder();
            
            if (original == 0) {
                sb.append(mapping[0]);
            } else {
                int num = original;
                while (num != 0) {
                    int r = num % 10;
                    num /= 10;
                    sb.insert(0, mapping[r]);
                }
            }
            
            mapped[i][0] = original;
            mapped[i][1] = Integer.parseInt(sb.toString());
        }

        Arrays.sort(mapped, (a, b) -> a[1] - b[1]);
        
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = mapped[i][0];
        }
        
        return res;
    }
}
