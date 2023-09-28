package com.fredrik.Lektion_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 100, 1000};

//        Scanner scan = new Scanner(System.in);
//        System.out.println("type something to crash the program");
//        scan.nextLine();
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers.length);
//        }

        System.out.println("Before crash");
        try {
            System.out.println("inside - try");
            System.out.println(2 / 0);
        } catch (Exception error) {
            System.out.println("Inside - catch");
            error.printStackTrace();
        }
        System.out.println("After crash");


    }


}
