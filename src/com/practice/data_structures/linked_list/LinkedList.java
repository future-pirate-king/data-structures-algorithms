package com.practice.data_structures.linked_list;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = new Node<T>();
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value, null);

        if(isEmpty()) {
            head.setNext(node);
        } else {
            Node currNode = head;
            while(currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(node);
        }
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public String toString() {
        Node<T> currNode = head;
        StringBuilder str = new StringBuilder();
        str.append("head");
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            str.append(" -> ").append(currNode.getData());
        }
        return str.toString();
    }
}
