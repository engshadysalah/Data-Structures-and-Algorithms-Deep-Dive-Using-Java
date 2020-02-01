/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.aa.course.arrays;

/**
 *
 * @author Shady.Salah ( Number : 4 )
 */
public class BigOForArray {

    public static void main(String args[]) {

        int intArray[] = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // we need to check if  number 7 is founded in array or not
        // Best Case VS Worst Case
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        // Best Case O(1)
        // Worst Case O(n)
        /*
         -------------------------------------------------------------------
    
         Big-O-Notaion :
    
        
        Operation                                       Time Complexity
        
        1: Retrive with index                             O(1) - Constant
            
        2: Retrive without index                          O(n) - Linear
        
        3: Add element to full array                      O(n)
        //remember :  Arrays is not dinamic data stucture that mean once you create Array instsance you can't change it's size .
        // so we can't add element to it but the only way for that is 
        // create new array with larger size then copy it to te new array and add new elements to it.
        
        
        4: Add element to end of array [has space]          O(1)
        
        5: insert or update element at specific index       O(1)

        6: delet element by setting it to null              O(1)
        
        7: delet element by shifiting element               O(n)
        
        
        */
    }
}
