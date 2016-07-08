//Francisco Sanchez Enriquez

public class Lerning {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();      
        bird.sing();
    }
}    

class Animal extends Sing{
    void walk(){
        System.out.println("I am walking");
    }
}


class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

class Sing{
   void sing(){
       System.out.println("I am singing");
   }
}  