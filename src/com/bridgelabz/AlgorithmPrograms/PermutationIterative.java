package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationIterative {

    static void StringPermutation(String permutation, String result) {
/*
 * Returns the result when the condition applies till the permutation string become null or empty.
 */
        if (permutation.length() == 0) {
            System.out.println(result + " ");
            return;
        }
        for (int i=0; i<permutation.length(); i++) {
/*
 * returns the char value at "i" index
 * substring is a subset of another String.
 * In case of substring() method startIndex is inclusive and endIndex is exclusive.
 */
            char ch = permutation.charAt(i);
            String string = permutation.substring(0,i)+permutation.substring(i+1);
            StringPermutation(string, result+ch);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the permutation String : ");
        String permutation = scanner.next();

        StringPermutation(permutation, " ");
    }
}
