/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.m.course.hashtable.chalang2;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Shady.Salah 
 * remove duplicates elements from linkedList by using
 * hashMap.
 *
 */
public class Challange2 {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("Jone", "Doe", 456));
        employees.add(new Employee("Mary", "Smith", 22));
        employees.add(new Employee("Wike", "Wilson", 3245));
        employees.add(new Employee("Jane", "Jones", 123));

        System.out.println(employees);

        ListIterator<Employee> iterator = employees.listIterator();
        HashMap<Integer, Employee> hm = new HashMap<>();
        List<Employee> dublicatedEmployees = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (hm.containsKey(employee.getId())) {
                dublicatedEmployees.add(employee);
            } else {
                hm.put(employee.getId(), employee);
            }
        }

        for (Employee em : dublicatedEmployees) {
            employees.remove(em);
        }

        System.out.println(employees);

    }
}
