/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.j.course.hashtable;

import datastructure.e.course.list.linkedList.doublelinkedList.employee.Employee;

/**
 *
 * @author Shady.Salah
 */
public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable() {
        hashTable = new Employee[10];
    }

    public void add(String key, Employee employee) {

        int hashKey = hashKey(key);

        if (hashTable[hashKey] != null) {
            // that mean there is a collission in case more than one key has the same length
            System.out.println("Sorry, There's allready an employee at the postion " + hashKey);
        } else {
            hashTable[hashKey] = employee;
        }

    }

    public Employee get(String key) {

        int hashKey = hashKey(key);

        return hashTable[hashKey];
    }

    // key can be any data type but hashed value is always int
    // in real the we can use the unique id as key so we don't need to hash it;
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void print() {

        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(hashTable[i]);
        }
    }

    //------------------------------------
    /*
     handel collsion :
     
     1: open addressing : look for other postion in case the postion is not empty.
     for ex : add "Smith" , it will be add in postion 5 but there is "Jones" that add before in postion 5
     so open addressing : look for onther postion to store "Smith"
    
    
     there are many ways to look for other postion:
    
     1: Linear Probing : we increament the hashed value by one.
     */
    private boolean isOccupied(int index) {

        return hashTable[index] != null;
    }

    public void put(String key, Employee employee) {

        int hashKey = hashKey(key);

        if (isOccupied(hashKey)) {

            int stopIndex = hashKey;

            if (hashKey == hashTable.length - 1) {

                hashKey = 0;

            } else {

                hashKey++;
            }

            while (isOccupied(hashKey) && hashKey != stopIndex) {

                hashKey = (hashKey + 1) % hashTable.length;
            }

        }

        if (isOccupied(hashKey)) {
            // that mean there is a collission in case more than one key has the same length
            System.out.println("Sorry, There's allready an employee at the postion " + hashKey);
        } else {
            hashTable[hashKey] = employee;
        }

    }
}
