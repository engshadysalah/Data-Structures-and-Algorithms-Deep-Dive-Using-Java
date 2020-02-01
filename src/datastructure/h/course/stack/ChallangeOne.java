/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.h.course.stack;

import java.util.LinkedList;

/**
 *
 * @author Shady.Salah
 */
public class ChallangeOne {

    // using stack only : check plaindrome of string then revres the string & compare it with orgine string
    public static void main(String[] args) {

        // true
        System.out.println(checkkForPalindrome("abccba"));
        // true 
        System.out.println(checkkForPalindrome("Was it a car or a cat I saw?"));
        // true
        System.out.println(checkkForPalindrome("I did, did I?"));
        // false
        System.out.println(checkkForPalindrome("hello"));
        // true
        System.out.println(checkkForPalindrome("Don't nod"));
    }

    public static boolean checkkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();

        StringBuilder stringNoPunctuation = new StringBuilder(string.length());

        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {

            char c = lowerCase.charAt(i);

            if (c >= 'a' && c <= 'z') {

                stringNoPunctuation.append(c);
                stack.addFirst(c);
            }

        }

        StringBuilder reversedString = new StringBuilder(string.length());

        while (!stack.isEmpty()) {

            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
