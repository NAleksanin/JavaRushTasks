package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }
//        int result = numberA > numberB ? numberA : numberB;
//        System.out.println(result);
        System.out.println(numberA > numberB ? numberA: numberB);
    }
}
