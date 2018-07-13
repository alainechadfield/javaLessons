package lesson_2;

import java.text.DecimalFormat;
import java.util.function.Predicate;

public class homework {
    public static final String ALEX = "Alex";
    public static final String ALAINE = "Alaine";
    public static final String BROTHER = "Brother";
    public static final String MOTHER = "Mother";

    public static void main(String[] args) {

//        greetings("Alona"); //task -1
//        humanRace("black");//task 2
//        leapYear(2009);
//        System.out.println(calc(6.5566, 7.8, '5'));
//        alexTest(MOTHER);
//        alexSwitch("dgfdgfdgfdgfd");
        //firstCicle();
        //kiss();
        System.out.println(calcSwitch(2.4, 3.5, '+'));

    }


    private static void greetings(String name) { // task -1
        System.out.println("Hello, " + name); //  task -1
    }

    private static void humanRace(String race) { //task 0
        if (race.equals("white")) {
            System.out.println("Sorry, but you are not illegible to immigrate to US");
        } else if (race.equals("black")) {
            System.out.println("You are illegible to immigrate to US");
        } else {
            System.out.println("You might be illegible to immigrate to US");
        }
    }

    private static void leapYear(int a) { //task 1
        if (a % 4 == 0) {
            System.out.println(a + " is a leap year");
        } else {
            System.out.println(a + " is not a leap year");
        }
    }

    private static double calc(double num1, double num2, char operation) { //task 2
        double c;
        DecimalFormat df = new DecimalFormat(".##");
        if (operation == '+') {
            c = num1 + num2;
            //return c;
        } else if (operation == '-') {
            c = num1 - num2;
            // c = Double.parseDouble(new DecimalFormat(".##").format(c));
            //Precision.round(10.4567, 2)
            //double d = Math.round(c);
            //double d = Math.floor(c * 100) / 100;
            // return c;
        } else if (operation == '*') {
            c = num1 * num2;
            // return c;
        } else if (operation == '/') {
            c = num1 / num2;
            //return c;
        } else {
            return -1;
        }
        c = Double.parseDouble(new DecimalFormat(".##").format(c));
        return c;

    }

    private static double calcSwitch(double num1, double num2, char operation) {
        double c = -1;
        switch (operation) {
            case '+': return num1 + num2;
            case '-':
                c = num1 - num2;
                break;
            case '*':
                c = num1 * num2;
                break;
            case '/':
                c = num1 / num2;
                break;

            //default:
            //return -1;
        }
        return c;
    }

    private static void alexTest(String name) {
        if (name.equals("Alena")) {
            System.out.println("Give me a cake!");
        } else if (name.equals("Brother")) {
            System.out.println("Give me bitcoins");
        } else if (name.equals("Mother")) {
            System.out.println("give me candies");
        } else if (name.equals("Alex")) {
            System.out.println("Give me tea");
        } else {
            System.out.println("LOL");
        }
    }

    private static void alexSwitch(String name) {
        switch (name) {
            case "Alex":
                System.out.println("piptik");
                break;
            case ALAINE:
                System.out.println("buba");
                break;
            case BROTHER:
                System.out.println("bitcoin");
                break;
            case MOTHER:
                System.out.println("hebrew");
                break;
            default:
                System.out.println("LOL");
                break;
        }
    }

    private static void firstCicle() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Barashek number " + i);
        }
    }

    private static void kiss() {
        for (int i = 1; i <= 20; i++) {
            if (i % 6 == 0) {
                System.out.println("BEEEE ");
            } else if (i == 2 || i == 3 || i == 4) {
                System.out.println("Kiss manupu " + i + " raza");
            } else {
                System.out.println("kiss manupu " + i + " raz");
            }
        }
    }
}
