package org.justice1k.datastructures.LinkedList;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
    }

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
