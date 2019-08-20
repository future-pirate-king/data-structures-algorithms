package com.practice.data_structures.linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private int length = 0;

    DoublyLinkedList() {
        this.head = new Node<T>();
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value, null, null);

        if(isEmpty()) {
            head.setNext(node);
            node.setPrevious(head);
        } else {
            Node currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(node);
            node.setPrevious(currNode);
        }
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }
}
