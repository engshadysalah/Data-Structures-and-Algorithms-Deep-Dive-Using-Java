/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.aaa.course.arrays.sort.algorithms;

/**
 *
 * @author Shady.Salah ( number 2 )
 */
public class BubbleSort {

    public static void main(String args[]) {

        int intArray[] = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {

                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }

        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        /*
         O(n^2)
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
