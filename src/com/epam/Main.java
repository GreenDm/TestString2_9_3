package com.epam;

import java.util.Arrays;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(uniqueChars("Hello people fo Earth")));

    }
    public static char[] uniqueChars(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char a : arr) {

            int com = 0;
            for (char b : arr) {
                if (a == b) {
                    com++;
                }
            }
            if (com == 1) {
                sb.append(a);
            }
        }
        return sb.toString().toCharArray();
    }



}
