package com.dev.lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int len = readIntegers();
        int [] reversedArrays = reverseIntegers(len);
        System.out.println(Arrays.toString(reversedArrays));

    }

    private static int readIntegers(){
        System.out.println("Input How many numbers you want? ");
        Scanner scan = new Scanner (System.in);
        return scan.nextInt();
    }

    private static int [] reverseIntegers( int len){
        int [] arrays = new int [len];
        int x = 0;
        Scanner scan = new Scanner (System.in);
        while (x < len){
            System.out.println("Input numbers?");
            int input = scan.nextInt();
            arrays[x] = input;
            x++;
        }
        for (int j = 0; j < len / 2 ; j++){
            int temp = arrays[j];
            arrays[j] = arrays[len - 1 - j];
            arrays[len - 1 - j]= temp;
        }

        return arrays;
    }
}
