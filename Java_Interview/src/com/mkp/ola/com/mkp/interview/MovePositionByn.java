package com.mkp.interview;

import java.util.Scanner;

public class MovePositionByn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the number: ");
        sc = new Scanner(System.in);
        String number = sc.next();
        if (sc != null) {
            sc.close();
        }

        char[] strCharArray = number.toCharArray();
        char[] resultCharArray = new char[strCharArray.length];
        int strCharArrayIndex = strCharArray.length - 1;
        int resultCharArrayIndex = 0;
        for (int i = 0; i < strCharArray.length; i++) {
            resultCharArrayIndex = i + n;
            if (resultCharArrayIndex > strCharArrayIndex) {
                while (resultCharArrayIndex > strCharArrayIndex) {
                    resultCharArrayIndex = resultCharArrayIndex - strCharArray.length;
                }
                resultCharArray[i] = strCharArray[resultCharArrayIndex];
            } else {
                resultCharArray[i] = strCharArray[resultCharArrayIndex];
            }

        }
        System.out.println("Result: " + new StringBuilder().append(resultCharArray));
    }
}
