/**
 * 1165. Single-Row Keyboard
 *
 * There is a special keyboard with all keys in a single row.
 *
 * Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25).
 * Initially, your finger is at index 0. To type a character, you have to move your finger to the index of the desired
 * character. The time taken to move your finger from index i to index j is |i - j|.
 *
 * You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
 *
 * Example 1:
 *
 * Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
 * Output: 4
 * Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
 * Total time = 2 + 1 + 1 = 4.
 *
 * Example 2:
 *
 * Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
 * Output: 73
 *
 * Constraints:
 *
 * keyboard.length == 26
 * keyboard contains each English lowercase letter exactly once in some order.
 * 1 <= word.length <= 104
 * word[i] is an English lowercase letter.
 *
 * Test Case 1:
 * "abcdefghijklmnopqrstuvwxyz"
 * "cba"
 *
 * Test Case 2:
 *
 * "pqrstuvwxyzabcdefghijklmno"
 * "leetcode"
 */
package com.online.code.controller.easy;

import java.util.Scanner;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int res, temp;

        res = keyboard.indexOf(word.charAt(0));
        //System.out.println("key: "+keyboard.indexOf('a'));
        for(int i = 1; i < word.length(); i++) {
            temp = keyboard.indexOf(word.charAt(i-1)) - keyboard.indexOf(word.charAt(i));
            res += Math.abs(temp);
        }
        return res;

    }

    /*public static void main(String[] args) {

        SingleRowKeyboard srk = new SingleRowKeyboard();
        Scanner sc=new Scanner(System.in);
        String keyboard = sc.nextLine();
        String word = sc.nextLine();


        System.out.println(srk.calculateTime(keyboard, word));
    }*/
}
