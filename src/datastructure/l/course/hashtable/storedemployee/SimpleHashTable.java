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
public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    // key can be any data type but hashed value is always int
    // in real the we can use the unique id as key so we don't need to hash it;
    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void print() {

        for (int i = 0; i < hashTable.length; i++) {

            if (hashTable[i] == null) {

                System.out.println("empty");
            } else {
                System.out.println("employee at podtion " + i + ":" + hashTable[i].employee);
            }
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
            hashTable[hashKey] = new StoredEmployee(key, employee);
        }

    }

    public Employee get(String key) {

        int hashKey = findKey(key);

        if (hashKey == -1) {

            return null;
        }

        return hashTable[hashKey].employee;
    }

    private int findKey(String key) {

        int hashedKey = hashKey(key);

        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {

            return hashedKey;
        }

        int stopIndex = hashedKey;

        if (hashedKey == hashTable.length - 1) {

            hashedKey = 0;

        } else {

            hashedKey++;
        }

        while (hashedKey != stopIndex
                && hashTable[hashedKey] != null
                && !hashTable[hashedKey].key.equals(key)) {

            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] !=null && hashTable[hashedKey].key.equals(key)){
        
            return hashedKey;
        }else{
        
            return -1;
        }
    }
    
    public Employee remove(String key){
    
          int hashKey = findKey(key);

        if (hashKey == -1) {

            return null;
        }
        Employee employee = hashTable[hashKey].employee;
        
        hashTable[hashKey] = null;
        
        return employee;
    }
}
