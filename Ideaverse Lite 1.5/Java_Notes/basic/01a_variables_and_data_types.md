# Variables and Data Types in Java

In Java, variables are fundamental constructs used to store data in memory. Each variable has a specific **data type**, which determines the kind of values it can hold and the operations that can be performed on it. Understanding variables and data types is crucial for writing any Java program.

## Variables

A variable is a named memory location that holds a value. Before you can use a variable, you must declare it.

### Variable Declaration
A variable declaration specifies the variable's type and name:
```java
type variableName;
// Example:
int age;
String name;
```

### Variable Initialization
Initialization is the process of assigning an initial value to a variable. This can be done at the time of declaration or later.
```java
type variableName = value;
// Example:
int age = 30;
String city = "New York";

double salary;
salary = 75000.50;
```

### Naming Conventions
- Variable names are case-sensitive (e.g., `myVariable` and `myvariable` are different).
- They must start with a letter, underscore (`_`), or dollar sign (`$`). Subsequent characters can also be digits.
- Keywords (like `int`, `class`, `public`) cannot be used as variable names.
- It's a common convention to use camelCase for variable names (e.g., `firstName`, `totalAmount`).

---

## Data Types

Java is a statically-typed language, meaning that all variables must first be declared before they can be used, and their type cannot change during execution. Data types in Java are broadly categorized into two groups: **Primitive Types** and **Reference Types**.

### 1. Primitive Types

Primitive types are the most basic data types available in Java. They are predefined by the language and named by a keyword. There are eight primitive data types:

| Type      | Size (bits) | Default Value | Range / Description                             | Example Usage           |
| --------- | ----------- | ------------- | ----------------------------------------------- | ----------------------- |
| `byte`    | 8           | `0`           | -128 to 127                                     | `byte b = 100;`         |
| `short`   | 16          | `0`           | -32,768 to 32,767                               | `short s = 30000;`      |
| `int`     | 32          | `0`           | -2<sup>31</sup> to 2<sup>31</sup>-1             | `int i = 100000;`       |
| `long`    | 64          | `0L`          | -2<sup>63</sup> to 2<sup>63</sup>-1             | `long l = 1234567890L;` |
| `float`   | 32          | `0.0f`        | Single-precision 32-bit IEEE 754 floating point | `float f = 3.14f;`      |
| `double`  | 64          | `0.0d`        | Double-precision 64-bit IEEE 754 floating point | `double d = 2.71828;`   |
| `char`    | 16          | `'\u0000'`    | 0 to 65,535 (Unicode characters)                | `char c = 'A';`         |
| `boolean` | 1 (logical) | `false`       | `true` or `false`                               | `boolean flag = true;`  |

**Key Points about Primitive Types:**
- They store simple values directly in memory.
- They are not objects (though Java provides wrapper classes for them, e.g., `Integer` for `int`).
- They have fixed sizes, making them efficient.
- When a primitive variable is assigned to another, its value is copied.

**Example: Primitive Types**
```java
public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte age = 25;
        short year = 2025;
        int population = 1000000;
        long nationalDebt = 23000000000000L; // Note the 'L' suffix for long literals

        // Floating-point types
        float price = 19.99f; // Note the 'f' suffix for float literals
        double pi = 3.141592653589793;

        // Character type
        char grade = 'A';
        char initial = '\u004B'; // Unicode for 'K'

        // Boolean type
        boolean isActive = true;
        boolean isEmployed = false;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("National Debt: " + nationalDebt);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Initial (Unicode): " + initial);
        System.out.println("Is Active: " + isActive);
        System.out.println("Is Employed: " + isEmployed);
    }
}
```

---

### 2. Reference Types (Non-Primitive Types)

Reference types refer to objects. Unlike primitive types that hold their values directly, reference types hold a memory address (or reference) where the object's data is stored.

**Common Reference Types:**
- **Classes:** User-defined blueprints for objects (e.g., `String`, `Scanner`, custom classes like `Person`, `Car`).
- **Interfaces:** Contracts that classes can implement.
- **Arrays:** Collections of elements of the same type.
- **Enums:** Special classes that represent a group of constants.

