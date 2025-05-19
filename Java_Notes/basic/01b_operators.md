# Operators in Java

Operators in Java are special symbols that perform operations on one, two, or three operands and return a result. They are fundamental to manipulating data and controlling program flow.

## 1. Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

| Operator | Name           | Description                                   | Example (a=10, b=3) | Result |
|----------|----------------|-----------------------------------------------|---------------------|--------|
| `+`      | Addition       | Adds two operands                             | `a + b`             | `13`   |
| `-`      | Subtraction    | Subtracts the second operand from the first   | `a - b`             | `7`    |
| `*`      | Multiplication | Multiplies two operands                         | `a * b`             | `30`   |
| `/`      | Division       | Divides the first operand by the second       | `a / b`             | `3` (integer division) |
| `%`      | Modulus        | Returns the remainder of a division           | `a % b`             | `1`    |

**Integer Division vs. Floating-Point Division:**
- If both operands of `/` are integers, the result is an integer, and the fractional part is truncated (e.g., `10 / 3` is `3`).
- If at least one operand is a floating-point number (float or double), the result is a floating-point number (e.g., `10.0 / 3` is `3.333...`).

**Example: Arithmetic Operators**
```java
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double x = 10.0;
        double y = 3.0;

        System.out.println("a + b = " + (a + b));       // 13
        System.out.println("a - b = " + (a - b));       // 7
        System.out.println("a * b = " + (a * b));       // 30
        System.out.println("a / b = " + (a / b));       // 3 (integer division)
        System.out.println("x / y = " + (x / y));       // 3.333...
        System.out.println("a % b = " + (a % b));       // 1

        // Order of operations (PEMDAS/BODMAS) applies
        int result = a + b * 2; // 10 + (3 * 2) = 16
        System.out.println("a + b * 2 = " + result);
    }
}
```

---

## 2. Relational Operators (Comparison Operators)

Relational operators are used to compare two values. The result of a relational operation is always a boolean value (`true` or `false`).

| Operator | Name                       | Description                                          | Example (a=10, b=3) | Result |
|----------|----------------------------|------------------------------------------------------|---------------------|--------|
| `==`     | Equal to                   | Returns `true` if both operands are equal            | `a == b`            | `false`|
| `!=`     | Not equal to               | Returns `true` if operands are not equal             | `a != b`            | `true` |
| `>`      | Greater than               | Returns `true` if the left operand is greater        | `a > b`             | `true` |
| `<`      | Less than                  | Returns `true` if the left operand is less           | `a < b`             | `false`|
| `>=`     | Greater than or equal to   | Returns `true` if the left operand is greater or equal| `a >= 10`           | `true` |
| `<=`     | Less than or equal to      | Returns `true` if the left operand is less or equal  | `b <= 3`            | `true` |

**Important Note for `==` with Reference Types:**
- For primitive types, `==` compares their actual values.
- For reference types (objects), `==` compares the memory addresses (i.e., it checks if both references point to the exact same object), not their content. To compare the content of objects (e.g., Strings), use the `.equals()` method.

**Example: Relational Operators**
```java
public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int p = 10;
        int q = 5;
        int r = 10;

        System.out.println("p == q: " + (p == q));   // false
        System.out.println("p == r: " + (p == r));   // true
        System.out.println("p != q: " + (p != q));   // true
        System.out.println("p > q: " + (p > q));    // true
        System.out.println("p < q: " + (p < q));    // false
        System.out.println("p >= r: " + (p >= r));  // true
        System.out.println("q <= p: " + (q <= p));  // true

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (due to string pooling for literals)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (s3 is a new object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (compares content)
    }
}
```

---

## 3. Logical Operators

Logical operators are used to combine or modify boolean expressions. They operate on boolean operands and produce a boolean result.

| Operator | Name          | Description                                                                 | Example (x=true, y=false) | Result |
|----------|---------------|-----------------------------------------------------------------------------|---------------------------|--------|
| `&&`     | Logical AND   | Returns `true` if both operands are `true` (short-circuiting)             | `x && y`                  | `false`|
| `||`     | Logical OR    | Returns `true` if at least one operand is `true` (short-circuiting)         | `x || y`                  | `true` |
| `!`      | Logical NOT   | Reverses the boolean value of its operand                                   | `!x`                      | `false`|

