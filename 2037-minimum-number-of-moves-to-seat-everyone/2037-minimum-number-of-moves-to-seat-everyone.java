class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
//         int moves=0;
//         int s=0;
//         for(int i=0;i<students.length;i++){
//             int ans=0;
//             while(s<seats.length){
                
//             }
//             moves = moves+ans;
//         }
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<students.length;i++){
            ans = ans + Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}