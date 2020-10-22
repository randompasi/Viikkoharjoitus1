package com.company;

public class ArrayMatcher {

    /**
     *  check if 2d shape in A array will fit in new array B
     *  Assuming that 2d arays are square
     * @.pre  A != null && B != null &&  A.length>0 && A.[A.length]>0 && B.length>0 && B.[B.length]>0
     *
     * @.post RESULT ==FORALL(int x,int y; A[x][y]<*; EXIST(z,c ; z >= 0 && c >= 0; z < B.length && c < B.[B.length]))
     *
     */


    public boolean willShapeFitInArray(int[][] A, int[][] B) {
    }
}
