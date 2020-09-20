package com.company;

public class ArrayMatcher {

    /**
     * Returns will 2d shape on array fit on new Array
     * @.pre  A.length>0 && A.[A.length]>0
     *  B.length>0 && B.[B.length]>0
     * @.post RESULT == boolean
     */


    public boolean willShapeFitInArray(int[][] A, int[][] B){
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[row].length; col++) {
                if (A[row][col] == 1) {
                    if (row < B.length) {
                        if (col < B[row].length) {

                        } else {
                            System.out.println("Colum too smal in new Array");
                            return false;
                        }
                    } else {
                        System.out.println("Row too small in new Array");
                        return false;
                    }
                }


            }
        }
        System.out.println("mahtuu");
        return true;
    }
}
