package com.company;

public class Main {

    public static void main(String[] args) {
        //Tehtävä 2
        BMI luokka = new BMI();
        double bmi = luokka.calculateBMI(66,1.9);
        System.out.println(bmi);
        System.out.println(luokka.isUnderWeight(bmi));
        bmi = luokka.calculateBMI(67,1.9);
        System.out.println(bmi);
        System.out.println(luokka.isUnderWeight(bmi));

        System.out.println("-------------------------------------------------------------------");

        //Tehtävä 3

        int[][]  A  =  {  {  0,  0, 1, 0, 0 },
                        { 0,  1, 1,  1,  0 },
                        {1, 1, 1,  1, 1, }
        };

        int[][] B = {  {  0,  0, 1, 0, 0 },
                { 0,  1, 1,  1,  0 },
                {1, 1, 1,  1, 1, },
                {1, 1, 1,  1, 1, }

        };

        ArrayMatcher matcher = new ArrayMatcher();
        System.out.println(matcher.willShapeFitInArray(A,B));





        }


}
