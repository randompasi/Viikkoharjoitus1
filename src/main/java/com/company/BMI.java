package com.company;

/**
 *underWiegt variable is limit for underweight so it can be final local variable because that doesn't change and we will use it to find if people are underweight.
 * because underwieght is double we keep other measurements that we use to calculate as double. It makes things easier because we don't need to change variable data type.
 * In calculate BMI we need paino and pituus with them we can calculate the humans BMI and in isUnderWeight we need bmi double so we can look if target is underweight.
 */
public class BMI {

    private final double underWeight = 18.5;

    /**
     * return true if bmi is under 18.5
     * @param bmi BMI index
     * @.pre bmi != null - will not work if bmi doesn't have value. Java will throw error if this happens and program will stop
     * @.post RESULT == boolean
     *
     */
    public boolean isUnderWeight(double bmi){
        return bmi < underWeight;
    }

    /**
     * Calculates BMI with weight and height
     * @param paino needed to calculate BMI, value needs to be in kilograms
     * @param pituus neededto calculate BMI, value needs to in Meters
     * @.pre paino != 0 && pituus != 0 - java cannot calculate with zero and will throw arithmetic error if zero is used on arithmetic operation
     * @.post RESULT == paino/(pituus*pituus) && RESULT > 0 && RESULT == double
     *
     */
    public double calculateBMI(double paino, double pituus){

        return paino/(pituus*pituus);

    }
}