package Cyram;

public interface Pet {

    void sound();

    void eat();


}

class Puppy implements Pet{

    @Override
    public void sound() {
        System.out.println("puppy sounds");

    }

    @Override
    public void eat() {
        System.out.println("puppy is eating");

    }
}


class Jba{

    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.eat();
        p1.sound();
    }
}