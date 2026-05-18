# Java Built-in Methods — Complete Reference Guide

> Your go-to cheat sheet for String, Math, Arrays, and Collections methods in Java.

---

## 1. STRING METHODS

> Strings in Java are objects. Methods are called directly on the string variable.

```java
String name = "Hello World";
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `.length()` | Returns number of characters | `name.length()` | `11` |
| `.toUpperCase()` | Converts to ALL CAPS | `name.toUpperCase()` | `"HELLO WORLD"` |
| `.toLowerCase()` | Converts to all lowercase | `name.toLowerCase()` | `"hello world"` |
| `.trim()` | Removes spaces from both sides | `"  hi  ".trim()` | `"hi"` |
| `.charAt(i)` | Returns character at index i | `name.charAt(0)` | `'H'` |
| `.indexOf("o")` | Finds first position of a character | `name.indexOf("o")` | `4` |
| `.lastIndexOf("o")` | Finds last position of character | `name.lastIndexOf("o")` | `7` |
| `.substring(i)` | Returns string from index i to end | `name.substring(6)` | `"World"` |
| `.substring(i, j)` | Returns string from index i to j | `name.substring(0, 5)` | `"Hello"` |
| `.replace("a","b")` | Replaces all occurrences | `name.replace("World","Java")` | `"Hello Java"` |
| `.contains("text")` | Checks if text exists inside | `name.contains("Hello")` | `true` |
| `.startsWith("He")` | Checks if string starts with | `name.startsWith("He")` | `true` |
| `.endsWith("ld")` | Checks if string ends with | `name.endsWith("ld")` | `true` |
| `.equals("text")` | Compares two strings exactly | `name.equals("Hello World")` | `true` |
| `.equalsIgnoreCase()` | Compares ignoring case | `"hello".equalsIgnoreCase("HELLO")` | `true` |
| `.isEmpty()` | Checks if string is empty | `"".isEmpty()` | `true` |
| `.split("x")` | Splits string into array | `"a,b,c".split(",")` | `["a","b","c"]` |
| `.toCharArray()` | Converts string to char array | `"hi".toCharArray()` | `['h','i']` |
| `.valueOf(num)` | Converts number to string | `String.valueOf(42)` | `"42"` |
| `.concat("text")` | Joins two strings | `"Hello".concat(" World")` | `"Hello World"` |
| `.repeat(n)` | Repeats string n times (Java 11+) | `"ab".repeat(3)` | `"ababab"` |
| `.strip()` | Like trim() but Unicode-aware (Java 11+) | `"  hi  ".strip()` | `"hi"` |
| `.isBlank()` | True if empty or only spaces (Java 11+) | `"   ".isBlank()` | `true` |

### String — Real Code Examples

```java
String s = "  Java Programming  ";

// Cleaning user input
System.out.println(s.trim());              // "Java Programming"
System.out.println(s.trim().toLowerCase()); // "java programming"

// Extracting part of string
String email = "user@gmail.com";
int atIndex = email.indexOf("@");
String username = email.substring(0, atIndex);
System.out.println(username);             // "user"

// Checking conditions
String password = "myPass123";
System.out.println(password.length() >= 8);    // true
System.out.println(password.contains("Pass")); // true

