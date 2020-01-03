package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
//        String[] myStringArray = {"Hello", "Hi", "What", "Are"};
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);}

//        int [] newArray = new int [5];
//        String [] newStringArray = new String [5];
//
//        newArray[0] = 3;
//        newArray[1] = 4;
//        newArray[2] = 2;
//        newArray[3] = 6;
//        newArray[4] = 9;
//        for (int i = 0; i < newArray.length ; i++) {
//            System.out.println(newArray[i]);
//        }

        String [] newStringArray = new String [6];

        newStringArray[0] ="Hello";
        newStringArray[1] ="World!";
        newStringArray[2] =" This ";
        newStringArray[3] ="is ";
        newStringArray[4] ="the ";
        newStringArray[5] ="best thing that I can do!";

        for (int i = 0; i < newStringArray.length; i++) {
            System.out.print(newStringArray[i]);

        }


//        System.out.println(myStringArray[0]);
        //System.out.println(myArray.length);

    }
}