**Short-Circuiting:**
- `&&`: If the first operand is `false`, the second operand is not evaluated because the result will always be `false`.
- `||`: If the first operand is `true`, the second operand is not evaluated because the result will always be `true`.
This is important if the second operand has side effects (e.g., a method call).

**Example: Logical Operators**
```java
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 5;
        int d = 10;

        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("!a: " + (!a));       // false
        System.out.println("!b: " + (!b));       // true

        // Combining with relational operators
        System.out.println("(c < d) && a: " + ((c < d) && a)); // (true) && true -> true
        System.out.println("(c > d) || b: " + ((c > d) || b)); // (false) || false -> false

        // Short-circuiting example
        int x = 0;
        boolean result = (x != 0) && (10 / x > 1); // Second part (10/x) is not evaluated, avoiding DivisionByZeroException
        System.out.println("Short-circuit AND result: " + result);

        boolean result2 = (x == 0) || (10 / x > 1); // Second part (10/x) is not evaluated
        System.out.println("Short-circuit OR result2: " + result2);
    }
}
```

---

## 4. Assignment Operators

Assignment operators are used to assign values to variables.

| Operator | Name                        | Equivalent to | Example (x=10) | x after | Description                                   |
|----------|-----------------------------|---------------|----------------|---------|-----------------------------------------------|
| `=`      | Simple Assignment           | `x = val`     | `x = 5`        | `5`     | Assigns the value from right to left operand  |
| `+=`     | Addition Assignment         | `x = x + val` | `x += 5`       | `15`    | Adds right operand to left and assigns result |
| `-=`     | Subtraction Assignment      | `x = x - val` | `x -= 3`       | `7`     | Subtracts right from left and assigns result  |
| `*=`     | Multiplication Assignment   | `x = x * val` | `x *= 2`       | `20`    | Multiplies left by right and assigns result   |
| `/=`     | Division Assignment         | `x = x / val` | `x /= 4`       | `2`     | Divides left by right and assigns result      |
| `%=`     | Modulus Assignment          | `x = x % val` | `x %= 3`       | `1`     | Takes modulus using two operands and assigns  |
| `&=`     | Bitwise AND Assignment      | `x = x & val` | `x &= 12`      | `8`     | Bitwise AND and assign                        |
| `|=`     | Bitwise OR Assignment       | `x = x | val` | `x |= 2`       | `10`    | Bitwise OR and assign                         |
| `^=`     | Bitwise XOR Assignment      | `x = x ^ val` | `x ^= 2`       | `8`     | Bitwise XOR and assign                        |
| `>>=`    | Right Shift Assignment      | `x = x >> val`| `x >>= 1`      | `5`     | Right shift and assign                        |
| `<<=`    | Left Shift Assignment       | `x = x << val`| `x <<= 1`      | `20`    | Left shift and assign                         |
| `>>>=`   | Unsigned Right Shift Assign | `x = x >>> val`|`x >>>= 1`     | `5`     | Unsigned right shift and assign               |

**Example: Assignment Operators**
```java
public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        num2 = num1; // Simple assignment
        System.out.println("num2 after =: " + num2); // 10

        num1 = 10; // Reset num1
        num1 += 5;   // num1 = num1 + 5
        System.out.println("num1 after +=: " + num1); // 15

        num1 = 10; // Reset num1
        num1 -= 3;
        System.out.println("num1 after -=: " + num1); // 7

        num1 = 10; // Reset num1
        num1 *= 2;
        System.out.println("num1 after *=: " + num1); // 20

        num1 = 10; // Reset num1
        num1 /= 4;
        System.out.println("num1 after /=: " + num1); // 2

        num1 = 10; // Reset num1
        num1 %= 3;
        System.out.println("num1 after %=: " + num1); // 1
    }
}
```

---

## 5. Unary Operators

Unary operators require only one operand. They perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.

