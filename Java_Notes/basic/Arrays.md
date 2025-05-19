# Arrays in Java

Arrays are fundamental data structures in Java used to store a collection of elements of the same data type. They provide a way to organize and access data efficiently.

## Key Concepts

### 1. Declaration and Initialization

In Java, arrays are objects that can hold multiple values of the same type. They are fixed in size, meaning once an array is created, its size cannot be changed. This is different from other data structures like `ArrayList`, which can dynamically resize.
Arrays must be declared with a specific data type and size.

**Declaration:**

```java
dataType[] arrayName;
// or
dataType arrayName[]; // Less common
```

**Instantiation (creating the array object):**

```java
arrayName = new dataType[size];
```

**Initialization (assigning values):**
Arrays can be initialized at the time of declaration or later.

- **Initializing during declaration:**

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  String[] names = {"Alice", "Bob", "Charlie"};
  ```

- **Initializing after declaration:**

  ```java
  int[] scores = new int[3];
  scores[0] = 90;
  scores[1] = 85;
  scores[2] = 92;
  ```

### 2. Accessing Array Elements

Array elements are accessed using their index, which is zero-based (starts from 0).
To access an element, use the syntax `arrayName[index]`.

```java
int[] numbers = {10, 20, 30, 40, 50};
int firstNumber = numbers[0]; // Accesses the first element (10)
int thirdNumber = numbers[2]; // Accesses the third element (30)

// Modifying an element
numbers[1] = 25; // Changes the second element from 20 to 25

```text
The length of an array can be found using the `length` attribute:
```java
int arrayLength = numbers.length; // Returns 5
```

## Single-Dimensional Arrays

A single-dimensional array is a linear collection of elements of the same type. It is the simplest form of an array and is often used to store lists of items.

**Example:**

```java
// Declare and initialize an array of integers
int[] age = new int[5];
age[0] = 25;
age[1] = 30;
age[2] = 22;
age[3] = 28;
age[4] = 35;

// Iterate through the array
System.out.println("Ages:");
for (int i = 0; i < age.length; i++) {
    System.out.println(age[i]);
}

// Using an enhanced for loop (for-each loop)
System.out.println("Ages (using for-each):");
for (int a : age) {
    System.out.println(a);
}
```

## Multi-Dimensional Arrays

Java supports multi-dimensional arrays, which are essentially arrays of arrays. The most common type is a two-dimensional array (matrix).

**Declaration and Initialization:**

```java
// 2D array (matrix)
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements in a 2D array
int element = matrix[1][2]; // Accesses the element in the second row, third column (6)

// Jagged arrays (arrays where rows can have different lengths)
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[]{1, 2};
jaggedArray[1] = new int[]{3, 4, 5};
jaggedArray[2] = new int[]{6, 7, 8, 9};
```

**Iterating through a 2D array:**

```java
System.out.println("Matrix elements:");
for (int i = 0; i < matrix.length; i++) { // Iterate over rows
    for (int j = 0; j < matrix[i].length; j++) { // Iterate over columns in the current row
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println(); // Newline after each row
}
```

## Array Operations and Methods

While Java's built-in arrays have a fixed size and limited direct methods, the `java.util.Arrays` class provides several static utility methods for common array operations.

### Common `java.util.Arrays` Methods

- **`toString(array)`**: Returns a string representation of the contents of the specified array.

  ```java
  int[] numbers = {1, 2, 3};
  System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3]
  ```

- **`sort(array)`**: Sorts the specified array into ascending numerical order (or lexicographical order for objects).

  ```java
  int[] data = {5, 1, 4, 2, 8};
  Arrays.sort(data);
  System.out.println(Arrays.toString(data)); // Output: [1, 2, 4, 5, 8]
  ```

- **`equals(array1, array2)`**: Returns `true` if the two specified arrays are equal to one another (contain the same elements in the same order).

  ```java
  int[] arr1 = {1, 2, 3};
  int[] arr2 = {1, 2, 3};
  int[] arr3 = {3, 2, 1};
  System.out.println(Arrays.equals(arr1, arr2)); // Output: true
  System.out.println(Arrays.equals(arr1, arr3)); // Output: false
  ```

- **`fill(array, value)`**: Assigns the specified value to each element of the specified array.

  ```java
  int[] fillArray = new int[5];
  Arrays.fill(fillArray, 10);
  System.out.println(Arrays.toString(fillArray)); // Output: [10, 10, 10, 10, 10]
  ```

- **`copyOf(original, newLength)`**: Copies the specified array, truncating or padding with default values (e.g., 0 for int, null for objects) if necessary so the copy has the specified length.

  ```java
  int[] source = {1, 2, 3, 4, 5};
  int[] destination = Arrays.copyOf(source, 3);
  System.out.println(Arrays.toString(destination)); // Output: [1, 2, 3]

  int[] largerDestination = Arrays.copyOf(source, 7);
  System.out.println(Arrays.toString(largerDestination)); // Output: [1, 2, 3, 4, 5, 0, 0]
  ```

- **`copyOfRange(original, from, to)`**: Copies the specified range of the specified array into a new array. The `to` index is exclusive.

  ```java
  int[] sourceRange = {10, 20, 30, 40, 50};
  int[] subArray = Arrays.copyOfRange(sourceRange, 1, 4); // Elements at index 1, 2, 3
  System.out.println(Arrays.toString(subArray)); // Output: [20, 30, 40]
  ```

- **`binarySearch(array, key)`**: Searches the specified array for the specified value using the binary search algorithm. The array must be sorted prior to making this call. Returns the index of the search key, if it is contained in the array; otherwise, `(-(insertion point) - 1)`.

  ```java
  int[] sortedData = {10, 20, 30, 40, 50};
  int index = Arrays.binarySearch(sortedData, 30);
  System.out.println("Index of 30: " + index); // Output: Index of 30: 2

  int notFoundIndex = Arrays.binarySearch(sortedData, 35);
  System.out.println("Index of 35: " + notFoundIndex); // Output: Index of 35: -4 ((-(3) - 1))
  ```

### Limitations of Arrays

- **Fixed Size**: Once an array is created, its size cannot be changed. For dynamic collections, consider using `ArrayList` or other collection classes.
- **Homogeneous**: Arrays can only store elements of the same data type.

Arrays are a cornerstone of Java programming, and understanding their usage and the utility methods provided by the `java.util.Arrays` class is essential for effective coding.
