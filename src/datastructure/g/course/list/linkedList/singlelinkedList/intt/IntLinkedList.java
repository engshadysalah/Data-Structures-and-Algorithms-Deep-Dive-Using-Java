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
public class IntLinkedList {

    private IntNode head;
    private int size;

    public IntNode addToFront(int value) {

        IntNode node = new IntNode(value);

        node.setNext(head);

        head = node;

        size++;

        return node;
    }

    public IntNode addToEnd(int value) {

        IntNode node = new IntNode(value);

        if (head == null) {

            return node;
        }

        IntNode current = head;

        while (current.getNext() != null) {

            current = current.getNext();

        }
        current.setNext(node);

        size++;

        return node;
    }

    public IntNode addAtPosition(int value, int position) {

        IntNode newNode = new IntNode(value);

        if (head == null) {

            return newNode;

        } else if (position == 1) {

            return addToFront(value);

        } else if (position == size) {

            return addToEnd(value);
        }

        int count = 1;

        IntNode previous = head;
        while (count < position - 1) {

            previous = previous.getNext();
            count++;
        }

        IntNode current = previous.getNext();
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;

        return head;

    }

    public int getSize() {
        return size;
    }

    public void printList() {

        IntNode current = head;

        while (current != null) {

            System.out.print(current.getValue());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print(current);
    }

    public boolean isEmpty() {

        return head == null;
    }

    public IntNode removeFromFront() {

        IntNode removedNode = head;

        head = removedNode.getNext();

        size--;

        removedNode.setNext(null);

        return removedNode;
    }

    public IntNode removeFromEnd() {

        if (head == null) {
            return head;
        }

        IntNode last = head;
        IntNode previousOfLast = null;

        while (last.getNext() != null) {
            previousOfLast = last;
            last = last.getNext();
        }

        previousOfLast.setNext(null);

        size--;

        return previousOfLast.getNext();
    }

    public IntNode removeAtPosition(int position) {

        if (head == null) {

            return null;

        } else if (position == 1) {

            return removeFromFront();

        } else if (position == size) {

            return removeFromEnd();

        }

        int count = 1;

        IntNode previous = head;
        while (count < position - 1) {

            previous = previous.getNext();
            count++;
        }

        IntNode removedNode = previous.getNext();
        previous.setNext(removedNode.getNext());

        System.out.println("deleted node is : "+removedNode.getValue());
        size--;

        return head;

    }

}