// Splitting
String csv = "apple,banana,mango";
String[] fruits = csv.split(",");
for (String fruit : fruits) {
    System.out.println(fruit);
}
// Output: apple  banana  mango
```

---

## 2. MATH METHODS

> All Math methods are static — called as `Math.methodName()`. No object needed.

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Math.abs(x)` | Absolute value (removes minus) | `Math.abs(-9)` | `9` |
| `Math.max(a, b)` | Returns larger of two numbers | `Math.max(10, 20)` | `20` |
| `Math.min(a, b)` | Returns smaller of two numbers | `Math.min(10, 20)` | `10` |
| `Math.pow(base, exp)` | Power / exponent | `Math.pow(2, 10)` | `1024.0` |
| `Math.sqrt(x)` | Square root | `Math.sqrt(144)` | `12.0` |
| `Math.cbrt(x)` | Cube root | `Math.cbrt(27)` | `3.0` |
| `Math.round(x)` | Rounds to nearest integer | `Math.round(4.6)` | `5` |
| `Math.floor(x)` | Rounds DOWN always | `Math.floor(4.9)` | `4.0` |
| `Math.ceil(x)` | Rounds UP always | `Math.ceil(4.1)` | `5.0` |
| `Math.random()` | Random number between 0.0 and 1.0 | `Math.random()` | e.g. `0.73` |
| `Math.log(x)` | Natural logarithm (base e) | `Math.log(Math.E)` | `1.0` |
| `Math.log10(x)` | Log base 10 | `Math.log10(1000)` | `3.0` |
| `Math.PI` | Value of π (constant, not a method) | `Math.PI` | `3.14159...` |
| `Math.E` | Value of e (constant, not a method) | `Math.E` | `2.71828...` |
| `Math.sin(x)` | Sine (x in radians) | `Math.sin(Math.PI/2)` | `1.0` |
| `Math.cos(x)` | Cosine | `Math.cos(0)` | `1.0` |

### Math — Real Code Examples

```java
// Random number between 1 and 100
int randomNum = (int)(Math.random() * 100) + 1;
System.out.println(randomNum);

// Find the biggest number
int a = 45, b = 78, c = 32;
int biggest = Math.max(a, Math.max(b, c));
System.out.println("Biggest: " + biggest); // 78

// Circle area
double radius = 5.0;
double area = Math.PI * Math.pow(radius, 2);
System.out.println("Area: " + Math.round(area)); // 79

// Distance formula
double dist = Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
System.out.println("Distance: " + dist); // 5.0
```

---

## 3. ARRAYS METHODS

> First, import: `import java.util.Arrays;`

```java
int[] nums = {5, 2, 8, 1, 9, 3};
String[] names = {"Ravi", "Amit", "Zara"};
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Arrays.sort(arr)` | Sorts array in ascending order | `Arrays.sort(nums)` | `[1,2,3,5,8,9]` |
| `Arrays.toString(arr)` | Converts array to readable string | `Arrays.toString(nums)` | `"[1, 2, 3, 5, 8, 9]"` |
| `Arrays.fill(arr, val)` | Fills all elements with a value | `Arrays.fill(nums, 0)` | `[0,0,0,0,0,0]` |
| `Arrays.copyOf(arr, len)` | Copies array with new length | `Arrays.copyOf(nums, 3)` | `[5,2,8]` |
| `Arrays.copyOfRange(arr,i,j)` | Copies a portion of array | `Arrays.copyOfRange(nums,1,4)` | `[2,8,1]` |
| `Arrays.equals(a, b)` | Checks if two arrays are equal | `Arrays.equals(a, b)` | `true/false` |
| `Arrays.binarySearch(arr,val)` | Searches value (array must be sorted first) | `Arrays.binarySearch(nums, 5)` | index number |
| `Arrays.stream(arr)` | Converts array to Stream for advanced operations | `Arrays.stream(nums).sum()` | `28` |

### Arrays — Real Code Examples

```java
import java.util.Arrays;

int[] scores = {85, 42, 97, 61, 73};

// Sort scores
Arrays.sort(scores);
System.out.println(Arrays.toString(scores));
// Output: [42, 61, 73, 85, 97]

// Find max after sorting
System.out.println("Highest score: " + scores[scores.length - 1]); // 97

// Copy top 3 scores
int[] top3 = Arrays.copyOfRange(scores, scores.length-3, scores.length);
System.out.println(Arrays.toString(top3)); // [73, 85, 97]

// Fill with default value
int[] grid = new int[5];
Arrays.fill(grid, -1);
System.out.println(Arrays.toString(grid)); // [-1, -1, -1, -1, -1]

// Search (must be sorted first)
int pos = Arrays.binarySearch(scores, 73);
System.out.println("73 found at index: " + pos); // 2
```

---

## 4. COLLECTIONS METHODS

