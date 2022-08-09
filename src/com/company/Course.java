package com.company;

public class Course {
   private String name;
   private String treachname;
   private String bashtalgankyny;
   public Course(String name, String treachname,String bashtalgankyny){
       if (name.length()<2){
           System.out.println(name);
       }else {
           System.out.println("error");
       }
       this.name=name;
       this.treachname=treachname;
       this.bashtalgankyny=bashtalgankyny;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.treachname = treachname;
        this.bashtalgankyny = bashtalgankyny;
    }
}
