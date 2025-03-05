

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
/* Does Abstract class have constructor?
 Answer: This is a famous interview question and the answer is: Yes,
 abstract classes have constructor. Either you can provide it or the
 default one will be provided by Java. Now, you must be wondering if
 you cannot create an object of abstract class then what is the need
 of a constructor.
 One thing you must know is that the constructors are used when you
 are creating an object of a class, to initialize the data members of
 that class and your abstract class can have data members.
 Now, when your class extends abstract class then the same abstract
 class will become super class for your extending class and
 remember when you have constructor of your class then first line of
your constructor is always a call to super class constructor and this
 is the time when your abstract class constructor will get called-*/
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
