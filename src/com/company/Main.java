package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class class1 = new Class(15,"coz", 2,3,4,5,5,6);
        System.out.println(class1.getNumber()+" "+class1.getA()+" "+ Arrays.toString(class1.getArray()));

    }
}