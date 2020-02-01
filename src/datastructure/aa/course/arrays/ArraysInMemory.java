/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.aa.course.arrays;

/**
 *
 * @author Shady.Salah  ( Number : 3 )
 */
public class ArraysInMemory {

    public static void main(String args[]) {

        /* Arrays
         1: Arrays is not dinamic data stucture that mean once you create Array instsance you can't change it's size .
         2: remember : it's slots index : from 0 to n-1 ==> from 0 to 6
         3: stored in memory as Contiguous block in memory. 
         4: every element occupies the same amount of of space in memory.
         5: clculate memory address : x + (i * y)  {x: memory address of started element in array , y : size of each element in array}
         6: if you know the index of element , the time to retrive the element will be the same , no matter where it is in array. 
         */
        int intArray[] = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Address of intArray[0] = 12
        // Address of intArray[1] = 12 + (1*4) = 16
        // Address of intArray[2] = 12 + (2*4) = 20
        // Address of intArray[3] = 12 + (3*4) = 24
        // Address of intArray[4] = 12 + (4*4) = 28
        // y : size of each element in array = 4 { integer is 4 byts }
    }
}
