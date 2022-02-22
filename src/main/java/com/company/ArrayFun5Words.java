package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String[] words = new String[5];
        for (int i = 0; i < words.length; i++){
            System.out.println("Please enter a word:");
            words[i]= myScanner.nextLine();
        }


        System.out.println("The 5 words you entered are:");
        for (String word : words){
            System.out.println(word);
        }


    }


}