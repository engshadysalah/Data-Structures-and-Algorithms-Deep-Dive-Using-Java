/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.b.course.list;

/**
 *
 * @author Shady.Salah Number (1)
 */
public class ListInformation {

    /*
       
     1: - List interface package : java.util.List;
     - public interface List<E> extends Collection<E> {}
     - public interface Collection<E> extends -interface- Iterable<E> {}


    
     2: -  it has many implimentaion likes : ArrayList , LinkedList , Vector , AbstractList  , AbstractSequentialList .
        -  AbstractList  , AbstractSequentialList : to create custom implementaion for List by extinding them and override thier methods ,
           if you have a custom behaviour.
    
    
     3: - List is: 
         -          an ordered sequence of elements  {{ it's an ordered collections - sequance - }}
         -          a type of ordered collection that maintains the elements in insertion order.
       
        1-          an ordered sequence of elements that maintains the elements in insertion order.
        2-          allows dublicates in elements.
        3-          allows positional access.
        4-          allows any number of null values.
        5-          can be inserted in both forward direction and backward direction using ListIterator.
    
        6-          use list for storing non-unique objects as per insertion order.

    
    VS
    
    
      4: - Set is: 
        1-          a distinct list of elements which is unordered.
        2-          doesn't allow dublicates in elements. [ Set should be unique if you try to insert the duplicate element in Set it would replace the existing value.]
        3-          doesn't allow positional access.
        4-          allow only one null value in its collection.
        5-          can be traversed only in forward direction with the help of iterator.
    
        6-          use set for storing unique objects in random order.
    
    
    
    
     5:  Abstract DataType like List : 
     - dosn't dicated how data is organized , we don't have a way to store elements in it in memory 
     - it is revers of array that stor all element as contigous block etc ...- .
     - dicates the operation that you can perform.  likes access , add , remove , get first element , get last element.
     - concret data structure like Array is usually a concret class.
     - Abstract DataType is usually an interface.

     */
}
