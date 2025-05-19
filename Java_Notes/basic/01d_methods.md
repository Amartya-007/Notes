# Methods in Java

Methods are blocks of code that perform a specific task. They are essential for organizing code into reusable units, making programs more modular, readable, and maintainable. In Java, methods must be declared within a class.

---

## 1. Method Declaration

A method declaration specifies the method's name, return type, parameters, and body.

**Syntax:**

```java
<access_modifier> <static_modifier_optional> <return_type> <method_name>(<parameter_list>) <throws_clause_optional> {
    // Method body: statements to perform the task
    return <value>; // If return_type is not void
}
```

**Components:**

-   ***`<access_modifier>*`:** (e.g., `public`, `private`, `protected`, or default/package-private) Defines the visibility of the method.
-   **`<static_modifier_optional>`:** If `static`, the method belongs to the class rather than an instance of the class.
-   **`<return_type>`:** The data type of the value returned by the method. If the method does not return a value, `void` is used.
-   **`<method_name>`:** The name of the method (should follow camelCase convention).
-   **`<parameter_list>`:** A comma-separated list of input parameters, preceded by their data types, that the method accepts. If there are no parameters, the parentheses are empty.
-   **`<throws_clause_optional>`:** Specifies any checked exceptions that the method might throw.
-   **Method Body:** The code block enclosed in curly braces `{}` containing the logic of the method.
-   **`return <value>;`:** Statement used to return a value from the method. It must match the `<return_type>`. For `void` methods, the `return` statement is optional and used only to exit the method early.

**Example:**

```java
public class Calculator {
    // Method declaration
    public int add(int num1, int num2) { // num1 and num2 are parameters
        int sum = num1 + num2;
        return sum; // Returns an int value
    }

    public static void printMessage(String message) { // static method, no return value
        System.out.println(message);
    }

    // Method without parameters
    public String getGreeting() {
        return "Hello, World!";
    }
}
```

---

## 2. Parameters and Return Types

### a. Parameters (Arguments)

Parameters are variables that receive values when the method is called. They allow methods to operate on different data inputs.

-   **Formal Parameters:** The variables declared in the method signature.
-   **Actual Parameters (Arguments):** The actual values passed to the method when it is invoked.

**Example:**

```java
public class ParameterDemo {
    // Method with two int parameters (numA, numB are formal parameters)
    public void displaySum(int numA, int numB) {
        int sum = numA + numB;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        ParameterDemo demo = new ParameterDemo();
        int x = 10;
        int y = 20;
        demo.displaySum(x, y); // x and y are actual parameters (arguments)
        demo.displaySum(5, 7); // 5 and 7 are actual parameters
    }
}
```

**Pass-by-Value:** Java uses pass-by-value for passing arguments to methods.
-   For primitive types: A copy of the value is passed to the method. Changes to the parameter inside the method do not affect the original variable.
-   For object references: A copy of the reference (memory address) is passed. This means the method parameter and the original reference point to the same object in memory.
    -   If the method changes the state of the object (e.g., modifies its instance variables), the changes will be visible outside the method.
    -   If the method reassigns the parameter to a new object, the original reference remains unchanged.

### b. Return Types

The return type specifies the data type of the value that the method sends back to the caller.
-   If a method is declared with a return type other than `void`, it **must** include a `return` statement that provides a value of that type.
-   If a method is declared as `void`, it does not return any value. A `return;` statement can be used to exit the method early, but it cannot return a value.

**Example:**

```java
public class ReturnTypeDemo {

    // Method that returns an int
    public int getSquare(int number) {
        return number * number; // Returns the square of the number
    }

    // Method that returns a String
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    // void method - does not return a value
    public void printInfo(String info) {
        if (info == null) {
            System.out.println("No information provided.");
            return; // Early exit from the void method
        }
        System.out.println("Information: " + info);
    }

    public static void main(String[] args) {
        ReturnTypeDemo demo = new ReturnTypeDemo();

        int squareOf5 = demo.getSquare(5);
        System.out.println("Square of 5: " + squareOf5); // Output: Square of 5: 25

        String greeting = demo.greet("Alice");
        System.out.println(greeting); // Output: Hello, Alice!

        String guestGreeting = demo.greet(null);
        System.out.println(guestGreeting); // Output: Hello, Guest!

        demo.printInfo("Java methods are cool."); // Output: Information: Java methods are cool.
        demo.printInfo(null); // Output: No information provided.
    }
}
```

---

## 3. Method Overloading

Method overloading allows a class to have multiple methods with the **same name** but with **different parameter lists**. This enables you to define methods that perform similar operations but accept different types or numbers of arguments.

The compiler distinguishes overloaded methods based on the **method signature**, which in Java includes the method name and the number, types, and order of its parameters. The return type is **not** part of the method signature for overloading purposes.

**Rules for Method Overloading:**

1.  **Different Number of Parameters:**
    ```java
    public int calculate(int a, int b) { /* ... */ }
    public int calculate(int a, int b, int c) { /* ... */ }
    ```