| Operator | Name                     | Description                                                                 |
|----------|--------------------------|-----------------------------------------------------------------------------|
| `+`      | Unary Plus               | Indicates a positive value (often redundant as numbers are positive by default) |
| `-`      | Unary Minus              | Negates an expression or value                                              |
| `++`     | Increment Operator       | Increments a value by 1. Can be prefix (`++var`) or postfix (`var++`).      |
| `--`     | Decrement Operator       | Decrements a value by 1. Can be prefix (`--var`) or postfix (`var--`).      |
| `!`      | Logical Complement (NOT) | Inverts the value of a boolean (already covered under Logical Operators)    |

**Prefix vs. Postfix Increment/Decrement:**
- **Prefix (`++var`, `--var`):** The value is incremented/decremented first, and then the new value is used in the expression.
- **Postfix (`var++`, `var--`):** The original value is used in the expression first, and then the value is incremented/decremented.

**Example: Unary Operators**
```java
public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = -a; // Unary minus
        System.out.println("b (unary minus): " + b); // -5

        int c = 10;
        System.out.println("c (original): " + c); // 10

        // Postfix increment
        int postInc = c++;
        System.out.println("postInc (c++): " + postInc); // 10 (c's original value used)
        System.out.println("c after c++: " + c);       // 11 (c is now incremented)

        // Prefix increment
        c = 10; // Reset c
        int preInc = ++c;
        System.out.println("preInc (++c): " + preInc); // 11 (c incremented first, then used)
        System.out.println("c after ++c: " + c);       // 11

        // Postfix decrement
        c = 10; // Reset c
        int postDec = c--;
        System.out.println("postDec (c--): " + postDec); // 10
        System.out.println("c after c--: " + c);       // 9

        // Prefix decrement
        c = 10; // Reset c
        int preDec = --c;
        System.out.println("preDec (--c): " + preDec); // 9
        System.out.println("c after --c: " + c);       // 9

        boolean flag = true;
        System.out.println("!flag: " + !flag); // false
    }
}
```

---

## 6. Bitwise and Bit Shift Operators

Bitwise operators perform operations on individual bits of integer types (`byte`, `short`, `int`, `long`).

| Operator | Name                 | Description                                                              |
|----------|----------------------|--------------------------------------------------------------------------|
| `&`      | Bitwise AND          | Performs a bit-by-bit AND operation.                                     |
| `|`      | Bitwise OR           | Performs a bit-by-bit OR operation.                                      |
| `^`      | Bitwise XOR          | Performs a bit-by-bit exclusive OR operation.                            |
| `~`      | Bitwise Complement   | Inverts all bits of its operand (unary operator).                        |
| `<<`     | Left Shift           | Shifts bits to the left, filling with zeros on the right. `val << num`   |
| `>>`     | Signed Right Shift   | Shifts bits to the right, preserving the sign bit (fills with sign bit). `val >> num` |
| `>>>`    | Unsigned Right Shift | Shifts bits to the right, filling with zeros on the left. `val >>> num`  |

**Example: Bitwise and Bit Shift Operators**
```java
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        //   0101 (a)
        // & 0011 (b)
        // -------
        //   0001 (1)
        System.out.println("a & b: " + (a & b)); // 1

        // Bitwise OR
        //   0101 (a)
        // | 0011 (b)
        // -------
        //   0111 (7)
        System.out.println("a | b: " + (a | b)); // 7

        // Bitwise XOR
        //   0101 (a)
        // ^ 0011 (b)
        // -------
        //   0110 (6)
        System.out.println("a ^ b: " + (a ^ b)); // 6

        // Bitwise Complement (NOT)
        // ~0101 (a) -> 1010 (for an 8-bit representation, this would be more complex due to two's complement for negative numbers)
        // For int (32-bit), ~5 is -6
        System.out.println("~a: " + (~a)); // -6

        // Bit Shift Operators
        int num = 8; // Binary: 1000
        System.out.println("num << 1: " + (num << 1)); // 10000 (16) -> num * 2^1
        System.out.println("num >> 1: " + (num >> 1)); // 0100  (4)  -> num / 2^1

        int negNum = -8; // Binary (simplified for illustration): ...11111000
        System.out.println("negNum >> 1: " + (negNum >> 1));   // ...11111100 (-4) (sign preserved)
        System.out.println("negNum >>> 1: " + (negNum >>> 1)); // 0...01111100 (large positive number, sign bit filled with 0)
    }
}
```

