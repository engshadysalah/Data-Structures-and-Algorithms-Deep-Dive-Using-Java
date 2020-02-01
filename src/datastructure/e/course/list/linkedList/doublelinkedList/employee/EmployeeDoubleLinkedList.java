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
public class EmployeeDoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    /*
    
     Insert at head:
     1: create a new node 'Bill'
     2: assigne 'Jane' to next field. || assigne mean make 'jane' links to next filed. 
     =>3: assigne what ever 'Jane' is pointing to as prvious to 'Bill' 's prvious field.
     =>4: assign 'Bill' to 'Jane' prvious
     5: assigne head to 'Bill'
     6: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
    
     */
    public void addToFront(Employee employee) {

        // 1: create a new node 'Bill'
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            //2: the current head will be the secound element in the list.
            node.setNext(head);
            //4:
            head.setPrevious(node);
        }

        // 5: assigne head to 'Bill'
        head = node;

        size++;
    }

    /*        
     Insert at tail:
     1: create a new node 'Bill'
     2: assigne 'tail' 's next to 'Bill' 's next field. 
     3: assign 'tail' to 'Bill' 's prvious field.
     4: assign 'tail' 's next to 'Bill' Field.
     5: assigne 'tail' to 'Bill'
     6: BigO : O(1) time complixty. (it dosen't depends on the number of elements).    
     */
    public void addToEnd(Employee employee) {

        // 1: create a new node 'Bill'
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            tail = head.getNext();
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
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
        return head == null;
    }

    public void printList() {

        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {

            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.print(" null ");
    }

    /*
     Delete from head:
     1: assigne 'Jane' to 'removedNode'.
     =>2: assigne 'Jones' 's pervios field to 'Jane' 's prvious field.
     =>3: assigne head to 'Jones' 's pervios field.
     4: returned removed node from the method.
     5: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
     */
    public EmployeeNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = removedNode.getNext();

        size--;

        removedNode.setNext(null);

        return removedNode;
    }

    /*
     Delete from tail:
     1: assigne 'tail' to 'removedNode'.
     =>2: assigne 'mike' 's next field to 'tail' 's next field.
     =>3: assigne tail to 'Bill' 's pervios field.
     4: returned removed node from the method.
     5: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
     */
    public EmployeeNode removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();

        size--;

        removedNode.setPrevious(null);

        return removedNode;
    }

    public EmployeeNode addBefore(EmployeeNode node, int position) {

        int count = 1;

        EmployeeNode previous = head;
        while (count < position - 1) {

            previous = previous.getNext();
            count++;
        }

        node.setNext(previous.getNext());
        node.setPrevious(previous);

        previous.setNext(node);

        size++;

        return node;
    }
}
