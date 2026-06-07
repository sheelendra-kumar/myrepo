package com.vishnu.question;

public class MiniNumberArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int mini = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < mini){
                mini = num;
            }
        }
        System.out.println("Minimum Values in array : "+ mini);
    }
}
