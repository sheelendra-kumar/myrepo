package com.vishnu.question;

public class MaxMiniNumberArray {
    int arr[] = {1,2,3,4,5,6,7,8};

    public int miniValues(int arr[]) {
        int mini = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < mini) {
                mini = num;
            }
        }
        return mini;
    }

    public int maxValues(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxMiniNumberArray obj = new MaxMiniNumberArray();

        System.out.println("Minimum: " + obj.miniValues(obj.arr));
        System.out.println("Maximum: " + obj.maxValues(obj.arr));
    }
}