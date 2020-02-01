/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.h.course.stack;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.EmptyStackException;

/**
 *
 * @author Shady.Salah
 */
public class ArrayStack {

    private Employee[] stack;

    // the top item of stack is located in stack[top-1]
    private int top;

    public ArrayStack(int capacity) {

        stack = new Employee[capacity];
    }

    public void puch(Employee employee) {

        if (top == stack.length) {

            // resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];

            System.arraycopy(stack, 0, newArray, 0, stack.length);

            stack = newArray;
        }

        stack[top++] = employee;

    }

    public Employee pop() {

        if (isEmpty()) {

            throw new EmptyStackException();
        }

        Employee removedEmployee = stack[--top];

        stack[top] = null;

        return removedEmployee;

    }

    public Employee peek() {

        if (isEmpty()) {

            throw new EmptyStackException();
        }

        return stack[top - 1];

    }

    public boolean isEmpty() {

        return top == 0;
    }

    public void printStack() {

        // print revrese
        for (int i = top - 1; i >= 0; i--) {

            System.out.println(stack[i]);
        }
    }


}
