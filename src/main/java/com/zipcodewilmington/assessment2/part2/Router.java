package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    private Map<String, String> map = new LinkedHashMap<>();


    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
        String temp ="";
        Iterator it = map.entrySet().iterator();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            temp+= entry.getKey() + "" + entry.getValue() + "\n";
        }

        return temp;
    }
}
