# Kotlin Stand Alone Guide

## Background

Kotlin is a modern programming language that runs on the Java Virtual Machine (JVM) and is fully interoperable with Java. It was developed by JetBrains and has gained popularity for its concise syntax, null safety features, and functional programming capabilities. Kotlin is often used for Android development, server-side applications, and web development.

## Basic Kotlin Programming

kotlin's entry point is the `main` function, which is defined as follows:

```kotlin
fun main() {
    // Your code here
}
```

 you cannot define multiple `main` functions with different parameters or signatures in the same file. In Kotlin, only one `main` function is allowed as the entry point.

## JDK, JVM, Java and Kotlin

Kotlin is designed to be fully interoperable with Java, and it runs on the Java Virtual Machine (JVM). This means that Kotlin code is compiled into Java bytecode, which can be executed by the JVM. This also means that Java and Kotlin can coexist in the same project, and you can call Java code from Kotlin and vice versa.

Kotlin is a statically typed programming language that is fully compatible with Java, and it is often used for Android development as well as server-side applications. It provides modern language features such as null safety, extension functions, and data classes, which enhance productivity and code safety.Kotlin's syntax is concise and expressive, making it easier to write and maintain code. It supports object-oriented and functional programming paradigms, allowing developers to choose the best approach for their specific use cases.

Kotlin can also be compiled to JavaScript or native code, allowing it to run in different environments beyond the JVM.

## Kotlin Variables

In Kotlin, has two main types of variable declarations: `val` and `var`.

### Var vs Val

In Kotlin, `val` and `var` are used to declare variables, but they have different characteristics:

- `val`: This keyword is used to declare a read-only (immutable) variable. Once a value is assigned to a `val` variable, it cannot be changed. It is similar to a final variable in Java.
- `var`: This keyword is used to declare a mutable variable. The value of a `var` variable can be changed after it has been initialized.

Here's a quick comparison:

```kotlin
fun main() {
    val immutableVariable: String = "This cannot be changed"
    var mutableVariable: Int = 10

    // immutableVariable = "New value" // This will cause a compilation error
    mutableVariable = 20 // This is allowed

    println(immutableVariable) // Output: This cannot be changed
    println(mutableVariable) // Output: 20
}
```

## Kotlin Types

Kotlin is a statically typed language, which means that the type of a variable is known at compile time. Kotlin has a rich type system that includes basic types like `Int`, `String`, `Boolean`, and more complex types like arrays, lists, and maps. Here's an example of declaring different types of variables:

```kotlin
fun main() {
    val number: Int = 42
    val text: String = "Hello, Kotlin!"
    val isTrue: Boolean = true
    val list: List<String> = listOf("Kotlin", "Java", "Python")

    println(number)
    println(text)
    println(isTrue)
    println(list)
}
```

### Number Types

Kotlin supports different number types such as `Byte`, `Short`, `Int`, `Long`, `Double`, and `Float`. Each type has its own range and precision eg:

- `Byte`: 8-bit signed integer, range from -128 to 127.
- `Short`: 16-bit signed integer, range from -32,768 to 32,767.
- `Int`: 32-bit signed integer, range from -2,147,483,648 to 2,147,483,647.
- `Long`: 64-bit signed integer, range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
- `Float`: 32-bit floating-point number.
- `Double`: 64-bit floating-point number.

By default, Kotlin treats numeric literals as `Int` and for floating point numbers, by default Kotlin infers them to be Doubles not Floats unless specified otherwise. You can specify other types by appending a suffix, such as `L` for `Long` and `F` for `Float`. each suffix is used to indicate the type of the numeric literal and should be written in capital letters:

```kotlin
fun main() {
    val byteValue: Byte = 10
    val shortValue: Short = 1000
    val intValue: Int = 100000
    val longValue: Long = 10000000000L // 'L' suffix for Long
    val floatValue: Float = 10.5F // 'F' suffix for Float
    val doubleValue: Double = 20.99 // Double is the default type for floating-point numbers

    println(byteValue)
    println(shortValue)
    println(intValue)
    println(longValue)
    println(floatValue)
    println(doubleValue)
}
```

### String & Char Types

In Kotlin, strings are represented by the `String` class. You can create a string using double quotes (`"`). Kotlin also supports multi-line strings using triple quotes (`"""`), which allows you to include line breaks and special characters without escaping them.

Characters in Kotlin are represented by the `Char` type, which is a single 16-bit Unicode character. You can create a character using single quotes (`'`).

