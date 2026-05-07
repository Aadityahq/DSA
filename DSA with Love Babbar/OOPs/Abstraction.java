package OOPs;


//Interface
//abstract class Bird {
//    abstract void fly();
//    abstract void eat();
//}

interface Bird {
    void fly();
    void eat();
    default void sleep() {
        System.out.println("Bird sleep...");
    }
 }


 interface Walk {
    default void walk() {
        System.out.println("Bird walks...");
    }
 }

// Here implementation is done
class Sparrow implements Bird, Walk {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating in different way...");
    }

    public void walk() {
        System.out.println("Sparrow is walking...");
    }
}

class Crow implements Bird, Walk{
    @Override
    public void fly() {
        System.out.println("Crow is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating..");
    }
}


class Pigeon implements Bird, Walk {
    @Override
    public void fly() {
        System.out.println("Pigeon is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating..");
    }
}



public class Abstraction {

    // This is interface
    public static void doBirdStuff(Bird b) {
        //Upcasting
        b.fly();
        b.eat();
        b.sleep();
        System.out.println();
    }

    public static void main(String[] args) {
        Sparrow b = new Sparrow();
        doBirdStuff(b);
        b.walk();

        Crow c = new Crow();
        doBirdStuff(c);
        b.eat();

        Bird p = new Pigeon();
        doBirdStuff(p);
    }
}

