// TODO: Start learning variables and data types in Java 


// * Java Data Types Tree Representation 💡

// * Data Types
//        ┌──────────────┬──────────────┐
//  Primitive        Non-Primitive
//   (8 Types)            (Reference)
//        ┌────────┬────────┬────────┬────────┬────────┬────────┬
//   byte   short    int     long    float   double   char   boolean


// ! Primitive Data Types:
// - byte:   1 byte, range -128 to 127
// - short:  2 bytes, range -32,768 to 32,767
// - int:    4 bytes, range -2^31 to 2^31-1  or [-2,147,483,648] to [2,147,483,647]
// - long:   8 bytes, range -2^63 to 2^63-1  or [-9,223,372,036,854,775,808] to [9,223,372,036,854,775,807]
// - float:  4 bytes, single-precision decimal
// - double: 8 bytes, double-precision decimal
// - char:   2 bytes, Unicode characters
// - boolean: 1 bit, true/false


// ! Non-Primitive Data Types:
// - String: Stores sequences of characters
// - Arrays: Collection of similar data types
// - Classes, Objects, Interfaces, etc.








// * Class declaration
package Starting;

public class VariablesDemo {

    // * Main method - Execution starts here
    public static void main(String[] args) {

        // ! Har variable ka ek data type hota hai jo decide karta hai ki wo kis type ka data store karega.
        
        
        // ! Primitive Data Types Examples:
        
        // ? Integer type variables
        byte smallNumber = 10; // Stores small integers, range: -128 to 127

        short shortNumber = 32000; // Stores medium integers, range: -32,768 to 32,767

        int age = 25; // Commonly used integer, range: -2^31 to 2^31-1

        long largeNumber = 123456789L; // Large integers, append 'L' for long type

        // ? Floating-point type variables
        float pi = 3.14f; // Single-precision decimal, append 'f' for float type
        
        double price = 99.99; // Double-precision decimal (more accurate)

        // ? Character type variable
        char grade = 'A'; // Stores a single character

        // ? Boolean type variable
        boolean isPassed = true; // Stores true or false

        // ! Non-Primitive Data Types Examples:

        // ? String type variable
        String name = "Amartya"; // Stores a sequence of characters

        // ? Array type variable
        int[] numbers = {1, 2, 3, 4, 5}; // Stores a collection of integers

        // TODO: Printing values of primitive data types
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value (Age): " + age);
        System.out.println("Long value: " + largeNumber);
        System.out.println("Float value (PI): " + pi);
        System.out.println("Double value (Price): " + price);
        System.out.println("Char value (Grade): " + grade);
        System.out.println("Boolean value (Is Passed): " + isPassed);

        // TODO: Printing values of non-primitive data types
        System.out.println("String value (Name): " + name);
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " "); // Printing array elements
        }
}
}