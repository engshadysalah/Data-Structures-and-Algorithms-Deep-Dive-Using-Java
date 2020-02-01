/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.e.course.list.linkedList.doublelinkedList.employee;

/**
 *
 * @author Shady.Salah
 */
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

        System.out.println("isEmpty :: " + list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(joneDoe);
        list.addToFront(marySmith);
        list.addToFront(wikeWilson);

        System.out.println("size :: " + list.getSize());
        list.printList();

//        Employee billEnd = new Employee("Bill", "End", 78);
//        list.addToEnd(billEnd);
//
//        System.out.println("\n size :: " + list.getSize());
//        list.printList();
//        list.removeFromFront();
//        System.out.println("\n size :: " + list.getSize());
//        list.printList();
        //        list.removeFromFront();
//        System.out.println("\n size :: " + list.getSize());
//        list.printList();
        
        
        list.removeFromEnd();
        System.out.println("\n size :: " + list.getSize());
        list.printList();
    }
}
