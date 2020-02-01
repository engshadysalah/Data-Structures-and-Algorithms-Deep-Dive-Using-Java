/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.c.course.list.arraylist;

/**
 *
 * @author Shady.Salah
 *  Number (2)
 */
public class ArrayListInfo {

    public static void main(String args[]) {

        /*
        
         - ArrayList
        
         1:  ArrayList Class package : java.util.ArrayList;
         - public class ArrayList<E> extends AbstractList<E>
         - implements List<E>, RandomAccess, Cloneable, java.io.Serializable {}
         - ArrayList (since jdk 1.2) came after vector (since jdk 1.0)
         - ArrayList is Unsynchronized (not thread save)  but we can make it synchronize at creation time by  --> so it's add to jdk
         --> List list = Collections.synchronizedList(new ArrayList(...));
         -->if a thred-safe implimentaion isn't needed , it's recomended to use ArrayList else use Vector
        
         - it's goood for random access. =>  employeeList.get(1)
        
        
         2: ArrayList is resizable array implementaion of the List interface.
        
        
         3: bigO :
         - retrive:: (like Array retriving)
         - get(positionOfElement) then the bigO(1)  , it's good for itrator on it's element
         -->  so it is good for access element with specific index  =>   employeeList.get(3);
         -->  so it isn't  good for access element that you don't have it's index => bigO(n).
        
         - adding::
         -  add(element) then will be slow, increasing size by one.  The capacity will increase if needed with 50%. Always returns true.
         - 1,2: adding the element then will be slow specially in the begining or the middle: , becouse shifting the elements . bigO(n)
               -->  so it isn't good for add  =>   employeeList.add(3, new Employee("44", "444", 444)); || employeeList.add(new Employee("44", "444", 444));
         - 3: add element at the end: is O(1) but increasing size by one........

        
        -removing:: (like Array removing)
        - remove the element then will be slow specially in the begining or the middle , becouse when removing elemnts from ArrayList  , 
          we have to shift the remmings items to remove any empty space. bigO(n) && 
          
        - set removed object element with null for performance and carpage colllector remove it from memeory => bigO(1).
                -->  so it isn't good for remove  =>   employeeList.remove(3); && size will deacres with -1
        
                
        
         - find:: element then will be slow , bigO(n)  {will explained more in the future}
         -->  so it isn't good for search  
         => employeeList.indexOf(new Employee("Number", "four", 4))
         => employeeList.contains(new Employee("Number 4 ", "four", 4)
       
     
        
         4: Cabacity Vs Size :
         - Cabacity is the maximum number of items that the list can holed before resize the array.
         - Size :  is the number of elements that acutally are in the arraylist.
         - new ArrayList() : inital capacity is 10.
        
        
        Note: The default initial capacity of an ArrayList is pretty small. 
        It is a good habit to construct the ArrayList with a higher initial capacity. 
        This can avoid the resizing cost. 
        
        
         ==> an ordered sequence of elements that maintains the elements in insertion order.
         */
    }
}
