// static block in java

public class class5 {

    static int a = 10;
    static int b;

    // it will run only once means when 1st object is created or class is loaded in memory
    static {
        System.out.println("Hello i am static block in javaa"); //its will run when this class loaded in memory
        b = a * 2;
    }

    public static void main(String[] args) {
        class5 a1 = new class5();
        System.out.println(a + " " + b); //10 20

        b++;
        class5 a2 = new class5();
        System.out.println(a + " " + b); // 10 21
    }
}

/*
 In Java, a static block (also known as a static initializer) is a block of code that is executed only once when the class is loaded into memory by the Java ClassLoader. This block is primarily used for initializing static variables or performing setup operations that are needed before the class is used.

Key Features of Static Block:
Executed Once: The static block runs only once, when the class is loaded.
Runs Before the Main Method: If the class contains a main() method, the static block will execute before main().
No Explicit Call Required: The Java runtime automatically executes the static block; you don’t need to call it.
Multiple Static Blocks: A class can have multiple static blocks, and they are executed in the order they appear in the code.

*/
