package com.learn.basics;

import java.lang.*;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);

        long sum = binaryToDecimal(input.nextLong());
        System.out.println(sum);
    }

    private static long binaryToDecimal(long val) {
        long sum =0,edge = 0, remVal = 0, count =0;
        while(val != 0) {
            edge = val%10;
            remVal = val/10;
            sum += ((int) Math.pow(2, count) * edge);
            val = remVal;
            count++;
        }
        return sum;
    }
}
