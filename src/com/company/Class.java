package com.company;

public class Class {
    private int number;
    private String a ;
    private int[]array;


    public Class(int number,String a,int...array){
    this.number=number;
    this.a=a;
    this.array=array;
    }


    public int getNumber() {
        return number;

    }


    public String getA() {
        return a;
    }



    public int[] getArray() {
        return array;
    }


}
