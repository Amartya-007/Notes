# Control Flow Statements in Java

Control flow statements are fundamental to Java programming as they dictate the order in which instructions are executed. These statements allow programs to make decisions, repeat blocks of code, and jump to different sections of code based on certain conditions.

---

## 1. Decision-Making Statements

Decision-making statements evaluate a boolean expression and execute a block of code based on whether the expression is true or false.

### a. `if` Statement

The `if` statement executes a block of code only if the specified condition is true.

**Syntax:**

```java
if (condition) {
    // Code to be executed if condition is true
}
```

**Example:**

```java
int number = 10;
if (number > 0) {
    System.out.println("The number is positive.");
}
```

### b. `if-else` Statement

The `if-else` statement provides an alternative block of code to execute if the `if` condition is false.

**Syntax:**

```java
if (condition) {
    // Code to be executed if condition is true
} else {
    // Code to be executed if condition is false
}
```

**Example:**

```java
int score = 75;
if (score >= 60) {
    System.out.println("You passed the exam.");
} else {
    System.out.println("You failed the exam.");
}
```

### c. `if-else if-else` Ladder (Chained `if` Statements)

This structure allows testing multiple conditions in sequence. As soon as a true condition is found, its associated block is executed, and the rest of the ladder is skipped. The final `else` block is optional and executes if none of the preceding conditions are true.

**Syntax:**

```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else if (condition3) {
    // Code for condition3
} else {
    // Code if no conditions are met (optional)
}
```

**Example:**

```java
int marks = 82;
char grade;

if (marks >= 90) {
    grade = 'A';
} else if (marks >= 80) {
    grade = 'B';
} else if (marks >= 70) {
    grade = 'C';
} else if (marks >= 60) {
    grade = 'D';
} else {
    grade = 'F';
}
System.out.println("Your grade is: " + grade); // Output: Your grade is: B
```

### d. Nested `if` Statements

An `if` statement can be placed inside another `if` or `else` block.

**Example:**

```java
int age = 25;
boolean isCitizen = true;

if (isCitizen) {
    if (age >= 18) {
        System.out.println("You are eligible to vote.");
    } else {
        System.out.println("You are a citizen but not old enough to vote.");
    }
} else {
    System.out.println("You are not a citizen, so you cannot vote.");
}
```

---

## 2. `switch` Statement

The `switch` statement provides a multi-way branch based on the value of an expression. It's often a cleaner alternative to a long `if-else if-else` ladder when comparing a variable against multiple constant values.

**Valid Expression Types:**

The `switch` expression must evaluate to `char`, `byte`, `short`, `int`, an `enum`, a `String` (since Java 7), or the wrapper types `Character`, `Byte`, `Short`, and `Integer`.

**Syntax:**

```java
switch (expression) {
    case value1:
        // Code block for value1
        break; // Exits the switch
    case value2:
        // Code block for value2
        break;
    // ... more cases
    case valueN:
        // Code block for valueN
        break;
    default: // Optional
        // Code block if no case matches
}
```

**Key Points:**

- **`break` Statement:** Crucial for exiting the `switch` block after a case is executed. Without `break`, execution "falls through" to the next case.
- **Fall-through:** Sometimes intentional, allowing multiple cases to execute the same block of code.
- **`default` Clause:** Optional; executes if no `case` constant matches the expression's value.

**Example (Fall-through):**

```java
int month = 2;
int year = 2024;
int numDays = 0;

switch (month) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        numDays = 31;
        break;
    case 4: case 6: case 9: case 11:
        numDays = 30;
        break;
    case 2:
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) { // Leap year check
            numDays = 29;
        } else {
            numDays = 28;
        }
        break;
    default:
        System.out.println("Invalid month.");
        break;
}
if (numDays != 0) {
    System.out.println("Number of days = " + numDays);
}
```

### `switch` Expressions (Java 12 and later)

Java 12 introduced `switch` expressions, which can return a value and often use a more concise arrow (`->`) syntax. `break` is not needed with `->` as only the code to the right of the arrow is executed. `yield` can be used to return a value from a block case.

**Syntax (Arrow form):**

```java
// resultType result =
switch (expression) {
    case value1 -> expression1;
    case value2 -> expression2;
    // ...
    default -> defaultExpression;
}; // Semicolon is often required
```

**Example (Switch Expression):**

```java
String day = "MONDAY";
String typeOfDay = switch (day.toUpperCase()) {
    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
    case "SATURDAY", "SUNDAY" -> "Weekend";
    default -> {
        System.out.println("Invalid day: " + day);
        yield "Unknown"; // yield is used to return a value from a block
    }
};
System.out.println(day + " is a " + typeOfDay);
```

---

## 3. Looping Statements (Iteration)

Looping statements execute a block of code repeatedly as long as a certain condition holds true or for a specified number of iterations.

