

// A class that is declared using "abstract" keyword is known as abstract class.
// Abstract class can have both abstract methods (without body) and concrete methods (with body).
// An abstract class cannot be instantiated. It must be extended by another class.

abstract class Abstraction {
    // Abstract method (must be implemented by subclasses)
    abstract void print();

    // Concrete method (has a body)
    public void display() {
        System.out.println("In display method");
    }
}

// ✅ Move AbstractDemo outside the Abstraction class-- 
// superclass is abstractDemo

class AbstractDemo extends Abstraction {
    @Override
    void print() {
        System.out.println("In print method");
    }
}

public class AbstractionMain {
    public static void main(String[] args) {

        //constructor -- class will become superclass
        AbstractDemo abs = new AbstractDemo(); // ✅ Correct instantiation
        abs.print();
        abs.display();
    }
}
