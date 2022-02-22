package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        String userInput;


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Please enter an integer:");
            userInput = myScanner.nextLine();
            arr1[i] = Integer.parseInt(userInput);

        }

        System.out.println("The 5 integers are:");
        for (int element : arr1) {
            System.out.println(element);
        }


    }

}
