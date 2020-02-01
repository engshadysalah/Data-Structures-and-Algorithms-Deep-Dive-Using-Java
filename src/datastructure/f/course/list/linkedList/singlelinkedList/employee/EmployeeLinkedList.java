/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.f.course.list.linkedList.singlelinkedList.employee;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.EmployeeNode;
import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;

/**
 *
 * @author Shady.Salah
 */
public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    /*
    
     Insert:
     1: create a new node 'Bill'
     2: assigne 'Jane' to next field. || assigne mean make be 'head' -secound field- next filed for 'Bill'. 
     3: assigne head to 'Bill'
     4: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
    
     */
    public void addToFront(Employee employee) {

        // 1: create a new node 'Bill'
        EmployeeNode node = new EmployeeNode(employee);

        //2: the current head will be the secound element in the list.
        node.setNext(head);

        // 3: assigne head to 'Bill'
        head = node;

        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {

      /*  if (size == 0) {

            return true;
        }

        return false;*/
        
        
        return head==null;
    }

    public void printList() {

        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {

            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print(" null ");
    }

    /* Delete:
     1: assigne 'Bill' to 'removedNode'.
     2: assigne head to 'Jane'
     3: return the 'removedNode'
     */
    public EmployeeNode removeFromFront() {

        if(isEmpty()){
        
            return null;
        }
        
        EmployeeNode removedNode = head;

        head = removedNode.getNext();

        size--;
        
        removedNode.setNext(null);
        
        return removedNode;
    }
}
