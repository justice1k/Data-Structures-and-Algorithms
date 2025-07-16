package org.justice1k.datastructures.LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

//  adding element to the end of the list
    public void add(T data){
        Node<T> newNode = new Node(data);
//      check if the element is the first to be in the list then make it the Head
        if(head == null){
            head = newNode;
            tail = head;
        }else {
//          if not the first element in the list, add it to the last element and update tail value
            tail.next = newNode;
            tail = newNode;
        }
        size += 1;
    }

//  adding element to a specific index
    public void add(int index, T data){
//      validate the index
        if(index > this.size || index < 0){
            throw new IndexOutOfBoundsException();
        }
//      if index is 0, make Data the head and assign the current head as Data's next value
        if(index == 0){
            head = new Node<>(data, head);
        }else{
//          assign the head to a temp variable and loop through the linked list from 0 to the node before the desired index
            Node<T> current = head;
            for(int i = 0; i < index -1; i++){
                current = current.next;
            }
//          assign the next value of the node before the desired index to Data and its next value to the node at our desired index
            current.next = new Node<>(data,current.next);
        }
        size += 1;
    }

    public int size(){
        return this.size;
    }



}
