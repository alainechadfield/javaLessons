package lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
//        homeFiveOne();
       // homeFiveTwo();
//        homeFiveThree();
        //homeFiveFour();

        String a = "asfdeddeed";
        String b = "asfd123";

        int c = a.compareTo(b);
        if(c < 0){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //System.out.println("vvhjkk".compareTo("a") > 0);

    }
    //Домашка 5.1. сгенерируем массив из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
    //вывести на экран количество отрицательных кратных 3

    private static void homeFiveOne() {
        int[] randomArray = generateRandomArr(-20, 15, 7);
        System.out.println("array random" + Arrays.toString(randomArray));
        System.out.println(getCountNegative(randomArray));
        System.out.println(Arrays.toString(getNegativeCountThree(randomArray, getCountNegative(randomArray))));
    }

    private static int[] generateRandomArr(int from, int to, int count) {
        int[] arr = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i = i + 1) {
            int x = random.nextInt(to - from) + from;
            arr[i] = x;
        }
        return arr;
    }

    private static int getCountNegative(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] % 3 == 0) {
                x++;
            }
        }
        return x;
    }


    private static int[] getNegativeCountThree(int[] array, int negative) {
        int[] newArray = new int[negative];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] % 3 == 0) {
                newArray[x] = array[i];
                x++;
            }
        }
        return newArray;
    }


    //Домашка 5.2. сгенерируем массив arr5_2 из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
    // создать новый массив состоящий из элементов с чётными индексами сгенерированного массива arr5_2
    // дополнение: постараться сделать с помощью одного цикла

    private static void homeFiveTwo(){
       int[] newArray = generateRandomArr(-20,15,7);
        System.out.println("our array" + Arrays.toString(newArray));
        System.out.println("arrayGetIndexCountTwo" + Arrays.toString(getIndexCountTwo(newArray)));

    }

    private static int[] getIndexCountTwo(int[] array){
        int x = 0;
        int newSize = 0;
        if (array.length % 2 == 0) {
            newSize = array.length / 2;
        } else {
            newSize = (array.length+1) / 2;
        }

        //newSize = (array.length % 2 == 0) ? array.length / 2 : (array.length+1) / 2;
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                newArray[x] = array[i];
                x++;
            }
        }

        /*
        for (int i = 0, m = 0; i < array.length; i=i+2, m++){
                newArray[m] = array[i];
        }*/

        return newArray;
    }






    //Домашка 5.3. сгенерируем массив arr5_3 из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
    // найти минимальный элемент arr5_3 и вывести на экран

    private static void homeFiveThree() {
        int[] newArray = generateRandomArr(-20,15,7);
        System.out.println("my array is " + Arrays.toString(newArray));
        System.out.println("minimum number in the array " + getMinimum(newArray));
    }

    private static int getMinimum(int[] array){
        int minValue = array[0];
        //int numMin = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < minValue){
                //numMin = i;
                minValue = array[i];
            }
        }

//        int tmp = array[0];
//        array[0] = minValue;
//        array[numMin] = tmp;

        return minValue;
    }


    //Домашка 5.4. сгенерируем массив arr5_4 из 7 String'ов из случайных символов с кодами от 65 до 90
    // случайной длины от from до to
    // String[] generateRandomStrings(int from, int to)
    // найти самую коротку строку из arr5_4 и вывести её на экран
    // char c = 90;

    private static void homeFiveFour() {

        String[] stringArray = generateRandomStrings(7, 40, 25, 65);

        String shortest = findShortestString(stringArray);

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("#" + i + ": " + stringArray[i]);
        }

        System.out.println("Short: " + shortest);
    }

    private static String[] generateRandomStrings(int arraySize, int strLength, int charMin, int charMax) {
        String[] stringArray = new String[arraySize];

        for (int j = 0; j < stringArray.length; j++) {

            Random randomLenght = new Random();
            int stringLength = randomLenght.nextInt(strLength) + strLength;

            char[] stringChars = new char[stringLength];

            for (int i = 0; i < stringLength; i++) {
                Random randomChar = new Random();
                int charNumber = randomChar.nextInt(charMin) + charMax;
                char tempChar = (char)charNumber;
                stringChars[i] = tempChar;
            }

            stringArray[j] = new String(stringChars);
        }

        return stringArray;
    }

    private static String findShortestString(String[] array) {
        String result = array[0];

        for (int i = 0; i < array.length; i++) {
            if (result.length() > array[i].length()) {
                result = array[i];
            }
        }
        return result;
    }

    private static String findShortestForeach(String[] array) {
        String result = array[0];

        for (String anArray : array) {
            if (result.length() > anArray.length()) {
                result = anArray;
            }
        }
        return result;
    }

}
