// // OPTIMAL SOLUTION
class Solution {
    public List<Integer> rowelement(int row){
        List<Integer> list = new ArrayList<>();
        int res=1;
        list.add(1);
        for(int i=1;i<row; i++)
        {
            res = res * (row-i);
            res = res / i;
            list.add(res);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main = new ArrayList<>();
        for(int i=1 ; i<=numRows; i++){
            main.add(rowelement(i));
        }
        return main;
    }
}

//  BRUTE FORCE
// class Solution {
//     public static int ncr(int n,int r){
//         long res=1;
//         for(int i=1;i<=r;i++){
//             res = res * (n-i+1);
//             res = res / i;
//         }
//         return (int)res;
//     }
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> main = new ArrayList<>();
//         for(int i=1; i<=numRows; i++){
//             List<Integer> list = new ArrayList<>();
//             for(int j=1; j<=i; j++){
//                 list.add(ncr(i-1,j-1));
//             }
//             main.add(list);
//         }
//         return main;
//     }
// }