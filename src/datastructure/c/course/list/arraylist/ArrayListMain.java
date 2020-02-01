/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.c.course.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shady.Salah
 */
public class ArrayListMain {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Number 1", "one", 1));
        employeeList.add(new Employee("Number 2 ", "two", 2));
        employeeList.add(new Employee("Number 3 ", "three", 3));
        employeeList.add(new Employee("Number 4 ", "four", 4));

        System.out.println("===============try to remove or moify element during for looping on Arraylist===============");
        System.out.println("============================================================================================");

        for (Employee employee : employeeList) {

            if (employee.getId() == 1) {
                // can't modify [add | remove] ArrayList during looping ==> java.util.ConcurrentModificationException  but Why ?!!
                // employeeList.add(new Employee("Number 1111", "111", 1111));
                // employeeList.remove(employee);
                // vertiual change [in any type of ArrayList]: change in value of item  will only during loop not in main object in ArrayList
                employee.setFirstName("YYYYYYYYYYYYYYYYYYYYYYYYYYYY");
            }
            System.out.println(employee);
        }
        System.out.println("===============get specific element from Arraylist===============");
        System.out.println("================================================================");

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        System.out.println("================update element that we haave it's index=====================================");
        System.out.println("============================================================================================");

        // updaete element
        employeeList.set(0, new Employee("AaA", "AaaaaA", 11));

        for (Employee employee : employeeList) {

            System.out.println(employee);
        }

        System.out.println(employeeList.size());

        System.out.println("================add element into specific index=====================================");
        System.out.println("====================================================================================");

        employeeList.add(3, new Employee("44", "444", 444));

        // employeeList.add(100, new Employee("44", "444", 444));
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 100, Size: 4
        // if we try to add element into specific index that not found in ArrayList
        for (Employee employee : employeeList) {

            System.out.println(employee);
        }

        System.out.println("================convert ArrayList to Array of Object =====================================");
        System.out.println("===========================================================================================");

        Object[] employeeArray1 = employeeList.toArray();

        for (Object employee : employeeArray1) {
            System.out.println(employee);
        }

        System.out.println("================convert ArrayList to Array of Employee =====================================");
        System.out.println("===========================================================================================");

        Employee[] employeeArray2 = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee : employeeArray2) {
            System.out.println(employee);
        }

        System.out.println("================try to check 'contains' specific element is founded or not =====================================");
        System.out.println("================================================================================================================");

        // if we don't implement equlse method for Employee ?
        // then contains method will check if the same exactlly instance.
        System.out.println(employeeList.contains(new Employee("Number 4 ", "four", 4)));

        System.out.println("================try to -search- find index of specific element=====================================");
        System.out.println("===================================================================================================");

        // if we don't implement equlse method for Employee ?
        // then indexOf method will not work well.
        System.out.println(employeeList.indexOf(new Employee("Number 4 ", "four", 4)));

        System.out.println("================removing element that we have it's index===========================================");
        System.out.println("===================================================================================================");

        employeeList.remove(3);

        for (Employee employee : employeeList) {

            System.out.println(employee);
        }
    }
}
