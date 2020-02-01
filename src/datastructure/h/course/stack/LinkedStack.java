/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.h.course.stack;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Shady.Salah
 */
public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {

        stack = new LinkedList<Employee>();
    }

    public void puch(Employee employee) {

        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {

        return stack.peek();
    }

    public boolean isEmpety() {

        return stack.isEmpty();
    }

    public void prientList() {

        ListIterator<Employee> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
