/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.j.course.hashtable;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Shady.Salah
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee joneDoe = new Employee("Jone", "Doe", 456);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee wikeWilson = new Employee("Wike", "Wilson", 3245);

        HashMap<String, Employee> hm = new HashMap<String, Employee>();

        hm.put("Jones", janeJones);
        hm.put("Doe", joneDoe);
        hm.put("Smith", marySmith);
        hm.put("Wilson", wikeWilson);

        Iterator<Employee> employees = hm.values().iterator();

        while (employees.hasNext()) {
            System.out.println(employees.next());

        }

//        hm.forEach((k,v)->System.out.println("Key = "+k+"  v = "+v));
        
        
//        System.out.println(hm.containsKey("Doe"));    
//        System.out.println(hm.containsValue(wikeWilson));
        
        
        /*
         3: can't contain duplicate keys, each key can map to at most one value. that means there 's no collision.
         => if we duplicate ket , the secand will be replaced with the first.
         */
//        Employee employee=hm.put("Doe", wikeWilson);
        
        
        // add it if key not used befor
         Employee employee = hm.putIfAbsent("Doe", wikeWilson);

         System.out.println("get Smith : "+hm.get("Smith"));
         
//         hm.getOrDefault(hm, employee);
         
         hm.remove("Smith");//remove if it found
         // VS ??!!
//       boolean isRemoved =  hm.remove(hm, args) 
         
         
//         hm.replace(null, employee)
//         VS ??!!
//         hm.replace(null, employee, employee)
         
         
        Iterator<Employee> employees2 = hm.values().iterator();

        while (employees2.hasNext()) {
            System.out.println(employees2.next());

        }

        
        // take alook on java hashmap doc of oracle  
    }
}
