package com.practice.data_structures.linked_list;

class Node<T> {
    private T data;
    private Node next;

    Node() {
    }

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    T getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
