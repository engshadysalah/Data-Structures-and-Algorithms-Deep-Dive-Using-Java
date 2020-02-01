/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.h.course.stack;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;

/**
 *
 * @author Shady.Salah
 */
public class LinkedStackMain {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);

        LinkedStack stack = new LinkedStack();
        stack.puch(janeJones);
        stack.puch(joneDoe);
        stack.puch(marySmith);
        stack.puch(wikeWilson);

//        stack.prientList();
//        System.out.println(stack.peek());
        System.out.println("Popped :: " + stack.pop());

        System.out.println(stack.peek());

    }
}
