package com.zipcodewilmington.assessment2.part2;


import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        Integer [] bleh = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bleh[i] = Integer.parseInt(list.get(i).toString());
        }

        return bleh;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer [] bleh = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i+index < array.length)
                bleh[i] = array[i+index];
            else
                bleh[i] = array[i + index - array.length];
        }
        return bleh;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return countOccurence(array1, valueToEvaluate) + countOccurence( array2, valueToEvaluate);
    }

    private static Integer countOccurence(Integer[]array, Integer valueToEval){
        Integer counter = 0;
        for (Integer each : array) {
            if (each == valueToEval)
                counter ++;
        }
        return counter;
    }

    public static Integer mostCommon(Integer[] array) {
        Integer occurenceVal = array[0];
        Integer occurenceCounter = countOccurence(array, array[0]);


        for (int i = 1; i <array.length ; i++) {
            Integer temp = countOccurence(array, array[i]);
            if( temp > occurenceCounter){
                occurenceCounter = temp;
                occurenceVal = array[i];
            }
        }
        return occurenceVal;
    }
}
