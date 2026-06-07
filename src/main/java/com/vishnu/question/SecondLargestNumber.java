package com.vishnu.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num != max) {
                       secondMax = num;
            }
        }
        System.out.println(secondMax);
    }

    static class SecondLargest {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};

            Optional<Integer> secondMax = Arrays.stream(arr)
                    .distinct()
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst();
//            System.out.println("Second Max : "+secondMax);

            secondMax.ifPresent(
                    val -> System.out.println("Second Largest: " + val)
            );
        }
    }
}
