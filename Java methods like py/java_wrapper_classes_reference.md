# Java Wrapper Classes — Complete Reference Guide

> Every primitive type in Java has a Wrapper Class with built-in methods.
> This is your full reference for all 8 wrapper classes.

---

## The Big Picture — Primitive vs Wrapper

| Primitive | Wrapper Class | SizE |
|-----------|--------------|------|
| `int` | `Integer` | 32-bit whole number |
| `double` | `Double` | 64-bit decimal number |
| `float` | `Float` | 32-bit decimal number |
| `long` | `Long` | 64-bit large whole number |
| `short` | `Short` | 16-bit small whole number |
| `byte` | `Byte` | 8-bit very small number |
| `char` | `Character` | Single character |
| `boolean` | `Boolean` | true or false |

---

## 1. INTEGER (wraps `int`)

```java
Integer num = 42;
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Integer.parseInt("10")` | String → int | `Integer.parseInt("99")` | `99` |
| `Integer.toString(n)` | int → String | `Integer.toString(42)` | `"42"` |
| `Integer.valueOf(n)` | int → Integer object | `Integer.valueOf(10)` | `10` |
| `Integer.max(a, b)` | Returns larger number | `Integer.max(10, 20)` | `20` |
| `Integer.min(a, b)` | Returns smaller number | `Integer.min(10, 20)` | `10` |
| `Integer.sum(a, b)` | Adds two numbers | `Integer.sum(5, 3)` | `8` |
| `Integer.compare(a, b)` | Compares: returns -1, 0, or 1 | `Integer.compare(5, 10)` | `-1` |
| `Integer.toBinaryString(n)` | int → binary string | `Integer.toBinaryString(10)` | `"1010"` |
| `Integer.toHexString(n)` | int → hex string | `Integer.toHexString(255)` | `"ff"` |
| `Integer.toOctalString(n)` | int → octal string | `Integer.toOctalString(8)` | `"10"` |
| `Integer.bitCount(n)` | Count of 1s in binary form | `Integer.bitCount(7)` | `3` |
| `Integer.signum(n)` | Sign: -1, 0, or 1 | `Integer.signum(-5)` | `-1` |
| `Integer.MAX_VALUE` | Largest int possible | `Integer.MAX_VALUE` | `2147483647` |
| `Integer.MIN_VALUE` | Smallest int possible | `Integer.MIN_VALUE` | `-2147483648` |

### Real Code Example

```java
String input = "123";
int num = Integer.parseInt(input);     // String to int
System.out.println(num + 10);          // 133

System.out.println(Integer.toBinaryString(13)); // 1101
System.out.println(Integer.MAX_VALUE);          // 2147483647
```

---

## 2. DOUBLE (wraps `double`)

```java
Double d = 3.14;
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Double.parseDouble("3.14")` | String → double | `Double.parseDouble("9.99")` | `9.99` |
| `Double.toString(d)` | double → String | `Double.toString(3.14)` | `"3.14"` |
| `Double.valueOf(d)` | double → Double object | `Double.valueOf(3.14)` | `3.14` |
| `Double.max(a, b)` | Returns larger decimal | `Double.max(3.5, 7.2)` | `7.2` |
| `Double.min(a, b)` | Returns smaller decimal | `Double.min(3.5, 7.2)` | `3.5` |
| `Double.sum(a, b)` | Adds two decimals | `Double.sum(1.1, 2.2)` | `3.3` |
| `Double.compare(a, b)` | Compares two doubles | `Double.compare(1.0, 2.0)` | `-1` |
| `Double.isNaN(d)` | Checks if value is Not a Number | `Double.isNaN(0.0/0.0)` | `true` |
| `Double.isInfinite(d)` | Checks if value is infinite | `Double.isInfinite(1.0/0.0)` | `true` |
| `Double.MAX_VALUE` | Largest double possible | `Double.MAX_VALUE` | `1.79...E308` |
| `Double.MIN_VALUE` | Smallest positive double | `Double.MIN_VALUE` | `4.9E-324` |

### Real Code Example

