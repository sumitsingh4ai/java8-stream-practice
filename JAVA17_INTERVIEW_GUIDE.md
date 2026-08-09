# Java 17 Features & Interview Guide

This guide covers the major features introduced up to **Java 17 (LTS)** with key interview questions and practical code samples located in `src/main/java/com/interview/java17/`.

---

## 1. Text Blocks (JEP 378)
Multi-line string literals that avoid the need for most escape sequences and automatically format the string predictably.

### Interview Questions
- **Q:** What are Text Blocks in Java?
  - **A:** Text blocks are 2D multi-line string literals enclosed within triple quotes (`"""`). They improve code readability when representing multi-line content such as JSON, HTML, XML, or SQL queries.
- **Q:** How are stripIndent() and incidental white spaces handled?
  - **A:** The Java compiler automatically strips away incidental leading whitespace based on the position of the closing triple quotes or non-whitespace content.

### Example File
- `TextBlocksExample.java`

---

## 2. Records (JEP 395)
Immutable data carrier classes that automatically generate constructors, getters, `equals()`, `hashCode()`, and `toString()`.

### Interview Questions
- **Q:** What is a Record in Java?
  - **A:** A record is a special type of class designed to hold immutable data. It reduces boilerplate code significantly by generating field accessors, constructors, and standard object methods automatically.
- **Q:** Can a record extend another class?
  - **A:** No. Records implicitly extend `java.lang.Record`, and Java does not support multiple implementation inheritance. However, records can implement interfaces.
- **Q:** Are record fields mutable?
  - **A:** No, all record fields are `final` and private by default.

### Example File
- `RecordExample.java`

---

## 3. Sealed Classes (JEP 409)
Classes or interfaces that restrict which other classes or interfaces may extend or implement them.

### Interview Questions
- **Q:** What are Sealed Classes?
  - **A:** Sealed classes give developers control over class hierarchies by explicitly declaring permitted subtypes using the `permits` keyword.
- **Q:** What modifier requirements exist for subtypes of a sealed class?
  - **A:** Any class extending a sealed class must explicitly specify one of three modifiers:
    1. `final` (cannot be extended further)
    2. `sealed` (can be extended by a restricted list of permitted subclasses)
    3. `non-sealed` (opens the hierarchy for arbitrary extension)

### Example File
- `SealedClassesExample.java`

---

## 4. Pattern Matching for `instanceof` (JEP 394)
Simplifies class casting by allowing type testing and variable declaration in a single step.

### Interview Questions
- **Q:** How does Pattern Matching for `instanceof` improve code readability?
  - **A:** It eliminates redundant explicit type casting after an `instanceof` check. If the condition evaluates to true, the binding variable is automatically cast and scoped appropriately.

### Example File
- `PatternMatchingExample.java`

---

## 5. Switch Expressions (JEP 361)
Enhances `switch` to be used as either a statement or an expression using arrow syntax (`->`), yielding values cleanly without fallthrough bugs.

### Interview Questions
- **Q:** What is the difference between classic switch and Switch Expressions?
  - **A:** Switch expressions can return a value directly, allow multiple comma-separated case labels, use arrow syntax to prevent fallthrough without needing `break`, and require exhaustive case coverage.

### Example File
- `SwitchExpressionsExample.java`

---

## 6. Stream.toList() API (Java 16+)
Introduced a direct collector shortcut to gather Stream elements into an unmodifiable List.

### Interview Questions
- **Q:** What is the difference between `Collectors.toList()` and `Stream.toList()`?
  - **A:** `Stream.toList()` produces an unmodifiable list and is more concise/efficient, whereas `Collectors.toList()` usually returns a mutable `ArrayList` (though not guaranteed by specification).

### Example File
- `Java17StreamAndAPIsExample.java`
