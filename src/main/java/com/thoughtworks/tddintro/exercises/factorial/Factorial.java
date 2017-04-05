package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {

    public Integer compute(int i) {
        int fact = 1;
        for(int j = 1; j <= i; j++) {
            fact *= j;
        }
        return fact;
    }
}
