package lesson_5;

import java.util.Arrays;
import java.util.Random;

public class Lesson5 {

    static void varargs(String... args) {
        String[] arr = args;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        char c = 90;
        System.out.println(c);

//        varargs();
//        varargs("");
//        varargs("1", "agsd");
//        varargs("1", "agsd", "asf3");
//        varargs(args);

        //-------------------------------
        //Задание на уроке 5.1. сгенерируем массив целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
        //вывести на экран только положительные числа

        int[] array5_1 = generateRandomArr(-20, 15, 7);
        //System.out.println(array5_1.length);
        // System.out.println(Arrays.toString(array5_1));

//
//        for(int i=0; i<array5_1.length; i++){
//            if (array5_1[i] > 0){
//                System.out.println(array5_1[i]);
//            }
//        }


        //Задание на уроке 5.2. сгенерируем массив целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
        //создадим новый массив и запишем в новый массив только положительные числа
        //выведем с помощью Arrays.toString новый массив на экран
        int[] array5_2 = generateRandomArr(-20, 15, 7);
        System.out.println(Arrays.toString(array5_2));

        int countPositive = 0;
        for (int i = 0; i < array5_2.length; i++) {
            if (array5_2[i] > 0) {
                countPositive = countPositive + 1; //countPositive++
            }
        }
        System.out.println(countPositive);

        int[] newArray = new int[countPositive];
        int k = 0;
        for (int i = 0; i < array5_2.length; i++) {
          if (array5_2[i] > 0){
              newArray[k] = i;
              k++;
          }
        }
        System.out.println(Arrays.toString(newArray));


        //Домашка 5.1. сгенерируем массив из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
        //вывести на экран количество отрицательных кратных 3

        //Домашка 5.2. сгенерируем массив arr5_2 из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
        // создать новый массив состоящий из элементов с чётными индексами сгенерированного массива arr5_2
        // дополнение: постараться сделать с помощью одного цикла

        //Домашка 5.3. сгенерируем массив arr5_3 из 7 целых случайных чисел от -20 до 15 с помощью метода generateRandomArr
        // найти минимальный элемент arr5_3 и вывести на экран

        //Домашка 5.4. сгенерируем массив arr5_4 из 7 String'ов из случайных символов с кодами от 65 до 90
        // случайной длины от from до to
        // String[] generateRandomStrings(int from, int to)
        // найти самую коротку строку из arr5_4 и вывести её на экран
        // char c = 90;




    }

    private static int[] generateRandomArr(int from, int to, int count) {
        int[] arr = new int[count];
        Random random = new Random();

        for (
                int i = 0;
                i < count;
                i = i + 1/*i++; ++i*/
                ) {
            //for (int i = 0; i <= count -1; i++)
            int x = random.nextInt(to - from) + from;
            arr[i] = x;
        }
        return arr;

    }

}
