package com.company;

import net.jqwik.api.*;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.Size;
import net.jqwik.api.constraints.Unique;
import org.junit.Assert;

import java.util.Comparator;
import java.util.List;

public class Tehtava1Tests {


    @Property
    public boolean isPositiveNumbersAcceptable(@ForAll @Size(10) List<@From("positiveNumbers")Integer> kiva){
        Tehtava1 teht = new Tehtava1();
        return teht.OnKiva(kiva);
    }

    @Property
    public void NegativeNumbersAreNotAcceptable(@ForAll @Size(10) List<@From("negativeNumbers") Integer> kiva){
        Tehtava1 teht = new Tehtava1();
        Assert.assertFalse(teht.OnKiva(kiva));

    }

    @Property
    public void mixedNumbers(@ForAll @Size(10) List<Integer> kiva){
        Tehtava1 teht = new Tehtava1();
        boolean result = teht.OnKiva(kiva);
         kiva.sort(Comparator.naturalOrder());
        if(kiva.get(0)< 0){
            Assert.assertFalse(result);
        }
        else{
            Assert.assertTrue(result);
        }


    }

    @Property
    public void kTest(@ForAll @AlphaChars String syote){
        Tehtava1 teht = new Tehtava1();
        boolean result = teht.isThereSmallCaseK(syote);

        if(syote.indexOf('k') > -1) {

            Assert.assertTrue(result);
        }

    }

    @Property
    public boolean duplicateTest(@ForAll @Size(32) List<@Unique Integer> lottorivi){
        Tehtava1 teht = new Tehtava1();
        return teht.noDuplicateForLowestValue(lottorivi);
    }




    @Provide
    Arbitrary<Integer> positiveNumbers() {
        return Arbitraries.integers().greaterOrEqual(0);
    }

    @Provide
    Arbitrary<Integer> negativeNumbers() {
        return Arbitraries.integers().lessOrEqual(-1);
    }

    @Provide
    Arbitrary<String> shortStrings() {
        return Arbitraries.strings().withCharRange('a', 'z')
                .ofMinLength(1).ofMaxLength(8);
    }




}
