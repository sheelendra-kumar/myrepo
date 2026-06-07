package com.vishnu.question;

public class ReverseDigit {
    public static void main(String[] args) {
        int digit = 8645;
        int swap = 0;
        while (digit > 0){
            int num = digit % 10;
            swap = swap*10 + num;

           digit = digit/10;
        }
        System.out.println("Digit swap : "+swap);
    }
}