Example of strings and characters in Kotlin:

```kotlin
fun main() {
    val singleChar: Char = 'A' // Single character
    val stringValue: String = "Hello, Kotlin!" // String with double quotes
    val multiLineString: String = """
        This is a multi-line string.
        It can span multiple lines.
    """.trimIndent() // Multi-line string with triple quotes

    println(singleChar) // Output: A
    println(stringValue) // Output: Hello, Kotlin!
    println(multiLineString) // Output: This is a multi-line string. It can span multiple lines.
}
```

### Boolean Type

In Kotlin, the `Boolean` type represents a value that can be either `true` or `false`. It is commonly used for conditional statements and logical operations. You can declare a Boolean variable using the `Boolean` type and assign it a value of either `true` or `false`.

```kotlin
fun main() {
    val isKotlinFun: Boolean = true // Boolean variable
    val isJavaFun: Boolean = false // Another Boolean variable

    if (isKotlinFun) {
        println("Kotlin is fun!") // This will be printed
    }

    if (!isJavaFun) {
        println("Java is not fun!") // This will be printed
    }
}
```

Boolean values are often used in conditional statements, loops, and logical expressions to control the flow of the program. When we speak of control flow, we refer to the ability to make decisions in the code based on certain conditions, since the programme is run from top to bottom, the control flow allows us to change this order based on conditions.

### Type Inference

Kotlin supports type inference, which means that the compiler can automatically determine the type of a variable based on the value assigned to it. This allows you to omit the type declaration .

## Operators

Kotlin supports a wide range of operators, including arithmetic, comparison, logical, and assignment operators.

### Arithmetic Operators

Kotlin provides standard arithmetic operators for performing mathematical operations. These operators include:

- `+`: Addition
- `-`: Subtraction
- `*`: Multiplication
- `/`: Division
- `%`: Modulus (remainder)

#### Postfix and Prefix Operators

In Kotlin, you can use postfix and prefix operators to increment or decrement a variable's value. The `++` operator is used for incrementing, and the `--` operator is used for decrementing.

The postfix operator (`x++` or `x--`) increments or decrements the value after the expression is evaluated, while the prefix operator (`++x` or `--x`) increments or decrements the value before the expression is evaluated.

```kotlin
fun main() {
    var x = 5

    // Postfix increment
    println(x++) // Output: 5 (x is now 6)
    println(x)   // Output: 6

    // Prefix increment
    println(++x) // Output: 7 (x is now 7)

    // Postfix decrement
    println(x--) // Output: 7 (x is now 6)
    println(x)   // Output: 6

    // Prefix decrement
    println(--x) // Output: 5 (x is now 5)
    println(x)   // Output: 5
}
```

### Comparison Operators

Kotlin provides comparison operators to compare values. These operators include:

- `==`: Equal to
- `!=`: Not equal to
- `<`: Less than
- `<=`: Less than or equal to
- `>`: Greater than
- `>=`: Greater than or equal to

Kotlin however does not support the `===` operator for reference equality like Java does. Instead, it uses `==` for structural equality and `===` for referential equality. The difference between these two is important to understand:

- `==`: Checks if two objects are structurally equal (i.e., they have the same content).
- `===`: Checks if two references point to the same object in memory (i.e., they are the same instance).

```kotlin
fun main() {
    val a = 5
    val b = 10

    println(a == b) // Output: false (structural equality)
    println(a != b) // Output: true
    println(a < b)  // Output: true
    println(a <= b) // Output: true
    println(a > b)  // Output: false
    println(a >= b) // Output: false

    val str1 = "Hello"
    val str2 = "Hello"
    println(str1 === str2) // Output: true (referential equality, same object in memory)
}
```

In the code above, the `===` operator checks if `str1` and `str2` refer to the same object in memory, which is true in this case because both strings are created from the same literal. However, if you create two different string objects with the same content, `===` would return false. So it's important to use `==` for content comparison and `===` for reference comparison and to be aware of the difference when working with objects in Kotlin.

#### Quirk 😁

It is important to note that if you use `===` to compare types, which is often done in languages like JavaScript, the result will always be `false` in Kotlin, because `===` is used for reference equality, not type checking. To check if two variables are of the same type, you should use the `is` operator.

```kotlin
fun main() {
    val number: Int = 42
    val text: String = "Hello"

    println(number is Int) // Output: true
    println(text is String) // Output: true
    println(number is String) // Output: false
}
```
