package com.company;

public class student {
    private int age;
    private String name;
    private String junysy;
    public student(String name,int age, String junysy){
        if (15<age && age<30){
            System.out.println(age);

        }else{
            System.out.println("студенттин жашы туура келбейт");
        }
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJunysy(String junysy) {
        this.junysy = junysy;
    }
}
