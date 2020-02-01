/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.i.course.Queue;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.NoSuchElementException;

/**
 *
 * @author Shady.Salah
 */
public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {

        queue = new Employee[capacity];
    }

    public void add(Employee employee) {

        if (back == queue.length) {

            // resize the array
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove() {

        if (size() == 0) {

            throw new NoSuchElementException();
        }

        Employee removedElement = queue[front];

        queue[front] = null;

        front++;
        
          if (size() == 0) {

            front=0;
            back=0;
        }
        
        return removedElement;
    }

    public Employee peek() {

        if (size() == 0) {

            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {

        return back - front;
    }

    public void printQueue(){
    
        for (int i = front; i < back; i++) {
            
            System.out.println(queue[i]);
        }
    }
}
