package lesson_7;

public class User {

    String name = "12";
    private int age;
    boolean vip;
    int balance = 1000;
    int thirsty = 50;
/*
constructor
 */
    User(String name, int age, boolean vip ){
      this.name = name;
      this.setAge(age);
      this.vip = vip;
    }


    int getAge() {
        return this.age;
    }

    void setAge(int inputAge) {
        if (inputAge < 18) {
            //throw new IllegalArgumentException("Sorry we are not dealing with kids :-)");
            System.out.println("Sorry we are not dealing with kids :-)");
        } else {
            age = inputAge;
        }
    }

    void display(){
//        if (vip){
//            System.out.println(name + " " + age + " " + "vip");
//        } else {
//            System.out.println(name + " " + age + " " + "not vip");
//        }

        String vipStr = (this.vip) ? "vip" : "not vip";
        System.out.println(name + " " + age + " "  + vipStr + " " + balance + "$ " + "thirsty level is " + thirsty);

    }

    void buyCoffee(){
        int coffeePrice = 2;
        balance = balance - coffeePrice;
        thirsty = thirsty - 10;
    }

    @Override
    public String toString() {
        String vipStr = (this.vip) ? "vip" : "not vip";
        return "User " + name + " " + age + " "  + vipStr + " " + balance + "$ " + "thirsty level is " + thirsty;
    }



}
