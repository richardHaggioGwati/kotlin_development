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

### Type Inference

Kotlin supports type inference, which means that the compiler can automatically determine the type of a variable based on the value assigned to it. This allows you to omit the type declaration .
