package com.bridgelabz.DataStructurePrograms.BankCashCounter;

public class Queue<T>{

    LinkedList<T> linkedList = new LinkedList<>();

    public T dequeue() {
        /*
           Dequeue is deleting the first element
         */
        return linkedList.pop();
    }


    public void enqueue(T data) {
        /*
        Adding the nodes into Queue using Linked list
         */
        linkedList.append(data);
    }
    public void peek() {
        /*
         * Peek returns the top item but does not remove it.
         * First Element is popped and pushed to the same linkedList.
         */
        Integer peekedData = (Integer) linkedList.pop();
        System.out.println("Peek Element is "+peekedData);
        linkedList.push((T)peekedData);
    }

    public void display() {
        /*
        Display the Queue in LinkedList
         */
        linkedList.display();
    }

}
