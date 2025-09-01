// First program on Interface concept in Java

// Defining an interface named Animal
interface Animal {
    // Abstract method (no body, only declaration)
    public void voice();
}

// Dog class implements Animal interface
class Dog implements Animal {

    // Overriding the voice() method of Animal interface
    public void voice() {
        System.out.println("In voice of Dog class.");
    }
}

// Main class 
public class InterfaceExample1 {
    public static void main(String[] args) {
        // Creating object of Dog
        Dog d = new Dog();

        // Calling voice method
        d.voice();
    }
}
