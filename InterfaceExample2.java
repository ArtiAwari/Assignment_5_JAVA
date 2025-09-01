// Second program on Interface concept in Java

// Defining interface Father
interface Father {
    public void bringWater();  // Abstract method
}

// Defining interface Mother
interface Mother {
    public void bringWater();  // Abstract method (same name as Father)
}

// Son class implements both Father and Mother interfaces
class Son implements Father, Mother {

    // Overriding bringWater() method
    public void bringWater() {
        System.out.println("Son Brought water for Father and Mother.");
    }
}

// Main class 
public class InterfaceExample2 {
    public static void main(String[] args) {

        // Reference of Father interface pointing to Son object
        Father f = new Son();
        f.bringWater();

        // Reference of Mother interface pointing to Son object
        Mother m = new Son();
        m.bringWater();

        // Reference of Son class object directly
        Son s = new Son();
        s.bringWater();
    }
}
