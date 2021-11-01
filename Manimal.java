package Cyram;

public class Manimal {
    public Manimal() {
        super();
        System.out.println("this is the Manimal");
        ;





    }
}

    class Cat extends Manimal{
        public Cat(){
            super();
            System.out.println("this is Cat");
        }
    }

    class Kitten extends Cat{
        public Kitten(){
            super();
            System.out.println("this is the kitten");
        }


    }

class App{
    public static void main(String[] args) {
       Kitten k1 = new Kitten();


    }
}

