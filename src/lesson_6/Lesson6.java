package lesson_6;

import java.util.Random;

public class Lesson6 {

    //home work 6.1 Bubble sort. Сделать метод сортировки массива целых чисел пузырьком.

    public static void main(String[] args) {

        int a = 65;
        int b = 90;

        Random random = new Random();
        int x = random.nextInt(b - a) + a;
        char ch = (char) x;
        String s = "" + ch;
        System.out.println(s);

        String str = "";



        for(int i = 0; i < 10; i++){
            int z = random.nextInt(b - a) + a;
            char chr = (char) z;
            str += chr;
        }
        System.out.println(str);

    }
}
