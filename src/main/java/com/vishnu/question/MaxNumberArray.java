package com.vishnu.question;

public class MaxNumberArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum Values in Array : " +max);
    }
}