**Key Points about Reference Types:**
- They are created using constructors (e.g., `new String("Hello")`) or by direct assignment for literals like `String`.
- They can be `null`, meaning they don't refer to any object.
- When a reference variable is assigned to another, the memory address is copied, not the object itself. Both variables will then point to the same object.
- They have methods that can be called on them.
- The actual object data is stored on the heap, while the reference variable itself is typically on the stack (if it's a local variable).

**Example: Reference Types**
```java
public class ReferenceTypesDemo {
    public static void main(String[] args) {
        // String (a common class)
        String greeting = "Hello, World!"; // String literal
        String name = new String("Java"); // Using constructor

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        // Custom Class (assuming a Person class exists)
        // Person person1 = new Person("Alice", 30);

        System.out.println("Greeting: " + greeting);
        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
        System.out.println("First fruit: " + fruits[0]);
        // System.out.println("Person 1: " + person1.getName());

        // Behavior of reference assignment
        String str1 = "Test";
        String str2 = str1; // str2 now points to the same "Test" String object as str1

        str1 = "Changed"; // str1 now points to a new String object "Changed"
                          // str2 still points to the original "Test" String object

        System.out.println("str1: " + str1); // Output: Changed
        System.out.println("str2: " + str2); // Output: Test

        // For mutable objects, changes via one reference affect the other
        StringBuilder sb1 = new StringBuilder("Initial");
        StringBuilder sb2 = sb1; // sb1 and sb2 point to the same StringBuilder object

        sb1.append(" Content"); // Modifies the object sb1 (and sb2) points to

        System.out.println("sb1: " + sb1); // Output: Initial Content
        System.out.println("sb2: " + sb2); // Output: Initial Content
    }
}
```
*(Note: For the `Person` class example to run, you would need to define a `Person` class with a constructor and a `getName()` method.)*

---

## Type Conversion and Casting

Type conversion (or type casting) is the process of changing an entity of one data type into another. Java supports two types of casting:

### 1. Implicit Conversion (Widening Casting)

Widening casting happens automatically when passing a smaller size type to a larger size type. This is safe because there is no loss of data.

**Order of Widening:**
`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

**Example: Implicit Conversion**
```java
public class WideningCastingDemo {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        byte b = 10;
        short s = b; // byte to short
        int i = s;   // short to int
        long l = i;  // int to long
        float f = l; // long to float (can lose precision for very large longs)
        double d = f;// float to double

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}
```
*Note: While `long` to `float` and `long` to `double` (or `int` to `float`) are widening conversions in terms of range, they can sometimes lead to a loss of precision for very large integer values because floating-point types store numbers differently.*

### 2. Explicit Conversion (Narrowing Casting)

Narrowing casting must be done manually by placing the type in parentheses `()` in front of the value. This is required when converting a larger type to a smaller size type, as it may lead to loss of data or precision.

**Order of Narrowing (Reverse of Widening):**
`double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

**Example: Explicit Conversion**
```java
public class NarrowingCastingDemo {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9 (fractional part is truncated)

        float f = 123.456f;
        long l = (long) f;    // float to long
        int i = (int) l;      // long to int
        short s = (short) i;  // int to short (potential data loss if i > 32767)
        byte b = (byte) s;    // short to byte (potential data loss if s > 127)

        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);

        // Example of data loss
        int largeInt = 300;
        byte smallByte = (byte) largeInt; // 300 is out of byte range (-128 to 127)
                                          // Result will be 300 % 256 = 44 (due to overflow)
        System.out.println("largeInt: " + largeInt);
        System.out.println("smallByte (after casting 300): " + smallByte); // Outputs 44
    }
}
```

**Casting with Reference Types:**
Casting can also be performed between compatible reference types, typically within an inheritance hierarchy.
- **Upcasting:** Casting an object of a subclass to its superclass type. This is always safe and often done implicitly.
  ```java
  // Assuming Dog extends Animal
  // Dog myDog = new Dog();
  // Animal myAnimal = myDog; // Implicit upcasting
  // Animal myAnimal2 = (Animal) myDog; // Explicit upcasting (also valid)
  ```
- **Downcasting:** Casting an object of a superclass type to its subclass type. This requires an explicit cast and can cause a `ClassCastException` at runtime if the object is not actually an instance of the target subclass. It's good practice to check with `instanceof` before downcasting.
  ```java
  // Animal myAnimal = new Dog(); // myAnimal actually refers to a Dog object
  // if (myAnimal instanceof Dog) {
  //     Dog myDog = (Dog) myAnimal; // Explicit downcasting
  //     myDog.bark(); // Now you can call Dog-specific methods
  // }
  ```

---

Understanding these concepts of variables, primitive types, reference types, and type casting is foundational for effective Java programming.