---

## 7. Ternary Operator (Conditional Operator)

The ternary operator `?:` is a shorthand for an `if-else` statement. It is the only conditional operator that takes three operands.

**Syntax:**
`variable = (condition) ? expressionIfTrue : expressionIfFalse;`

**Example: Ternary Operator**
```java
public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String result;

        result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println(result); // b is greater or equal

        int max = (a > b) ? a : b;
        System.out.println("Max value is: " + max); // 20
    }
}
```

---

## 8. `instanceof` Operator

The `instanceof` operator checks if an object is an instance of a particular class or an instance of a class that implements a particular interface. It returns a boolean value.

**Syntax:**
`objectReference instanceof Type`

**Example: `instanceof` Operator**
```java
public class InstanceofDemo {
    public static void main(String[] args) {
        String str = "Hello";
        Integer num = 10;

        System.out.println("str instanceof String: " + (str instanceof String)); // true
        System.out.println("str instanceof Object: " + (str instanceof Object)); // true (String is a subclass of Object)
        // System.out.println("str instanceof Integer: " + (str instanceof Integer)); // Compile-time error: Incompatible types

        System.out.println("num instanceof Integer: " + (num instanceof Integer)); // true
        System.out.println("num instanceof Number: " + (num instanceof Number));   // true (Integer is a subclass of Number)
        System.out.println("num instanceof Object: " + (num instanceof Object));   // true

        Object obj = "Test String";
        if (obj instanceof String) {
            String s = (String) obj; // Safe to cast
            System.out.println("Length of s: " + s.length());
        }

        Object maybeNull = null;
        System.out.println("maybeNull instanceof String: " + (maybeNull instanceof String)); // false (instanceof returns false if the object is null)
    }
}
```

---

## Operator Precedence and Associativity

Java operators have a defined precedence and associativity that determine the order in which they are evaluated in an expression with multiple operators.

- **Precedence:** Higher precedence operators are evaluated before lower precedence operators.
- **Associativity:** Determines the order for operators with the same precedence (left-to-right or right-to-left).

| Precedence | Operator Category        | Operators                                     | Associativity |
|------------|--------------------------|-----------------------------------------------|---------------|
| 1 (Highest)| Postfix                  | `expr++` `expr--`                             | Left to Right |
| 2          | Unary                    | `++expr` `--expr` `+expr` `-expr` `~` `!`     | Right to Left |
| 3          | Multiplicative           | `*` `/` `%`                                   | Left to Right |
| 4          | Additive                 | `+` `-`                                       | Left to Right |
| 5          | Shift                    | `<<` `>>` `>>>`                               | Left to Right |
| 6          | Relational               | `<` `>` `<=` `>=` `instanceof`                | Left to Right |
| 7          | Equality                 | `==` `!=`                                     | Left to Right |
| 8          | Bitwise AND              | `&`                                           | Left to Right |
| 9          | Bitwise XOR              | `^`                                           | Left to Right |
| 10         | Bitwise OR               | `|`                                           | Left to Right |
| 11         | Logical AND              | `&&`                                          | Left to Right |
| 12         | Logical OR               | `||`                                          | Left to Right |
| 13         | Ternary                  | `? :`                                         | Right to Left |
| 14 (Lowest)| Assignment               | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` | Right to Left |

It's good practice to use parentheses `()` to explicitly control the order of evaluation and improve code readability, even if the default precedence is known.

**Example: Precedence**
```java
int a = 5, b = 3, c = 2;
int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
                         // result1 = 5 + (3 * 2) = 5 + 6 = 11

int result2 = (a + b) * c; // Parentheses override default precedence
                           // result2 = (5 + 3) * 2 = 8 * 2 = 16
System.out.println("result1: " + result1);
System.out.println("result2: " + result2);
```

This comprehensive overview covers the various types of operators available in Java, their usage, and their evaluation rules.
