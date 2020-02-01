/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.d.course.list.linkedList;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Shady.Salah
 *   Number (4)
 */
public class LinkedListJDKInfo {
    /*
     1:  LinkedList Class package : java.util.LinkedList;
     - public class LinkedList<E>  extends AbstractSequentialList<E>
     -  implements List<E>, Deque<E>, Cloneable, java.io.Serializable {}
    
     - public abstract class AbstractSequentialList<E> extends AbstractList<E> {

     */

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);

        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(joneDoe);
        list.addFirst(marySmith);
        list.addFirst(wikeWilson);

        Iterator iter = list.iterator();

        System.out.print("HEAD ->");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        // ======================================================
//        list.add(billEnd);
        list.addLast(billEnd);
        System.out.print("HEAD ->");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print("<=>");
        }
        System.out.print("null");

            // ======================================================
        list.removeFirst();
//         list.removeLast();
//         list.remove(); // remove the first
        System.out.print("HEAD ->");
        for (Employee employee : list) {
            System.out.print(employee);
            System.out.print("<=>");
        }
        System.out.print("null");
    }
}
