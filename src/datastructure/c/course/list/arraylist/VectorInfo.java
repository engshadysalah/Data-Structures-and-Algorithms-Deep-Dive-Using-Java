 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.c.course.list.arraylist;

import java.util.List;

/**
 *
 * @author Shady.Salah
 *   Number (3)
 */
public class VectorInfo {

    public static void main(String args[]) {

        /*

         - VectorInfo
         1:  Vector Class package : java.util.Vector;
         - public class VectorInfo<E> extends AbstractList<E>
         - implements List<E>, RandomAccess, Cloneable, java.io.Serializable {}
         - vector (since jdk 1.0) came befor ArrayList (since jdk 1.2)
         - vector is Synchronizegd (thread save) so  --> but ArrayList is unSynchronized so it's add to jdk
         - if a thred-safe implimentaion isn't needed , it's recomended to use ArrayList
         
         
         2: Vector is resizable array implementaion of the List interface.

    
        
         4: Cabacity Vs Size :
         - Cabacity is the maximum number of items that the list can holed before resize the array.
         - Size :  is the number of elements that acutally are in the arraylist.
         - new VectorInfo() : inital capacity is 10.
        
         ==> it's an ordered collections - sequance - 

         */
        List<Employee> employeeVector = new java.util.Vector<>();
        employeeVector.add(new Employee("Number 1", "one", 1));
        employeeVector.add(new Employee("Number 2 ", "two", 2));
        employeeVector.add(new Employee("Number 3 ", "three", 3));
        employeeVector.add(new Employee("Number 4 ", "four", 4));

        // so important :
        // try to see implimentaion of add method in ArrayList and VectorInfo
        // in VectorInfo it's public synchronized boolean add(E e){.....}
        // in ArrayList it's public  boolean add(E e){.....}
    }
}
