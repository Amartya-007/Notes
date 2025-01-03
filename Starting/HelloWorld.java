// TODO:  Start of our first program

// ! This is a simple Java program that prints "Hello, World!"

// * Class declaration (Important! Class name should match the file name)
package Starting; // Package declaration (This is optional) - It's used to organize classes into different packages (folders)

public class HelloWorld {

    // * Main method - This is where the program execution begins
    // ! Detailed breakdown of `public static void main(String[] args)`:

    // * public:
    // ? "public" means this method is accessible from anywhere. JVM ko ye method directly call karna hota hai.

    // * static:
    // ? "static" ka matlab hai ki is method ko call karne ke liye object banane ki zarurat nahi hai.
    // ? JVM directly class ke naam se is method ko access kar sakta hai.

    // * void:
    // ? "void" ka matlab hai ki ye method kuch return nahi karega. Iska kaam sirf program execute karna hai.

    // * main:
    // ? "main" ek special method hai jahan se program execution start hoti hai.
    // ? Agar method ka naam "main" nahi hoga, JVM program ko execute nahi karegi.

    // * String[] args:
    // ? "String[] args" ek array hai jo command-line arguments ko store karta hai.
    // ? Agar aap command line se koi input pass karte ho, toh wo yahan store hota hai.
    public static void main(String[] args) {

        // ? Printing "Hello, World!" to the console
        System.out.println("Hello, World!"); // This prints a message to the console

        // ! Let's add another line for practice
        System.out.println("Welcome to Java Programming!");

        // * Example of command-line arguments

        // ? args array ko use karke command-line inputs ko print karte hain

        if (args.length > 0) { // Check if arguments are passed
            System.out.println("Command-line arguments passed:"); 
            for (String arg : args) { // Loop through the arguments
                System.out.println(arg); // Print each argument
            }
        } else {
            System.out.println("No command-line arguments passed.");
        }
    }
}
