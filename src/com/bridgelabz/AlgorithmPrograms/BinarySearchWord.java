package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {

    public static int binarySearch(String[] words, String searchWord) {

        int left = 0;
        int right = words.length;

        while (left < right) {
            int mid = (left + right) / 2;
            int search = searchWord.compareTo(words[mid]);

            if (searchWord.compareTo(words[mid]) < 0) {
                right = mid;    // search right half
            } else if (searchWord.compareTo(words[mid]) > 0) {
                left = mid +1 ;  // search left half
            } else {
               return mid;
            }
        }
        return -1;  // word not found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = "welcome to java";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("Enter the search word : ");
        String searchWord = scanner.next();

        int indexValue = binarySearch(words,searchWord);
        if (indexValue == -1)
            System.out.println("Word is not Found");
        else
            System.out.println("Word is Found");
    }
}
