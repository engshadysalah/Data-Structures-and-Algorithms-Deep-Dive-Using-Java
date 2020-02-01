/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.i.course.Queue;

/**
 *
 * @author Shady.Salah
 *   Number (6)
 */
public class QueueInfo {

    /*
     1: Queue know as abstract data type.
     2: it dosen't allaow us , how data should be stored ? && it don't care how the data is organized ? but descripe te wayt that you can access the data.
     3: FIFO : first in , first out.
     4: That mean : stack don't allow random access ==> liks: give me element with postion 5.
     5: it's like Line Apes so it's called Queue.
     6: add 1 ,2, 3 => to remove elements we'll remove 1 then 2 then 3 [FIFO]
     
     7: Three main operation :
     add : add item to queue .
     Vs 
     remove : remove the the first element from queue.
     Vs 
     peek: get the first item on the stack without popping it.
    
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
    
    
     => imp of Queue JDK . . .
    
     - DoubleLinkedList is perfect to Queue. [becouse it can add the item from the tail and remove item to front.]
     - add , remove , peek
    
     - add() : throw Exception if we can't add item.
     - offer() boolean (return true if u can added& other wise):  insert specific element into this queue if it possible, without violation capacity restications.
    
     - remove() : retrive and remove the head element of the Quqeue & throw execption"NoSuchElementExecption" if Queue is Empty.
     - poll() : retrive and remove the head element of the Quqeue & return null if Queue is Empty.

     -element: throw exception if we cant get the head element.
     -peek: return specifc value if we can't return the head element
    
    
    
     <=>Implemention Classes for Queue:
    
    
     0: AbestractQueue 
     - if we need customize , we implement AbestractQueue and overide the methods.
    
    
     1: LinkedList
    
    
     => concurrent programming :  [means can be use in multibale threads]
     2: ArrayBlockingQueue : 
     - exstends AbetractQueue implments BlockingQueue, searializable
     - imp for Queue interface [works as FIFO]
     - it's concurrent programming.
     - fixed size like Array
     - if thread add elemet to full ArrayBlockingQueue , it will be blocked , unail another thread come to take element out the Queue.
     - if thread try to remove element from empty ArrayBlockingQueue , it will be blocked , unail another thread come to add element out the Queue.
     - Example for use it : (Throw network) Producer add message to queue and Consumer get this message and remove it from the Queue . . . 
   
    
     3:  ConcurrentLinkedQueue :
     - exstends AbetractQueue implments Queue , searializable
     - imp for Queue interface [works as FIFO]
     - it's concurrent programming.
     - Unbounded [[thread safe]] Queue based on LinkedNode
     - efficient non-blocking algrothim
     - unLike most collections, the size NOT contant time operation, Because it can access by multible threads
    
    
     <=> SubInturfaces of Queue.
    
     1: Deque
     - Linnear collection that support element insertion & removle at both ends. 
     - Deque is short for Duble ended queue.
     - usually pronounced  as "deck"
     - has implmenation to know (how works as head & tails)
    
    
     => implmentaon for DQueue
     1: ArrayDeque : Resizable array implementaion for DQueue.
     
    
    */
}