### a. `for` Loop

The `for` loop is ideal when the number of iterations is known beforehand.

**Syntax:**

```java
for (initialization; condition; iteration) {
    // Code to be executed
}
```

- **Initialization:** Executed once when the loop begins (e.g., `int i = 0;`).
- **Condition:** Evaluated before each iteration. If `true`, the loop body executes.
- **Iteration:** Executed after each iteration (e.g., `i++`, `i--`, `i += 2`).

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration number: " + i);
}
```

### b. Enhanced `for` Loop (For-Each Loop)

Provides a simpler way to iterate through elements of an array or a collection.

**Syntax:**

```java
for (ElementType element : arrayOrCollection) {
    // Code to be executed for each element
}
```

**Example:**

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int number : numbers) {
    System.out.print(number + " "); // Output: 10 20 30 40 50
}
System.out.println();

java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
for (String name : names) {
    System.out.println("Hello, " + name);
}
```

### c. `while` Loop

The `while` loop executes a block of code as long as its condition remains true. The condition is checked *before* each iteration. If the condition is initially false, the loop body might not execute at all.

**Syntax:**

```java
while (condition) {
    // Code to be executed
    // Statement(s) to eventually make the condition false (e.g., incrementing a counter)
}
```

**Example:**

```java
int count = 1;
while (count <= 3) {
    System.out.println("Count is: " + count);
    count++;
}
```

### d. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but the condition is checked *after* the loop body executes. This guarantees that the loop body is executed at least once.

**Syntax:**

```java
do {
    // Code to be executed
    // Statement(s) to eventually make the condition false
} while (condition);
```

**Example:**

```java
int num = 5;
do {
    System.out.println("Number is: " + num);
    num--;
} while (num > 0); // Loop continues as long as num is greater than 0
```

This loop will print:

```text
Number is: 5
Number is: 4
Number is: 3
Number is: 2
Number is: 1
```

---

## 4. Jump Statements (Branching Statements)

Jump statements transfer control to another part of the program.

### a. `break` Statement

The `break` statement is used to terminate the execution of the innermost `switch`, `for`, `while`, or `do-while` statement in which it appears.

**Example (in a loop):**

```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        System.out.println("Breaking loop at i = " + i);
        break; // Exits the for loop
    }
    System.out.println("i = " + i);
}
// Output will be i = 1 to i = 5, then the break message.
```

**Labeled `break`:**

A labeled `break` can terminate an outer loop or switch statement from within an inner loop.

**Example (Labeled `break`):**

```java
outerLoop: // Label for the outer loop
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            System.out.println("Breaking outer loop from inner loop at i=" + i + ", j=" + j);
            break outerLoop; // Exits the loop labeled 'outerLoop'
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

### b. `continue` Statement

The `continue` statement skips the current iteration of a `for`, `while`, or `do-while` loop and proceeds to the next iteration.

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        System.out.println("Skipping iteration for i = " + i);
        continue; // Skips the rest of the code in this iteration
    }
    System.out.println("Processing i = " + i);
}
// Output will process 1, 2, skip 3, process 4, 5.
```

**Labeled `continue`:**

Similar to labeled `break`, labeled `continue` can skip the current iteration of an outer loop from within an inner loop and proceed to the next iteration of that labeled outer loop.

**Example (Labeled `continue`):**

```java
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            System.out.println("Continuing outer loop at i=" + i + ", j=" + j);
            continue outer; // Skips to the next iteration of 'outer' loop
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
// This will print i=1,j=1 then "Continuing outer loop at i=1, j=2"
// then i=2,j=1 then "Continuing outer loop at i=2, j=2"
// then i=3,j=1 then "Continuing outer loop at i=3, j=2"
```

### c. `return` Statement

The `return` statement is used to exit from the current method and, optionally, return a value to the caller. While primarily used for method termination, it also alters the control flow.

**Syntax:**

```java
return; // For void methods or when no value needs to be returned
return value; // For methods that return a value
```

**Example:**

```java
public class ReturnDemo {
    public static int findSum(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Inputs must be non-negative.");
            return -1; // Exits method and returns -1 indicating an error or invalid input
        }
        return a + b; // Exits method and returns the sum
    }

    public static void printMessage(String message) {
        if (message == null || message.isEmpty()) {
            System.out.println("No message to print.");
            return; // Exits the void method
        }
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + findSum(5, 10));    // Output: Sum: 15
        System.out.println("Sum: " + findSum(-2, 5));   // Output: Inputs must be non-negative. Sum: -1
        printMessage("Hello, Java!");                 // Output: Message: Hello, Java!
        printMessage("");                             // Output: No message to print.
    }
}
```

---

Mastering these control flow statements is essential for writing logical, efficient, and effective Java programs.