```java
String price = "199.99";
double amount = Double.parseDouble(price);  // String to double
double tax = amount * 0.18;
System.out.println("Total: " + (amount + tax)); // Total: 235.9882

// Danger check
double result = 10.0 / 0.0;
System.out.println(Double.isInfinite(result)); // true
```

---

## 3. FLOAT (wraps `float`)

```java
Float f = 3.14f;  // note: f suffix required for float literals
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Float.parseFloat("3.14")` | String → float | `Float.parseFloat("9.5")` | `9.5` |
| `Float.toString(f)` | float → String | `Float.toString(3.14f)` | `"3.14"` |
| `Float.valueOf(f)` | float → Float object | `Float.valueOf(3.14f)` | `3.14` |
| `Float.max(a, b)` | Returns larger value | `Float.max(1.5f, 2.5f)` | `2.5` |
| `Float.min(a, b)` | Returns smaller value | `Float.min(1.5f, 2.5f)` | `1.5` |
| `Float.sum(a, b)` | Adds two floats | `Float.sum(1.1f, 2.2f)` | `3.3` |
| `Float.compare(a, b)` | Compares two floats | `Float.compare(1.0f, 2.0f)` | `-1` |
| `Float.isNaN(f)` | Checks if Not a Number | `Float.isNaN(Float.NaN)` | `true` |
| `Float.isInfinite(f)` | Checks if infinite | `Float.isInfinite(1f/0f)` | `true` |
| `Float.MAX_VALUE` | Largest float possible | `Float.MAX_VALUE` | `3.4028235E38` |

> ⚠️ **float vs double:** Use `double` for most cases. `float` has less precision. Only use `float` when memory is very limited (like Android/game development).

### Real Code Example

```java
float a = Float.parseFloat("5.5");
float b = Float.parseFloat("2.5");
System.out.println(Float.max(a, b));  // 5.5
System.out.println(Float.sum(a, b));  // 8.0
```

---

## 4. LONG (wraps `long`)

> Use `long` when numbers are too big for `int` (above 2 billion).

```java
Long bigNum = 9999999999L;  // note: L suffix required
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Long.parseLong("123")` | String → long | `Long.parseLong("9999999999")` | `9999999999` |
| `Long.toString(n)` | long → String | `Long.toString(123L)` | `"123"` |
| `Long.valueOf(n)` | long → Long object | `Long.valueOf(100L)` | `100` |
| `Long.max(a, b)` | Returns larger value | `Long.max(100L, 200L)` | `200` |
| `Long.min(a, b)` | Returns smaller value | `Long.min(100L, 200L)` | `100` |
| `Long.sum(a, b)` | Adds two longs | `Long.sum(100L, 200L)` | `300` |
| `Long.compare(a, b)` | Compares two longs | `Long.compare(1L, 2L)` | `-1` |
| `Long.toBinaryString(n)` | long → binary string | `Long.toBinaryString(10L)` | `"1010"` |
| `Long.toHexString(n)` | long → hex string | `Long.toHexString(255L)` | `"ff"` |
| `Long.bitCount(n)` | Count of 1s in binary | `Long.bitCount(7L)` | `3` |
| `Long.MAX_VALUE` | Largest long possible | `Long.MAX_VALUE` | `9223372036854775807` |
| `Long.MIN_VALUE` | Smallest long possible | `Long.MIN_VALUE` | `-9223372036854775808` |

### Real Code Example

```java
// Population of world — too big for int!
long population = Long.parseLong("8000000000");
System.out.println("World population: " + population);  // 8000000000

// Timestamps in milliseconds
long currentTime = System.currentTimeMillis();
System.out.println("Time in ms: " + currentTime);
```

---

## 5. SHORT (wraps `short`)

> Rarely used directly. `short` saves memory — holds -32,768 to 32,767.

