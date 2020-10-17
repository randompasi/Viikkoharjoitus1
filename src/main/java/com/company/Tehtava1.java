package com.company;

import java.util.Comparator;
import java.util.List;



public class Tehtava1 {


    /**
     FORALL (int arvo; arvo<lottorivi.length; i++, lottorivi[arvo] < 0)
     */
    public boolean OnKiva(List<Integer> kiva){
               for(int arvo : kiva){
                   if(arvo < 0){
                       return false;
                   }
               }
               return true;
    }

    /**
     * 	Merkkijonossa syöte esiintyy merkki 'k'
     * @.pre EXISTS(i ; syöte ; i.contains( " k "))
     * @.post true
     */
    public  boolean isThereSmallCaseK(String syöte){
         return  syöte.indexOf('k') > -1;
    }

    /**
     Kokonaislukutaulukon lottorivi minimialkiolla ei ole duplikaatteja (so. se esiintyy taulukossa vain kerran).
     @.pre FORALL (i,j ; 0 <= i < a.Length && 0 <= j < a.Length && i != j && a[i] != a[j])
     @.post true
     */
    public boolean noDuplicateForLowestValue(List<Integer> lottorivi){
        lottorivi.sort(Comparator.naturalOrder());
        return lottorivi.get(0) != lottorivi.get(1);
    }






}
