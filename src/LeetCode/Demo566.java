package LeetCode;

import java.util.Arrays;

/**
 * Author: 徐明皓
 * Date: 2021-11-03 22:44
 * Description: <566. 重塑矩阵>
 */
public class Demo566 {

    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int m = mat.length;
            int n = mat[0].length;

            if ((r * c) != (m * n)){
                return mat;
            }

            int x=0,y=0;
            int[][] newMat = new int[r][c];
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    newMat[i][j] = mat[x][y++];
                    if (y==n){
                        x++;
                        y=0;
                    }
                }
            }
            return newMat;
        }
    }
}
