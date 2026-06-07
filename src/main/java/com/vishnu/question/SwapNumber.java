package com.vishnu.question;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
}
