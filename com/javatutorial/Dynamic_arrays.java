package com.javatutorial;

import java.util.ArrayList;

public class Dynamic_arrays {
    public static void main(String[] args) { //python list
        ArrayList<Integer> list = new ArrayList<>();//initial capacity can be specified in()
        list.add(66);
        list.add(67);
        list.add(68);
        list.add(69);
        System.out.println(list);
        System.out.println(list.contains(69));
        list.set(0,420);  //(index,value)
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
