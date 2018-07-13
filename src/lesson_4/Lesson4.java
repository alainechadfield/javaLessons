package lesson_4;

import java.util.Random;

public class Lesson4 {

    public static void /* bub bububu */ main(String[] args) {

        int count = 20;
        int from = -10;
        int to = 15;
        int[] arr = generateRandomArr(from, to, count);

        printArr(arr);
        // printArr(generateRandomArr(from, to, count));

        //int[][][] twoDimensionsArr = new int[2][10][3];
        // System.out.println(twoDimensionsArr);

        printEvenElementsAndTheirIndexes(arr);

    }

     /*
     1.сделать метод int[] generateRandomArr(int from, int to, int count)
     2.сделать метод void printArr(int[] arr) выводящий массив на экран без использования класс Arrays
     3.сделать метод void printEvenElementsAndTheirIndexes(int[] arr)
      */

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

    private static void printArr(int[] arr) {
        for (
                int i = 0;
                i < arr.length;
                i++
                ) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");

    }

    private static void printEvenElementsAndTheirIndexes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + ": " + arr[i]);
            }
        }
    }

    private static int[] generateEvenArr(int from, int to, int count) {

        int[] arr = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i = i + 1) {

            int x = random.nextInt(to - from) + from;
            if (x % 2 != 0){
                x = x + 1;
            }
            arr[i] = x;
        }
        return arr;
    }

    /*
    1. Сделать метод, который создаёт массив и с помощью цикла while наполняет его
    случайными числами кратными 9. int[] generateArrMod9(int from, int to, int count) //mod = modulo operation

    2. делать метод который генерирует случайные числа и выводит их на экран, каждое с новой строки,
    если очередное сгенерированное чилос окажется больше кратным 7 то прекратить вывод
    void printRandomDigitUntilMod7(int from, int to)

    3. посмотреть как считать число с клавиатуры //Scanner или BufferedReader или что-нибудь ещё
    считать с клавиатуры число, удвоить его и вывести в консоль

    4. считать с клавиатуры 5 чисел, найти их сумму, произведение, среднее.

    */
}
