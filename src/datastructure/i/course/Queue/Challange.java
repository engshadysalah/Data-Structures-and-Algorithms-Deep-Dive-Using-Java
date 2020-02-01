/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.i.course.Queue;

import java.util.LinkedList;

/**
 *
 * @author Shady.Salah
 */
public class Challange {

    // using stack and queue together : check plaindrome of string then revres the string & compare it with orgine string
    // using queue only : check plaindrome of string then revres the string & compare it with orgine string
    public static void main(String[] args) {

        // true
        System.out.println(checkkForPalindromeByQueue("abccba"));
        // true 
        System.out.println(checkkForPalindromeByQueue("Was it a car or a cat I saw?"));
        // true
        System.out.println(checkkForPalindromeByQueue("I did, did I?"));
        // false
        System.out.println(checkkForPalindromeByQueue("hello"));
        // true
        System.out.println(checkkForPalindromeByQueue("Don't nod"));

    }

    // using stack and queue together :
    static boolean checkkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {

            char c = lowerCase.charAt(i);

            if (c >= 'a' && c <= 'z') {

                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {

            if (!stack.pop().equals(queue.removeFirst())) {

                return false;
            }
        }

        return true;
    }

    // using queue only :
    static boolean checkkForPalindromeByQueue(String string) {

        LinkedList<Character> queue = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());

        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {

            char c = lowerCase.charAt(i);

            if (c >= 'a' && c <= 'z') {

                stringNoPunctuation.append(c);
                queue.addLast(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(string.length());

        while (!queue.isEmpty()) {

            reversedString.append(queue.removeFirst());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

}
