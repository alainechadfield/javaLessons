package lesson_3;

import sun.plugin.javascript.navig.Document;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class homework3 {
    public static void main(String[] args) {

        int[] arrAlex = alex2();
        // System.out.println(arrAlex[4]);
        System.out.println(Arrays.toString(arrAlex));
        System.out.println(Arrays.toString(alex3()));
        System.out.println(Arrays.toString(alex4()));
        // System.out.println(Arrays.toString(even()));
//        for (int i = 0; i < arrAlex.length; i++){
//            System.out.println(arrAlex[i]);
//        }
        System.out.println(Arrays.toString(even()));
    }


    private static int[] alex2() {
        int[] arrAlex20 = new int[20];
        for (int i = 0; i <= 19; i++) {
            arrAlex20[i] = new java.util.Random().nextInt(480) + -100;
        }
        return arrAlex20;
        //  System.out.println(Arrays.toString(arrAlex20));
    }


    private static int[] alex3() {
        int[] arrEven = new int[20];
        for (int i = 0; i < 20; i++) {
            arrEven[i] = ThreadLocalRandom.current().nextInt(20, 40);
        }
        return arrEven;
    }

    private static int[] alex4() {
        int[] arralex4 = new int[20];
        for (int i = 0; i < 20; i++) {
            arralex4[i] = ThreadLocalRandom.current().nextInt(-100, 380);
        }
        return arralex4;
    }

    private static int[] even() {
        int[] even = new int[20];

        for (int i = 0; i < 20; i++) {
            even[i] = new java.util.Random().nextInt(30);
        } return even;


    }


}
