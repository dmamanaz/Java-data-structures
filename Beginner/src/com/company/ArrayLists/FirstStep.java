package com.company.ArrayLists;


import java.util.ArrayList;

public class FirstStep {
    public static void main(String[] args) {

        ArrayList animals = new ArrayList();

        animals.add(24);
        animals.add("Cow");
        animals.add("Parrot");
        animals.add(0, "Dog");

        System.out.println(animals.size());

        if (animals.contains("Parrot")){
            animals.remove("Parrot");
        }else {
            System.out.println("Nope");
        }

//        for (int i = 0; i < animals.size(); i++) {
//
//            System.out.println(animals.get(i));
//        }

//        System.out.println(animals.get(0));
//        System.out.println(animals.get(1));
//        System.out.println(animals.get(2));
        //   smarter for loop
        for (Object animal : animals) {
            System.out.println(animal);

        }
    }
}
