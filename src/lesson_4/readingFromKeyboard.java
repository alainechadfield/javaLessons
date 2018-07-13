package lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class readingFromKeyboard {
    static final String regex = "^-?[0.0-9.0]\\d*(\\.\\d+)?$";
    int from = -100;
    int to = 200;



    public static void main(String[] args) {



//        Scanner scanner = new Scanner(System.in);
//        double d = 0;
//        try {
//            d = Double.parseDouble(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Please enter the number only");
//            return;
//        }
//        d = d * 2;
//        System.out.println(d);

        //calculationTaskThree();
      //  calculationTaskFour();
        //System.out.println(Arrays.toString(taskFirstWhileCycle()));
       taskSecond(-100, 200);


    }

    /*3. посмотреть как считать число с клавиатуры //Scanner или BufferedReader или что-нибудь ещё
считать с клавиатуры число, удвоить его и вывести в консоль
*/

    private static void calculationTaskThree() {
        DecimalFormat df2 = new DecimalFormat(".##");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        if (firstNumber.matches(regex)) {
            double firstNum = Double.parseDouble(firstNumber);

            if (firstNum != 0 && firstNum > -50 && firstNum < 50) {
                double multiplication = firstNum * 2;

                System.out.println("The Number is: " + df2.format(firstNum) + " Their multiplication is: " + df2.format(multiplication));
            } else {
                System.out.println("The number should be between -50 till 50 and can't be 0");
            }

        } else {
            System.out.println("Please enter the number only");
        }
    }

/*
    4.считать с клавиатуры 5 чисел, найти их сумму, произведение, среднее.
*/

    private static void calculationTaskFour() {
        DecimalFormat df2 = new DecimalFormat(".##");
        Scanner firstN = new Scanner(System.in);
        String firstNumber = firstN.nextLine();

        Scanner secondN = new Scanner(System.in);
        String secondNumber = firstN.nextLine();

        Scanner thirdN = new Scanner(System.in);
        String thirdNumber = firstN.nextLine();

        Scanner forthN = new Scanner(System.in);
        String forthNumber = firstN.nextLine();

        Scanner fifthN = new Scanner(System.in);
        String fifthNumber = firstN.nextLine();


        if (firstNumber.matches("^-?[0.0-9.0]\\d*(\\.\\d+)?$") &&
                secondNumber.matches("^-?[0.0-9.0]\\d*(\\.\\d+)?$") &&
                thirdNumber.matches("^-?[0.0-9.0]\\d*(\\.\\d+)?$") &&
                forthNumber.matches("^-?[0.0-9.0]\\d*(\\.\\d+)?$") &&
                fifthNumber.matches("^-?[0.0-9.0]\\d*(\\.\\d+)?$")) {
            double firstNum = Double.parseDouble(firstNumber);
            double secondNum = Double.parseDouble(secondNumber);
            double thirdNum = Double.parseDouble(thirdNumber);
            double forthNum = Double.parseDouble(forthNumber);
            double fifthNum = Double.parseDouble(fifthNumber);

            if (firstNum != 0 && firstNum > -50 && firstNum < 50 &&
                    secondNum != 0 && secondNum > -50 && secondNum < 50 &&
                    thirdNum != 0 && thirdNum > -50 && thirdNum < 50 &&
                    forthNum != 0 && forthNum > -50 && forthNum < 50 &&
                    fifthNum != 0 && fifthNum > -50 && fifthNum < 50) {
                double summary = firstNum + secondNum + thirdNum + forthNum + fifthNum;
                double multiplication = firstNum * secondNum * thirdNum * forthNum * fifthNum;
                double avarageN = summary / 5;

                System.out.println("The Numbers are: " + df2.format(firstNum) + ", " + df2.format(secondNum) + ", " + df2.format(thirdNum) + ", " + df2.format(forthNum) + ", " + df2.format(fifthNum));
                System.out.println("The summary is: " + df2.format(summary));
                System.out.println("The multiplication is: " + df2.format(multiplication));
                System.out.println("The avarage is: " + df2.format(avarageN));
            } else {
                System.out.println("The number should be between -50 till 50 and can't be 0");
            }

        } else {
            System.out.println("Please enter the number only");
        }
    }

    /*
    1. Сделать метод, который создаёт массив и с помощью цикла while наполняет его
случайными числами кратными 9. int[] generateArrMod9(int from, int to, int count) //mod = modulo operation
 */

    private static int[] taskFirstWhileCycle() {
        int x = 0;
        int[] anArray = new int[10];

        while (x < 10) {
            Random rand = new Random();
            int i = rand.nextInt(40) + 10;

            if ((i % 9) == 0) {
                anArray[x] = i;
                x++;
            }

        }

        return anArray;
    }

 /*   2. делать метод который генерирует случайные числа и выводит их на экран, каждое с новой строки,
    если очередное сгенерированное чилос окажется кратным 7 то прекратить вывод
    void printRandomDigitUntilMod7(int from, int to)
*/

    private static void taskSecond(int from, int to) {


        while (true) {
            Random rand = new Random();
            int i = rand.nextInt(to -from) + from;
            if ((i % 7) == 0) {
                break;
            }

            System.out.println(i);
        }


//        Random rand = new Random();
//        int i = rand.nextInt(to -from) + from;
//        while ((i % 7) != 0) {
//            System.out.println(i);
//            i = rand.nextInt(to -from) + from;
//        }

    }


}