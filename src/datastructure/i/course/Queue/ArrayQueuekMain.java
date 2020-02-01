/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.i.course.Queue;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;

/**
 *
 * @author Shady.Salah
 */
public class ArrayQueuekMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);
        Employee bill = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(joneDoe);
        queue.add(marySmith);
        queue.add(wikeWilson);
        queue.add(bill);

//        queue.printQueue();
//        System.out.println(queue.peek());
//        System.out.println("Popped :: " + queue.remove());
        System.out.println(queue.peek());

        queue.printQueue();

    }
}
