package com.company;

import java.util.Comparator;
import java.util.List;



public class Tehtava1 {


    /**
     FORALL (int arvo; arvo<kiva.length; i++, kiva[arvo] > 0)
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
     * @.pre EXISTS(i ; syöte ; i.contains( ' k ') || i.contains( ' K '))
     * @.post true
     */
    public  boolean isCaseK(String syöte){
         return  syöte.toLowerCase().indexOf('k') > -1;
    }

    /**
     Kokonaislukutaulukon lottorivi minimialkiolla ei ole duplikaatteja (so. se esiintyy taulukossa vain kerran).
     @.pre FORALL (i,j ; 0 <= i < lottorivi.Length && 0 <= j < lottorivi.Length && i != j && lottorivi[i] != lottorivi[j])
     @.post true
     */
    public boolean noDuplicateForLowestValue(List<Integer> lottorivi){
        lottorivi.sort(Comparator.naturalOrder());
        return lottorivi.get(0) != lottorivi.get(1);
    }






}
