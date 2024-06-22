package com.devbrat2k.java.ds.linklist;

public class Node<T> {
    private Node next;
    private Node prev;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Node getPrev() {
        return this.prev;
    }
    public Node getNext() {
        return this.next;
    }
    public T getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return new StringBuilder(this.getClass().getSimpleName()).append(" ").append(data).append(" ").toString();
    }
}