> First, import: `import java.util.Collections;` and `import java.util.ArrayList;`

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(5); list.add(2); list.add(8); list.add(1); list.add(9);
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Collections.sort(list)` | Sorts list in ascending order | `Collections.sort(list)` | `[1,2,5,8,9]` |
| `Collections.reverse(list)` | Reverses the list | `Collections.reverse(list)` | `[9,8,5,2,1]` |
| `Collections.shuffle(list)` | Randomly shuffles the list | `Collections.shuffle(list)` | random order |
| `Collections.max(list)` | Finds the maximum value | `Collections.max(list)` | `9` |
| `Collections.min(list)` | Finds the minimum value | `Collections.min(list)` | `1` |
| `Collections.frequency(list, val)` | Counts how many times val appears | `Collections.frequency(list, 5)` | `1` |
| `Collections.swap(list, i, j)` | Swaps elements at index i and j | `Collections.swap(list, 0, 4)` | swapped |
| `Collections.fill(list, val)` | Fills all elements with a value | `Collections.fill(list, 0)` | `[0,0,0,0,0]` |
| `Collections.copy(dest, src)` | Copies source list into destination | `Collections.copy(dest, src)` | copy done |
| `Collections.nCopies(n, val)` | Creates list with n copies of val | `Collections.nCopies(3, "Hi")` | `["Hi","Hi","Hi"]` |
| `Collections.disjoint(a, b)` | True if two lists share no elements | `Collections.disjoint(a, b)` | `true/false` |
| `Collections.unmodifiableList(list)` | Makes list read-only | — | locked list |

### Collections — Real Code Examples

```java
import java.util.*;

ArrayList<Integer> marks = new ArrayList<>();
marks.add(78); marks.add(45); marks.add(92);
marks.add(61); marks.add(88);

// Sort
Collections.sort(marks);
System.out.println(marks); // [45, 61, 78, 88, 92]

// Max and Min
System.out.println("Highest: " + Collections.max(marks)); // 92
System.out.println("Lowest: "  + Collections.min(marks)); // 45

// Reverse sorted list
Collections.reverse(marks);
System.out.println(marks); // [92, 88, 78, 61, 45]

// Shuffle (useful for games, quizzes)
Collections.shuffle(marks);
System.out.println(marks); // some random order

// Count frequency
marks.add(88);
System.out.println("88 appears: " + Collections.frequency(marks, 88) + " times");
```

---

## 5. ARRAYLIST METHODS (Bonus)

> ArrayList is the most-used data structure in Java. Know these methods well.

```java
ArrayList<String> list = new ArrayList<>();
```

| Method | What It Does |
|--------|-------------|
| `.add("value")` | Adds element to end |
| `.add(index, "value")` | Adds element at specific position |
| `.get(index)` | Gets element at index |
| `.set(index, "value")` | Replaces element at index |
| `.remove(index)` | Removes element at index |
| `.remove("value")` | Removes first occurrence of value |
| `.size()` | Returns number of elements |
| `.contains("value")` | Checks if element exists |
| `.indexOf("value")` | Finds position of element |
| `.clear()` | Removes all elements |
| `.isEmpty()` | Checks if list is empty |

---

## 6. QUICK CHEAT SHEET — Which to Use When?

| Situation | Use This |
|-----------|----------|
| Working with text | `String` methods |
| Doing math calculations | `Math` methods |
| Working with fixed-size arrays `[]` | `Arrays` methods |
| Working with dynamic lists `ArrayList` | `Collections` methods |
| Need to sort anything | `Arrays.sort()` or `Collections.sort()` |
| Find max/min in array | `Arrays.stream(arr).max()` |
| Find max/min in ArrayList | `Collections.max(list)` |

---

## 7. COMMON MISTAKES TO AVOID

```java
// ❌ WRONG — comparing strings with ==
if (name == "Rahul") { }        // This compares memory address, not value!

// ✅ CORRECT — always use .equals() for strings
if (name.equals("Rahul")) { }

// ❌ WRONG — sorting array then searching wrong index
int max = nums[0];  // before sorting this might not be max

// ✅ CORRECT — sort first, then last index is max
Arrays.sort(nums);
int max = nums[nums.length - 1];

// ❌ WRONG — modifying list while looping
for (String s : list) { list.remove(s); }  // throws error!

// ✅ CORRECT — use iterator or collect separately
list.removeIf(s -> s.equals("delete me"));
```

---

*Built for BCA students. Master these methods and you'll handle 90% of Java coding interviews and real projects.*
