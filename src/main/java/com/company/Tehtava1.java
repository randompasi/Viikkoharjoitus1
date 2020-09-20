package com.company;

import java.util.Comparator;
import java.util.List;



public class Tehtava1 {


    /**
     *@.pre FORALL(x : kiva; x > 0)
     * @.post true
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
     * @.pre EXISTS(i : syöte ; i.equals ( " k "))
     * @.post true
     */
    public  boolean isThereSmallCaseK(String syöte){
         return syöte.indexOf('k') > -1;
    }

    /**
     Kokonaislukutaulukon lottorivi minimialkiolla ei ole duplikaatteja (so. se esiintyy taulukossa vain kerran).
     @.pre FORALL (i,j :a; 0<=i<j<a.Length ==> a[i]!=a[j])
     @.post true
     */
    public boolean noDuplicateForLowestValue(List<Integer> lottorivi){
        lottorivi.sort(Comparator.naturalOrder());
        return lottorivi.get(0) != lottorivi.get(1);
    }






}
