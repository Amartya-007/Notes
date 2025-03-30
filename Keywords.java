//? ================================
//?         JAVA KEYWORDS
//? ================================

//! What is a Keyword?
// Keywords are reserved words that have special meaning to the compiler.
// Each keyword has a specific meaning and purpose, which is already known by the compiler.
// Keywords are case-sensitive.
// Keywords cannot be used as identifiers, such as names of variables, classes, or methods.
// Keywords define the syntax and structure of the Java programming language.

//? Example: Using a keyword to declare a variable
// int number = 10;   // 'int' is a keyword

//! ================================
//!       LIST OF JAVA KEYWORDS
//! ================================

//* Control Flow Keywords
//* --------------------------------
/* 
    continue   |   for   |   switch   |   do   |   if   |   while
    else       |   break   |   return   |   try   |   catch   |   throw
    throws     |   finally 
*/

//* Access Modifiers
//* --------------------------------
/*
    private   |   public   |   protected
*/

//* Object-Oriented Programming (OOP) Keywords
//* --------------------------------
/*
    class   |   interface   |   extends   |   implements
    this   |   super   |   instanceof
*/

//* Exception Handling Keywords
//* --------------------------------
/*
    try   |   catch   |   throw   |   throws   |   finally
*/

//* Data Types
//* --------------------------------
/*
    boolean   |   byte   |   char   |   double   |   float
    int   |   long   |   short   |   void
*/

//* Modifiers
//* --------------------------------
/*
    abstract   |   final   |   native   |   static   |   strictfp
    synchronized   |   transient   |   volatile
*/

//* Miscellaneous Keywords
//* --------------------------------
/*
    assert   |   default   |   import   |   package   |   new
*/

//* Deprecated/Unused Keywords
//* --------------------------------
/*
    const   |   goto
*/

//? ================================
//?       EXAMPLES OF KEYWORDS
//? ================================

//? Example 1: Using 'if' and 'else' keywords
// The 'if' and 'else' keywords are used to define conditional statements.
// If the condition is true, the code inside the 'if' block is executed.
// If the condition is false, the code inside the 'else' block is executed.
// In this example, we check if a number is positive or negative.
/* 
 * public class Keywords {
 *   public static void main(String[] args) {
 *       int number = -10;
 *
 *       if (number > 0) {
 *           System.out.println("The number is positive.");
 *       } else {
 *           System.out.println("The number is negative.");
 *       }
 *   }
 * }
*/


// Output: The number is negative.

//? Example 2: Using 'for' loop
// The 'for' keyword is used to create a loop that executes a block of code a specified number of times.
// In this example, we use a 'for' loop to print numbers from 1 to 5.

/* 
 * public class Keywords {
 *   public static void main(String[] args) {
 *       for (int i = 1; i <= 5; i++) {
 *           System.out.print(i + " ");
 *       }
 *   }
 * }
*/

// Output: 1 2 3 4 5


//? Example 3: Using 'class' keyword
// The 'class' keyword is used to declare a class in Java.
// In this example, we define a class named 'Person' with two fields: 'name' and 'age'.

/* 
 * class Person {
 *   String name;
 *   int age;
 * }
*/

//? Example 4: Using 'return' keyword
// The 'return' keyword is used to exit a method and return a value to the caller.
// In this example, we define a method 'add' that returns the sum of two numbers.

/* 
 * public class Keywords {
 *   public static int add(int a, int b) {
 *       return a + b;
 *   }
 *
 *   public static void main(String[] args) {
 *       int result = add(5, 3);
 *       System.out.println("The sum is: " + result);
 *   }
 * }
*/

// Output: The sum is: 8


//? Example 5: Using 'try', 'catch', and 'finally' keywords
// The 'try', 'catch', and 'finally' keywords are used for exception handling in Java.

/* 
 * public class Keywords {
 *   public static void main(String[] args) {
 *       int[] numbers = {1, 2, 3};
 *
 *       try {
 *           System.out.println(numbers[4]);  // Accessing an invalid index
 *       } catch (ArrayIndexOutOfBoundsException e) {
 *           System.out.println("An error occurred: " + e.getMessage());
 *       } finally {
 *           System.out.println("This block is always executed.");
 *       }
 *   }
 * }
*/

