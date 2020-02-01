/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.h.course.stack;

/**
 *
 * @author Shady.Salah
 *   Number (5)
 */
public class StackInfo {

    /*
     1: Stack know as abstract data type.
     2: it dosen't allaow us , how data should be stored ? && it don't care how the data is organized ? but descripe te wayt that you can access the data.
     3: LIFO : last in , first out.
     4: That mean : stack don't allow random access ==> liks: give me element with postion 5.
     5: Top : we can just access only the element that at the top of stack.
     6: example : stack has 10 element , and we need to acces element number 1.
     then we'll remove the 9 elements from to first to get element number 10.
     
     7: Three main operation :
     push : add item to the stack .
     Vs 
     pop : remove the front item from the stack.
     Vs 
     peek: get the front item from the stack without popping it.
    
     8:ideal backing data structure for stack : is LinkedList => because it works well on the front element.
     but stack can be back by any data structure.
    
     9: Time Complisity : 
     - time complisity : O(1) for push , pop and peek when using LinkedList.
     - linear          : O(n) when using Array because the array may have to be resized if it full. 
     {because we don't know the maximum number of items thaqt will be added to it}
     
     - if we know the maximum nuber that will added on the stack , Array can be a good choice , because it fixed size and 'll be not resized.
     - if memory tight, Array might be a good chice , because within Array : no overhead & or having link to next field.
    
     - LinkedList is ideal : in cases [ memory isn't tight & don't know the maximum number of items ] 
    
    ---------------------------------------------------------------------------------------------------
    
    1 :
    - Stack extend Vector{}  with 5 operation that allow vector to be treated as a stack.
    - puch() , pop(), peek(), empty(), search() - to search stack for an item & discover how far it is from the top.
    - when stack is first creaated, it contains no items.
    - a more complete & consistent set of LIFO stack operation is provided by the Deque interface& its implmentaion 
       which should be use in preferenc to this class for Example : Deque<Integer> stack = new ArrayDeque<Integer>();
    - linkedList can be use as stack because it implments Deque interface that has { puch() , pop(), peek() }
    - custom imp to stack using linkedlist -LinkedStack- : it just implements  { puch() , pop(), peek() } to allow 
      the developers to use linkedlist as stack only. 
    
    
    
     */
}
