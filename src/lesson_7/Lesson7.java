package lesson_7;

public class Lesson7 {

    public static void main(String[] args) {

        User user1 = new User("Petya", 25, true);
        user1.display();
        user1.buyCoffee();
        user1.display();
        //System.out.println(user1.toString());

        user1.name = "Vasily";
        //String userName = user1.name;
        System.out.println(user1);
//user1.age = 5;
        user1.setAge(17);
        System.out.println();


        Bird bird1 = new Bird();
        //bird1.flight = false;
        bird1.land();
        bird1.flyUp();
        //System.out.println(bird1.flight);
        System.out.println(bird1.isFlight());




    }
}
