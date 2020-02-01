/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.c.course.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author root
 */
public class ArrayListMore {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.toArray(new String[5]);

        String s = new String("Shady");

        // add elements
        names.add("Shady");
        names.add("Ahmed");
        names.add("Bassem");
        names.add("Galal");
        names.add("Adam");
        names.add("Ahmed");

        System.out.println(names);

        names.add(1, "Mohamed");

        // Collections.sort(names);
        // remove element by index or value
        //  names.remove(1);
        // update element
        //  names.set(0, "Engineer"); // edit
        System.out.println(names);

        // search by value to check found or not
        System.out.println(names.contains(s));

        // search by value to get it's index
        System.out.println("indexOf :: " + names.indexOf("Ahmed"));

        // search by value to get it's index of
        System.out.println("lastIndexOf :: " + names.lastIndexOf("Ahmed"));

        // ?! mostafa note
        System.out.println(names.subList(0, 2));

        System.out.println("=========== Way(1) to get Items of ArrayList by Using For Loop =============================");

        /*
         in this case we can modifiy in list
         */
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if (name.equals("Shady")) {
                // names.remove(name);
            }
        }

        System.out.println("=========== Way(2) to get Items of ArrayList by Using Foreach Loop =============================");

        /*
         in this case we can not modifiy in list
         vertiual change [in any type of ArrayList]: change in value of item  
         will only during loop not in main object in ArrayList
         ::ConcurrentModificationException
         */
        for (String name : names) {
            if (name.equals("Mohamed")) {
                //names.remove(name);
                name = "XXXXXXXXXXXXxx";
            }
            System.out.println(name);
        }

        System.out.println("=========== Way(3) to get Items of ArrayList by Using Foreach in Java 8 ===========================");

//         names.forEach(System.out::println);
        System.out.println("=========== Way(44) to get Items of ArrayList by Iterator<String> =============================");

        /*
         in this case we can modifiy in list
         */
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
            if (iterator.next().equals("Shady")) {
                iterator.remove();
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=========== Way(4) to get Items of ArrayList by Using For ListIterator ======================");

        /*
         in this case we can modifiy in list
         */
        for (ListIterator<String> iterator = names.listIterator(1); iterator.hasNext();) {

            String next = iterator.next();

            if (next.equals("Bassem")) {
                iterator.remove();
            } else {
                System.out.println(next);
            }

        }

        System.out.println("=========== Way(5) to get Items of ArrayList by Using For ListIterator =======================");

        System.out.println(names.size());

        ListIterator<String> iterator = names.listIterator(names.size());

        /*
         in this case we can modifiy in list
         */
//        while (iterator.hasPrevious()) {
//            if (iterator.equals("Adam")) {
//             iterator.remove();
//            }
//            System.out.println(iterator);
//        }
        System.out.println("======== convert ArrayList to Array ==========================================================");

        String[] arr = new String[names.size()];

        names.toArray(arr); // convert list arr

        List<String> asList = Arrays.asList(arr); // convert arr to list

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

        System.out.println("===============================================================================================");

    }
}
