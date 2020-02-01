/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.aa.course.arrays;

/**
 *
 * @author Shady.Salah ( Number 2 )
 */
public class ArraysInJava {

    public static void main(String args[]) {

        int intArray[] = new int[7];

        /*
         1: Arrays is not dinamic data stucture that mean once you create Array instsance you can't change it's size .
         2: remember : it's slots index : from 0 to n-1 ==> from 0 to 6
         */
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
    }
}
