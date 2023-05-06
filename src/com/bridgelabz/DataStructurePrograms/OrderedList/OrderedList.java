package com.bridgelabz.DataStructurePrograms.OrderedList;

import java.util.Arrays;
import java.util.Scanner;

public class OrderedList {
    public static void main(String[] args) {

        SortedLinkedList<Integer >sortedLinkedList = new SortedLinkedList<>();
        /*
        Read a list of numbers from a file
         */
        int [] numbers = {25,12,8,20,15,10};
        System.out.println(Arrays.toString(numbers));
        /*
        * Elements in the Array is added to the linkedList.
        * Sorted the linkedList.
         */
        for (int i=0; i<numbers.length; i++)
            sortedLinkedList.add(numbers[i]);
        sortedLinkedList.sortedList();
        sortedLinkedList.display();
        /*
        * when the checkNumber is found in the linkedList,then remove the number from the linked list.
        * when it is not found, then insert it to the sorted linkedList.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether is present or not : ");
        int checkNumber = scanner.nextInt();

        Node<Integer> searchData = sortedLinkedList.search(checkNumber);
        if (searchData == null) {
            System.out.println("Element is NOT Found.");
            sortedLinkedList.add(checkNumber);
            sortedLinkedList.sortedList();
            System.out.println("New Element is inserted to the sorted linkedList :-");
            sortedLinkedList.display();
        } else {
            System.out.println("Element is FOUND.");
            sortedLinkedList.delete(checkNumber);
            System.out.println("Element is Popped from the LinkedList :-");
            sortedLinkedList.display();
        }
    }
}
