package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        /*
         * Read the list of Integers in an Array using scanner
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        /*
         * enter the elements in the array using for loop
         */
        int [] array = new int[size];
        for (int i=0; i<size; i++) {
            System.out.println("Enter the element : ");
            array [i] = scanner.nextInt();
        }
        System.out.println("Print the elements in an array (Before Sorting):- ");
        //to String method is to return the string representation of the object.
        System.out.println(Arrays.toString(array));
        /*
         Sorting the Integers by using Bubble sort
         */
        int n = array.length;
        for (int i=0; i < n-1; i++) {
            for (int j=0; j < n-1; j++) {
                if (array[j] > array [j+1]) {   //Comparing between two elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        /*
        Printing the Sorting list
         */
        System.out.println("After Sorting :-");
        System.out.println(Arrays.toString(array));
    }
}
