package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        int counter = 0;
        Integer [] bleh = new Integer[Math.abs(Math.abs(stop) - Math.abs(start)) + 1];
        for (int i = start; i <= stop ; i++) {
            bleh[counter] = i;
            counter++;
        }
        return bleh;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return (array[0] + array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length - 1] * array[array.length - 2];
    }
}
