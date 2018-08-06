package lesson_8;

public class Archer extends Unit{

    //DEFAULT COnstructor
//    Archer() {
//        super();
//    }

    Archer(String n){
        super(n);
    }

    @Override
    void hit(){
        System.out.println("Archer " + name + " hits the enemy");
    }



    @Override
    void move(){
      position += 3;

    }

}
