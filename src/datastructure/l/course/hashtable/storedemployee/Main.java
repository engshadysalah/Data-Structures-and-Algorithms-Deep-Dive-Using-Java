/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.l.course.hashtable.storedemployee;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;

/**
 *
 * @author Shady.Salah
 */
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);

        SimpleHashTable ht = new SimpleHashTable();

        /* ht.add("Jones", janeJones);
         ht.add("Doe", joneDoe);
         ht.add("Smith", marySmith);
         ht.add("Wilson", wikeWilson);
         */
        ht.put("Jones", janeJones);
        ht.put("Doe", joneDoe);
        ht.put("Smith", marySmith);
        ht.put("Wilson", wikeWilson);

        ht.print();

//        System.out.println("Retive key Smith: " + ht.get("Smith"));
//        System.out.println("Retive key Wilson: " + ht.get("Wilson"));
        
        ht.remove("Wilson");
        ht.remove("Jones");
        
        ht.print();

    }
}
