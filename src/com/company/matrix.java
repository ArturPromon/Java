package com.company;

public class matrix {
    public static void main(String[] args){
//        int[][] array = new int[][]{{1,3,5}, {2,4,6}, {7,8,9}, {10,11,12}, {4,5,6,5,3,2,4,56,67,2,25,7}};
//        System.out.print(array[4][8]);

        int [][] matrix1 = new int[][] {{1,2}, {3,4}};
        int [][] matrix2 = new int[][] {{5,6}, {7,8}};
        int [][] matrix3 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] matrix4 = new int[][] {{10,11,12}, {13,14,15}, {16,17,18}};


//        for (int i = 0; i<2;i++){
//            int result1 = matrix1[i][0] * matrix2[0][0] + matrix1[i][1] * matrix2[1][0];
//            int result2 = matrix1[i][0] * matrix2[0][1] + matrix1[i][1] * matrix2[1][1];
//            System.out.print(result1 + "       ");
//            System.out.print(result2);
//
//            System.out.println();
//        }

        for(int i=0; i<3; i++){
            int res1 = matrix3[i][0] * matrix4[0][0] + matrix3[i][1] * matrix4[1][0] + matrix3[i][2] * matrix4[2][0];
            System.out.print(res1 + " ");

            System.out.println();
        }
    }
}
