/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.e.course.list.linkedList.doublelinkedList.employee;

/**
 *
 * @author Shady.Salah
 * Number (4.2)
 */
public class DoubleLinkedListInfo {

    /*
        
     - it's a data struchure sequanctial list of objects - ordered collections - sequance - 
        
     - each item in likedlist called node && first item is the head of list and last element in the list is the tail fo the list.
     -> it's double list because : each node has only 2 links -references- to next and prvious nodes.
    
     - each item in likedlist has prvious and next links to to fields.
     -> so the difference between linkedlist and arraylist or others list is 
     -> in other list wee have to stor integer values but in linked list we have to stor integers values and 2 referance to next and prvious nodes
        


        
        
     - LikedList
  
     0: using it is dpends on your App;
     1: best use if need to add or remove element from font or the end of list.
     2: bad use if you need random access or work with the node in middle of the list.
     --> so we 'll reverse the list from head to tail to finde the node and  worst case is linear operation.
     3: disadvantge : not good for memory becouse each node [has value and 2 referance] are stored.
    
    
     Insert at head:
     1: create a new node 'Bill'
     2: assigne 'Jane' to next field. || assigne mean make 'jane' links to next filed. 
     =>3: assigne what ever 'Jane' is pointing to as prvious to 'Bill' 's prvious field.
     =>4: assign 'Bill' to 'Jane' prvious
     5: assigne head to 'Bill'
     6: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
       
    
     Insert at tail:
     1: create a new node 'Bill'
     2: assigne 'tail' 's next to 'Bill' 's next field. 
     3: assign 'tail' to 'Bill' 's prvious field.
     4: assign 'tail' 's next to 'Bill' Field.
     5: assigne 'tail' to 'Bill'
     6: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
       
    
    
     Delete from head:
     1: assigne 'Jane' to 'removedNode'.
     =>2: assigne 'Jones' 's pervios field to 'Jane' 's prvious field.
     =>3: assigne head to 'Jones' 's pervios field.
     4: returned removed node from the method.
     5: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
        
     
     Delete from tail:
     1: assigne 'tail' to 'removedNode'.
     =>2: assigne 'mike' 's next field to 'tail' 's next field.
     =>3: assigne tail to 'Bill' 's pervios field.
     4: returned removed node from the method.
     5: BigO : O(1) time complixty. (it dosen't depends on the number of elements).
        
  
    
     Insert A node between B and C .
     1: assign A's as a next field to B's next field.
     2: assigne A's as prvious field to C's previos field.
     3: assigne B's  next field to A.
     4: assigne C's as previous to A.
     5: BigO : O(1) time complixty. but we have to find the insertion position fiirst , so this is acutally o(n)

    
     */
}
