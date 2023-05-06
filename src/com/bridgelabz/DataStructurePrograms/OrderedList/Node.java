package com.bridgelabz.DataStructurePrograms.OrderedList;

public class Node <T>{
  /*
   Initializing Data and Node using Generics
  */
    T data;
    Node<T> next;

    public Node() {
    }
    /*
       Parameter Constructor
     */
    public Node(T data) {
        this.data = data;
    }
}
