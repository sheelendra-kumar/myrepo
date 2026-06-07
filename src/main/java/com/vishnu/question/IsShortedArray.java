package com.vishnu.question;

public class IsShortedArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,5};
        boolean isShorted = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1] ){
                isShorted = false;
            }
        }
        System.out.println(isShorted ?  "Array Shorted" : "Array Not Shorted ");
    }
}
