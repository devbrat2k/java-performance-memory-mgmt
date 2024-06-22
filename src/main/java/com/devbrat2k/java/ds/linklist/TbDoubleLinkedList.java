package com.devbrat2k.java.ds.linklist;

public class TbDoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int capacity;
    private int size;

    public TbDoubleLinkedList() {
        this.capacity = 16;
    }
    public TbDoubleLinkedList(int size) {
        this.capacity = size;
    }

    public void push(T data) {
        if(size == capacity) {
            throw new RuntimeException("MyLinkedList is full. Capacity :" + capacity + " Size :" + size);
        }
        Node<T> node = createNode(data);
        if(head != null) {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        } else {
            head = node;
            tail = node;
        }
        size++;
    }

    /** Get the top element & remove it.*/
    public T pop() {
        return removeNode(tail);
    }
    /** Get the top element.*/
    public T top() {
        if(head == null) {
            return  null;
        } else {
            return tail.getData();
        }
    }

    public void insert(T data, int index) {
        if(size == capacity) {
            throw new RuntimeException("MyLinkedList is full.");
        }
        if(index >= size) {
            throw new RuntimeException("Wrong index provided for insertion, index value can not be greater than size : " + size);
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        insertBefore(node, data);
        size++;
    }

    public T remove(int index) {
        if(index >= size) {
            throw new RuntimeException("Wrong index provided for deletion, index value shd be less than size : " + size);
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return removeNode(node);
    }

    public int getSize() {
        return this.size;
    }
    private T removeNode(Node<T> node) {
        if(node == null) {
            return  null;
        }
        T data = node.getData();

        Node prev = node.getPrev();
        Node next = node.getNext();

        //its head node
        if(prev == null) {
            head = next;
            next.setPrev(null);
        }
        //its tail node
        if(next == null) {
            tail = prev;
            tail.setNext(null);
        } else {
            prev.setNext(node.getNext());
            next.setPrev(prev);
            node.setPrev(null);
            node.setNext(null);
        }

        size--;
        return data;
    }

    private void insertBefore(Node node, T data) {
        System.out.println("Insert = " + data + " before node : " + node);
        Node<T> nodeToBeInsert = createNode(data);
        nodeToBeInsert.setNext(node);
        Node prev = node.getPrev();
        node.setPrev(nodeToBeInsert);
        if (node == head) {
            head = nodeToBeInsert;
        } else {
            prev.setNext(nodeToBeInsert);
        }
    }

    /** Get the top element.*/
    private boolean hasNext(Node node) {
        return node == null ? false : node.getNext() != null;
    }

    private Node<T> createNode(T data) {
        return new Node<>(data);
    }

    @Override
    public String toString() {
       StringBuilder sb = new  StringBuilder(this.getClass().getSimpleName().concat(" Size : " + size + " ["));
       Node<T> node = head;
       if(head == null) {
           return sb.toString();
       }
       do {
           sb.append(node.toString());

           if(hasNext(node)) {
               sb.append(" -> ");
           }
           node = node.getNext();
       } while (node != null);
       return sb.append(" ]").toString();
    }
}
