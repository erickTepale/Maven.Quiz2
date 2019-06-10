package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtility {
    List<Integer> list;

    public ListUtility(){
        list = new ArrayList<>();
    }
    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> unique = new ArrayList<>();
        unique.add(Integer.parseInt(list.get(0).toString()));
        for (int i = 0; i < list.size() ; i++) {
            if(!unique.contains(list.get(i)))
                unique.add(Integer.parseInt(list.get(i).toString()));
        }
        return unique;
    }

    public String join() {
        String temp = "";

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
                temp+= list.get(i).toString();
            else
                temp += list.get(i).toString() + ", ";
        }

        return temp;
    }

    public Integer mostCommon() {
        Integer [] a = new Integer[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            a[i] = list.get(i);
        }
        return ArrayUtility.mostCommon(a);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
