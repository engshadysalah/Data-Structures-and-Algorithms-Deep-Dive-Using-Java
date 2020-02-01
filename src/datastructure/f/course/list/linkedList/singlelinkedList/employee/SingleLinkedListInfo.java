/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.f.course.list.linkedList.singlelinkedList.employee;

/**
 *
 * @author Shady.Salah
 * Number (4.1)
 */
public class SingleLinkedListInfo {

    /*
      1:  LinkedList Class package : java.util.LinkedList;
     - public class LinkedList<E>  extends AbstractSequentialList<E>
     -  implements List<E>, Deque<E>, Cloneable, java.io.Serializable {}
    
     - public abstract class AbstractSequentialList<E> extends AbstractList<E> {

                    
     - each item in likedlist called node  && first item is the head of list.
     -> it's single list becouse : each node has only one link -reference- to next node.

 
     - each item in likedlist has a link to the next item  in the list
     -> so the difference between linkedlist and arraylist or others list is 
     -> in other list we have to store integer values but in linked list we have to stor integers values and referance to next node
       
        
     - LikedList
  
     0: using it is dpends on your App;
     1: best use if need to add or remove element from font of list.
     2: bad use if you need random access or access the middle of the list.
     3: disadvantge : not good for memory becouse each node [has value and referance] are stored.
    
     4: LinkedList, however, also implements Deque interface which adds more methods than ArrayList and Vector, such as offer(), peek(), poll(), etc.  
    
    
     Insert:
     1: create a new node 'Bill'
     2: assigne 'Jane' to next field. || assigne mean make 'jane' links to next filed. 
     3: assigne head to 'Bill'
     4: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
        
     Delete:
     1: assigne 'Bill' to 'removedNode'.
     2: assigne head to 'Jane'
     3: return the 'removedNode'
     4: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
     
    
     ==> an ordered sequence of elements that maintains the elements in insertion order.
   
     */
}