2.  **Different Types of Parameters:**
    ```java
    public double sum(double a, double b) { /* ... */ }
    public String sum(String s1, String s2) { /* ... */ }
    ```

3.  **Different Order of Parameter Types:**
    ```java
    public void process(int id, String name) { /* ... */ }
    public void process(String name, int id) { /* ... */ }
    ```

**Cannot Overload Based on Return Type Only:**
If two methods have the same name and same parameter list, they cannot be overloaded even if their return types are different. This would cause ambiguity for the compiler.

```java
// COMPILE ERROR! Cannot overload by return type only.
// public int getValue() { return 10; }
// public String getValue() { return "Hello"; }
```

**Example of Method Overloading:**

```java
public class OverloadDemo {

    // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public String add(String str1, String str2) {
        System.out.println("Concatenating two strings:");
        return str1 + str2;
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        System.out.println("Result: " + demo.add(5, 10));          // Calls add(int, int)
        System.out.println("Result: " + demo.add(5, 10, 15));     // Calls add(int, int, int)
        System.out.println("Result: " + demo.add(3.5, 2.5));       // Calls add(double, double)
        System.out.println("Result: " + demo.add("Hello, ", "World!")); // Calls add(String, String)
    }
}
```

**Benefits of Method Overloading:**
-   **Readability:** Code becomes cleaner as you don't need different names for similar operations.
-   **Flexibility:** Allows methods to handle various input types or numbers of arguments gracefully.

---

## 4. Access Modifiers (for Methods)

Access modifiers in Java control the visibility and accessibility of methods (and other class members) from other classes and packages.

There are four access modifiers:

1.  **`public`:**
    -   The method is accessible from any other class, regardless of the package.
    -   This is the least restrictive access level.
    ```java
    public class MyClass {
        public void publicMethod() {
            System.out.println("This is a public method.");
        }
    }
    ```

2.  **`protected`:**
    -   The method is accessible within its own package and by subclasses (even if they are in different packages).
    -   If a class is not in the same package as the class with the protected method, it must be a subclass to access it.
    ```java
    // In package com.example
    public class Parent {
        protected void protectedMethod() {
            System.out.println("This is a protected method.");
        }
    }

    // In package com.example (same package)
    public class SamePackageClass {
        public void accessProtected() {
            Parent p = new Parent();
            p.protectedMethod(); // Accessible
        }
    }

    // In package com.another (different package)
    // import com.example.Parent;
    public class SubclassInDifferentPackage extends Parent {
        public void accessProtectedFromSubclass() {
            protectedMethod(); // Accessible because it's a subclass
            // Parent p = new Parent();
            // p.protectedMethod(); // NOT accessible directly via Parent instance from different package
        }
    }
    ```

3.  **Default (Package-Private):**
    -   If no access modifier is specified, the method has default (or package-private) access.
    -   The method is accessible only by classes within the same package.
    -   It is not accessible by subclasses in different packages.
    ```java
    // In package com.example
    class DefaultAccessClass {
        void defaultMethod() { // No explicit modifier
            System.out.println("This is a default (package-private) method.");
        }
    }

    // In package com.example (same package)
    public class AnotherClassInSamePackage {
        public void testDefaultAccess() {
            DefaultAccessClass dac = new DefaultAccessClass();
            dac.defaultMethod(); // Accessible
        }
    }

    // In package com.another (different package)
    // import com.example.DefaultAccessClass; // Class itself might not be public
    public class ClassInDifferentPackage {
        public void testDefaultAccess() {
            // DefaultAccessClass dac = new DefaultAccessClass();
            // dac.defaultMethod(); // COMPILE ERROR - Not accessible
        }
    }
    ```

4.  **`private`:**
    -   The method is accessible only within the same class where it is declared.
    -   This is the most restrictive access level.
    -   Private methods are often used as helper methods for the public methods of the same class.
    ```java
    public class PrivateDemo {
        private void privateMethod() {
            System.out.println("This is a private method.");
        }

        public void callPrivateMethod() {
            privateMethod(); // Accessible within the same class
            System.out.println("Called private method from within the class.");
        }
    }

    class AnotherClass {
        public void tryAccessPrivate() {
            PrivateDemo pd = new PrivateDemo();
            // pd.privateMethod(); // COMPILE ERROR - Not accessible from another class
            pd.callPrivateMethod(); // This public method can be called
        }
    }
    ```

**Summary of Access Levels:**

| Modifier    | Same Class | Same Package | Subclass (Same Pkg) | Subclass (Diff Pkg) | Other Classes (Diff Pkg) |
| :---------- | :--------: | :----------: | :-----------------: | :-----------------: | :----------------------: |
| `public`    |    Yes     |     Yes      |         Yes         |         Yes         |           Yes            |
| `protected` |    Yes     |     Yes      |         Yes         |         Yes         |            No            |
| Default     |    Yes     |     Yes      |         Yes         |         No          |            No            |
| `private`   |    Yes     |      No      |         No          |         No          |            No            |

Choosing the correct access modifier is crucial for encapsulation, which is a fundamental principle of object-oriented programming. It helps in hiding the internal implementation details of a class and exposing only necessary functionalities.
