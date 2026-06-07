package com.vishnu.question;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,4,5};

        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j < i; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Number : "+arr[i]);
                }
            }
        }
    }
}