```java
Short s = 100;
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Short.parseShort("100")` | String → short | `Short.parseShort("500")` | `500` |
| `Short.toString(s)` | short → String | `Short.toString((short)100)` | `"100"` |
| `Short.valueOf(s)` | short → Short object | `Short.valueOf((short)10)` | `10` |
| `Short.max(a, b)` | Returns larger value | `Short.max((short)5,(short)9)` | `9` |
| `Short.min(a, b)` | Returns smaller value | `Short.min((short)5,(short)9)` | `5` |
| `Short.compare(a, b)` | Compares two shorts | `Short.compare((short)1,(short)2)` | `-1` |
| `Short.MAX_VALUE` | Largest short possible | `Short.MAX_VALUE` | `32767` |
| `Short.MIN_VALUE` | Smallest short possible | `Short.MIN_VALUE` | `-32768` |

> 💡 In most real projects, just use `int`. Use `short` only when working with low-level data, files, or embedded systems.

---

## 6. BYTE (wraps `byte`)

> Smallest number type. Holds -128 to 127. Used in file I/O and networking.

```java
Byte b = 100;
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Byte.parseByte("100")` | String → byte | `Byte.parseByte("50")` | `50` |
| `Byte.toString(b)` | byte → String | `Byte.toString((byte)100)` | `"100"` |
| `Byte.valueOf(b)` | byte → Byte object | `Byte.valueOf((byte)10)` | `10` |
| `Byte.max(a, b)` | Returns larger value | `Byte.max((byte)5,(byte)9)` | `9` |
| `Byte.min(a, b)` | Returns smaller value | `Byte.min((byte)5,(byte)9)` | `5` |
| `Byte.compare(a, b)` | Compares two bytes | `Byte.compare((byte)1,(byte)2)` | `-1` |
| `Byte.MAX_VALUE` | Largest byte possible | `Byte.MAX_VALUE` | `127` |
| `Byte.MIN_VALUE` | Smallest byte possible | `Byte.MIN_VALUE` | `-128` |

### Real Code Example

```java
// Reading file data — bytes are used everywhere in file I/O
byte[] fileData = new byte[1024];  // 1KB buffer
System.out.println("Max byte value: " + Byte.MAX_VALUE); // 127
```

---

## 7. CHARACTER (wraps `char`)

> Most feature-rich wrapper after Integer. Very useful for checking and converting characters.

```java
char ch = 'A';
Character c = 'A';
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Character.isLetter(ch)` | Checks if it is a letter | `Character.isLetter('A')` | `true` |
| `Character.isDigit(ch)` | Checks if it is a digit (0-9) | `Character.isDigit('5')` | `true` |
| `Character.isWhitespace(ch)` | Checks if it is a space/tab | `Character.isWhitespace(' ')` | `true` |
| `Character.isUpperCase(ch)` | Checks if uppercase | `Character.isUpperCase('A')` | `true` |
| `Character.isLowerCase(ch)` | Checks if lowercase | `Character.isLowerCase('a')` | `true` |
| `Character.isLetterOrDigit(ch)` | Checks if letter OR digit | `Character.isLetterOrDigit('3')` | `true` |
| `Character.isAlphabetic(ch)` | Checks if alphabetic | `Character.isAlphabetic('Z')` | `true` |
| `Character.toUpperCase(ch)` | Converts to uppercase | `Character.toUpperCase('a')` | `'A'` |
| `Character.toLowerCase(ch)` | Converts to lowercase | `Character.toLowerCase('A')` | `'a'` |
| `Character.toString(ch)` | char → String | `Character.toString('A')` | `"A"` |
| `Character.getNumericValue(ch)` | Gets numeric value of char | `Character.getNumericValue('9')` | `9` |
| `Character.compare(a, b)` | Compares two chars | `Character.compare('A','B')` | `-1` |
| `Character.MAX_VALUE` | Largest char value | `Character.MAX_VALUE` | `'\uFFFF'` |

### Real Code Example

```java
String password = "Pass@123";

int letters = 0, digits = 0, specials = 0;

for (char ch : password.toCharArray()) {
    if (Character.isLetter(ch))       letters++;
    else if (Character.isDigit(ch))   digits++;
    else                              specials++;
}

System.out.println("Letters: "  + letters);   // 4
System.out.println("Digits: "   + digits);    // 3
System.out.println("Specials: " + specials);  // 1

// Convert case
char lower = Character.toLowerCase('X');
System.out.println(lower);  // x
```

