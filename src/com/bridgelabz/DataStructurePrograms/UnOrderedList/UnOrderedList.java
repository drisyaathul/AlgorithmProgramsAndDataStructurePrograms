package com.bridgelabz.DataStructurePrograms.UnOrderedList;

import java.util.Arrays;
import java.util.Scanner;

public class UnOrderedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String string = "welcome to data structure problem";
        /*
         Split the sentence into words
         */
        String[] words = string.split(" ");
//        System.out.println(Arrays.toString(words));
        /*
         Arrange it as LinkedList
         */
        for (int i = 0; i < words.length; i++) {
            linkedList.append(words[i]);
        }
        linkedList.display();
        /*
         * Searching the word from the linkedList,
         * if the word is present then delete the word from the linkedList.
         * otherwise add the word to the linkedList.
         */
        System.out.println("Enter the word to check whether it is present or not :-");
        String word = scanner.next();

        Node <String> searchData = linkedList.search(word);
        if (searchData == null) {
            System.out.println("Word is NOT Found.");
            linkedList.append(word);
            System.out.println("New Word is added to the linkedList :-");
            linkedList.display();
        } else {
            System.out.println("Word is FOUND.");
            linkedList.delete(word);
            System.out.println("Word is Deleted from the LinkedList :-");
            linkedList.display();
        }
    }
}
