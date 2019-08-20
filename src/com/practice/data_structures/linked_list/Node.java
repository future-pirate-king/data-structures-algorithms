package com.practice.data_structures.linked_list;

class Node<T> {
    private T data;
    private Node next;
    private Node previous;

    Node() {
    }

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
