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
public class IntNode {
    
    private int value;
    
    private IntNode next;

    public IntNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }
    
    
    
    
}
