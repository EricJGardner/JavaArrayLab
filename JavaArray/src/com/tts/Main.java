package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //First part of assignment to write a program that gives the sum of all values in an array
        int[] arr = {1, 2, 3, 6, 5, 3, 6};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of array is: " + sum);

        //Second part to run the following code to get the result as 2
        double[] exampleArray = {1, 5, 6, 5, 1};
        double maximum = exampleArray[0];
        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index);

        //Third part, write a static method "toPower" that takes in as parameters two integers called size
        //and power. Method should return an array of size "size" with each index raised to the value of "power."
// So, for example, if we passed in "size = 4"and "power = 2", the method should return [0,1,4.9]
        double[] result = toPower(4, 2);
        System.out.println(Arrays.toString(result));
    }
    public static double[] toPower(int size, int power){
        double[] result = new double[size];
            for(int i = 0; i < size; i++) {
                result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
            }
            return result;
//wrong kind of toPower method, d'oh!
//        double result = toPower(4, 2);
//        System.out.println(result);
//;    }
//    public static double toPower(int size, int power){
//        System.out.println(Math.pow(size, power));
//        return Math.pow(size, power);

    }
}
