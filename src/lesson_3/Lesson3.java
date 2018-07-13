package lesson_3;

import java.util.Arrays;
import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {


        int[] arr;
        arr = new int[15];
        System.out.println(arr[0]);
        int i = arr[14];
        System.out.println(i);

        String[] arrStrings;
        arrStrings = new String[3];
        System.out.println("" + arrStrings[1] + " " + arrStrings[2]);

        int l = arrStrings.length;
        boolean[] arrBooleans = new boolean[l];
        System.out.println(arrBooleans[arrBooleans.length-1]);

        int[] arrTest;
        arrTest = new int[10];
        arrTest[0] = 50;
        arrTest[1] = 60;
        arrTest[2] = new java.util.Random().nextInt(100);

        System.out.println(Arrays.toString(arrTest));

        int r = new java.util.Random().nextInt();//random value


    }


}
