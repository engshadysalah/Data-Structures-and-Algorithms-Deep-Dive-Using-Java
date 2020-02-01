/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.n.course.linearsearch.algorithm;

/**
 *
 * @author Shady.Salah
 */
public class LinearSearch {

    /*
     Linear Search Algorithm : 
    
     - the normaL search idea to find element.
     */
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -7};

        System.out.println(linearsearch(arr, -15));
        System.out.println(linearsearch(arr, 1));
        System.out.println(linearsearch(arr, 8888));
        System.out.println(linearsearch(arr, -22));

    }

    static int linearsearch(int[] arr, int value) {

        // find -15
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