---

## 8. BOOLEAN (wraps `boolean`)

> Simplest wrapper class. Mostly used for parsing text to boolean.

```java
Boolean flag = true;
```

| Method | What It Does | Example | Output |
|--------|-------------|---------|--------|
| `Boolean.parseBoolean("true")` | String → boolean | `Boolean.parseBoolean("true")` | `true` |
| `Boolean.parseBoolean("false")` | String → boolean | `Boolean.parseBoolean("false")` | `false` |
| `Boolean.toString(b)` | boolean → String | `Boolean.toString(true)` | `"true"` |
| `Boolean.valueOf(b)` | boolean → Boolean object | `Boolean.valueOf(true)` | `true` |
| `Boolean.compare(a, b)` | Compares two booleans | `Boolean.compare(true, false)` | `1` |
| `Boolean.logicalAnd(a, b)` | AND operation | `Boolean.logicalAnd(true, false)` | `false` |
| `Boolean.logicalOr(a, b)` | OR operation | `Boolean.logicalOr(true, false)` | `true` |
| `Boolean.logicalXor(a, b)` | XOR operation | `Boolean.logicalXor(true, true)` | `false` |
| `Boolean.TRUE` | Constant true | `Boolean.TRUE` | `true` |
| `Boolean.FALSE` | Constant false | `Boolean.FALSE` | `false` |

### Real Code Example

```java
// Config files and APIs return "true"/"false" as strings
String isAdminStr = "true";
boolean isAdmin = Boolean.parseBoolean(isAdminStr);

if (isAdmin) {
    System.out.println("Access granted"); // Access granted
}

// Logical operations
System.out.println(Boolean.logicalAnd(true, false));  // false
System.out.println(Boolean.logicalOr(true, false));   // true
```

---

## 9. AUTOBOXING & UNBOXING (Important Concept!)

Java automatically converts between primitive and wrapper class — this is called **Autoboxing** and **Unboxing**.

```java
// Autoboxing — primitive automatically becomes wrapper object
int a = 5;
Integer x = a;          // Java does Integer.valueOf(a) automatically

// Unboxing — wrapper object automatically becomes primitive
Integer y = 10;
int b = y;              // Java does y.intValue() automatically

// This is why ArrayList works with int even though it needs Integer
ArrayList<Integer> list = new ArrayList<>();
list.add(5);            // 5 is autoboxed to Integer automatically
int val = list.get(0);  // Integer is unboxed to int automatically
```

---

## 10. MASTER CHEAT SHEET — All Wrapper Classes

| Primitive | Wrapper | Parse Method | MAX_VALUE |
|-----------|---------|-------------|-----------|
| `int` | `Integer` | `Integer.parseInt()` | `2,147,483,647` |
| `double` | `Double` | `Double.parseDouble()` | `1.79E308` |
| `float` | `Float` | `Float.parseFloat()` | `3.40E38` |
| `long` | `Long` | `Long.parseLong()` | `9.22E18` |
| `short` | `Short` | `Short.parseShort()` | `32,767` |
| `byte` | `Byte` | `Byte.parseByte()` | `127` |
| `char` | `Character` | `Character.toString()` | `'\uFFFF'` |
| `boolean` | `Boolean` | `Boolean.parseBoolean()` | `true/false` |

---

## Which Ones You'll Use 90% of the Time

| Rank | Wrapper | Why |
|------|---------|-----|
| ⭐⭐⭐ | `Integer` | Most common — used everywhere |
| ⭐⭐⭐ | `Double` | Decimal math, prices, calculations |
| ⭐⭐⭐ | `Character` | String validation, password checks |
| ⭐⭐⭐ | `Boolean` | Config, flags, API responses |
| ⭐⭐ | `Long` | Large numbers, timestamps |
| ⭐ | `Float` | Android/game dev memory saving |
| ⭐ | `Short` | Embedded systems, low-level |
| ⭐ | `Byte` | File I/O, networking |

---

*Master Integer, Double, Character, and Boolean first. Those 4 cover 90% of real-world Java code.*
