package com.company;

import java.util.Scanner;

public class ArrayFunReverseIt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println("The original 5 integers are:");
        for (int element: arr1)
            System.out.println(element);


        int[] reversed = new int[5];
        System.out.println("The reversed 5 integers are:");
        for (int i = 0; i < arr1.length; i++) {
            reversed[i] = arr1[arr1.length - i - 1];
            System.out.println(reversed[i]);

        }


    }
}
