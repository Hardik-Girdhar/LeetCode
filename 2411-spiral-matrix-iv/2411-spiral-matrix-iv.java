/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        ListNode temp = head;
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (startCol <= endCol && startRow <= endRow) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                if (temp == null) {
                    matrix[startRow][j] = -1;
                } else {
                    matrix[startRow][j] = temp.val;
                    temp = temp.next;
                }
                
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                if (temp == null) {
                    matrix[i][endCol] = -1;
                } else {
                    matrix[i][endCol] = temp.val;
                    temp = temp.next;
                }
                
            }
            endCol--;

            // bottom
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    if (temp == null) {
                        matrix[endRow][j] = -1;
                    } else {
                        matrix[endRow][j] = temp.val;
                        temp = temp.next;
                    }
                    
                }
            }
            endRow--;
            
            // left
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    if(temp == null){
                        matrix[i][startCol] = -1;
                    }
                    else{
                        matrix[i][startCol] = temp.val;
                        temp = temp.next;
                    }
                    
                }
            }
            startCol++;
        }
        return matrix;
    }
}