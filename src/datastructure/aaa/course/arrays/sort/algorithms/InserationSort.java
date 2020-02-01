/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.aaa.course.arrays.sort.algorithms;

/**
 *
 * @author Shady.Salah ( number 4 )
 */
public class InserationSort {

    public static void main(String args[]) {

// based on shifting
        int intArray[] = {20, 35, -15, 7, 55, 1, -22};

        for (int firtstUnsortedIndex = 0; firtstUnsortedIndex < intArray.length; firtstUnsortedIndex++) {

            int newElement = intArray[firtstUnsortedIndex];
            int i;
            for (i = firtstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {

                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        
        
        

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        /*
         - inplace Algorith
         - O(n^2)
         - stable aglorithm
         */
    }

    static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
