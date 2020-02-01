/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.o.course.binarysearch.algorithm;

/**
 *
 * @author Shady.Salah
 */
public class BinarySearch {
    /*
     Binary Search :
    
     1: Data Must be sorted. so if use array then u must sort it first.
     2: Chooses the midle element of array and compare it against the search value.
     3: if element is equal, we're done.
     4: if element is greater than the value, then search the left half of the array.
     5: if the element is less than the value, then search in the right half of array.
    
     6: can be implemented recursively.
     7: O(logn) => keeps dividing array in half.
    
     8: iterativeBinarySearch imp is better than recursiveBinarySearch
     becouse recursiveBinarySearch is usually more expensive becouse there is overhead involve with methos couse.
     
     */

    public static void main(String[] args) {

        int[] arr = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(arr, -15));
        System.out.println(iterativeBinarySearch(arr, 35));
        System.out.println(iterativeBinarySearch(arr, 8888));
        System.out.println(iterativeBinarySearch(arr, 1));

        System.out.println(recursiveBinarySearch(arr, -15));
        System.out.println(recursiveBinarySearch(arr, 35));
        System.out.println(recursiveBinarySearch(arr, 8888));
        System.out.println(recursiveBinarySearch(arr, 1));
      

    }

    static int iterativeBinarySearch(int[] input, int value) {

        int start = 0;
        int end = input.length;

        while (start < end) {
            int midPoint = (start + end) / 2;

            if (input[midPoint] == value) {

                return midPoint;
            } else if (input[midPoint] < value) {

                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }

        return -1;
    }

    static int recursiveBinarySearch(int[] input, int value) {

        return recursiveBinarySearch(input, 0, input.length, value);
    }

    static int recursiveBinarySearch(int[] input, int start, int end, int value) {

        // break or excite condition
        if (start >= end) {

            return -1;
        }

        int midPoint = (start + end) / 2;

        if (input[midPoint] == value) {
            return midPoint;

        } else if (input[midPoint] < value) {
            return recursiveBinarySearch(input, midPoint + 1, end, value);

        } else {
            return recursiveBinarySearch(input, start, midPoint, value);
        }
    }
}
