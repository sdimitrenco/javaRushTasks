package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int g = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, g);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int g ) {
        int [] arr = {a, b, c, d, g};

        int min = arr[0];

        for(int x = 0; x < arr.length; x++) {
            if(min > arr[x]) {
                min = arr[x];
            }
        }

        return min;

    }
}
