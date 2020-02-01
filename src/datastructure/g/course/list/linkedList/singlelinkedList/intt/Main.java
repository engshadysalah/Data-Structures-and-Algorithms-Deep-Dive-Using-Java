/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.g.course.list.linkedList.singlelinkedList.intt;

/**
 *
 * @author Shady.Salah
 */
public class Main {

    public static void main(String[] args) {

        IntLinkedList list = new IntLinkedList();

        System.out.println("isEmpty :: " + list.isEmpty());
//
        list.addToFront(0);
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        list.addToFront(4);

        System.out.println("getSize :: " + list.getSize());
        list.printList();

//        list.removeFromFront();
//        list.removeFromFront();
//        list.addToEnd(100);
//        System.out.println("\ngetSize :: " + list.getSize());
        System.out.println();
//        list.addAtPosition(100, 2);

//        list.removeFromEnd();
        list.removeAtPosition(3);
        list.printList();

    }
}
