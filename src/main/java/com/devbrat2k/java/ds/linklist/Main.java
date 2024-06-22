package com.devbrat2k.java.ds.linklist;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        TbDoubleLinkedList<Integer> linkedList = new TbDoubleLinkedList<>();
        IntStream.rangeClosed(1,10).forEach(linkedList :: push);
        System.out.println(linkedList);

        System.out.println("\n__________________linkedList.pop____________________________________________________ ");

        System.out.println("linkedList.pop() : " + linkedList.pop());

        System.out.println(linkedList);

        System.out.println("\n___________________________________linkedList.top________________________________________");
        System.out.println("linkedList.top() : " + linkedList.top());
        System.out.println(linkedList);

        System.out.println("\n _______________________linkedList.insert__________________________________________________");
        System.out.println(" linkedList.insert(15, 5) ");
        linkedList.insert(15, 5);
        System.out.println(linkedList);

        System.out.println("\n______________________________linkedList.insert at head__________________________________");
        System.out.println(" linkedList.insert(0, 0) ");
        linkedList.insert(0, 0);
        System.out.println(linkedList);

        System.out.println("\n_________________________linkedList.insert at tail _______________________________________");
        int indexMax = linkedList.getSize() - 1;
        System.out.println(" linkedList.insert(20," + indexMax + " ) ");
        linkedList.insert(20, indexMax);
        System.out.println(linkedList);

        System.out.println("\n__________________linkedList.remove___________________________________________");

        System.out.println(" linkedList.remove( 3)");
        linkedList.remove( 2);
        System.out.println(linkedList);
    }
}
