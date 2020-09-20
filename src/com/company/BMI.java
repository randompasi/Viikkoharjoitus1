package com.company;
public class BMI {

    private final double underWeight = 18.5;

    /**
     * Is bmi value underweightr
     * @param bmi avulla katsotaan onko henkilö alipainoinen
     * @.pre bmi>0
     * @.post boolean
     *
     */
    public boolean isUnderWeight(double bmi){
        return bmi < underWeight;
    }

    /**
     * Calculates BMI with weight and height
     * @param paino needed to calculate BMI, value needs to be in kilograms
     * @param pituus neededto calculate BMI, value needs to in Meters
     * @.pre paino>0, pituus>0
     * @.post RESULT BMI>0
     *
     */
    public double calculateBMI(double paino, double pituus){

        return paino/(pituus*pituus);

    }
}