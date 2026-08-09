# Java 21 Features & Interview Guide

This guide covers the major features introduced up to **Java 21 (LTS)** with key interview questions and practical code samples located in `src/main/java/com/interview/java21/`.

---

## 1. Virtual Threads (JEP 444)
Lightweight threads managed by the JVM rather than the OS, dramatically reducing the resource cost of concurrent applications.

### Interview Questions
- **Q:** What are Virtual Threads in Java 21?
  - **A:** Virtual threads are lightweight, managed execution threads provided by the JVM. Unlike platform (OS) threads, millions of virtual threads can run concurrently with low overhead.
- **Q:** How do Virtual Threads differ from Platform Threads?
  - **A:** Platform threads map 1:1 to OS kernel threads and are heavy in memory/context switching costs. Virtual threads are scheduled onto a pool of carrier (platform) threads by the JVM and block only the virtual thread, releasing carrier threads during I/O.

### Example File
- `VirtualThreadsExample.java`

---

## 2. Sequenced Collections (JEP 431)
Provides unified interfaces (`SequencedCollection`, `SequencedSet`, `SequencedMap`) with defined encounter order, direct access to first/last elements, and reverse views.

### Interview Questions
- **Q:** What problem do Sequenced Collections solve?
  - **A:** Before Java 21, getting the first or last element of a collection differed depending on the interface (e.g., `list.get(0)` vs `deque.getFirst()`). Sequenced collections provide standard methods (`getFirst()`, `getLast()`, `addFirst()`, `addLast()`, `reversed()`).

### Example File
- `SequencedCollectionsExample.java`

---

## 3. Record Patterns (JEP 440)
Allows deconstructing record values inside `instanceof` checks and `switch` statements directly.

### Interview Questions
- **Q:** What are Record Patterns?
  - **A:** Record patterns allow destructuring a record into its components during type checks (e.g., `if (obj instanceof Point(int x, int y))`), simplifying code that extracts components.

### Example File
- `RecordPatternsExample.java`

---

## 4. Pattern Matching for Switch (JEP 441)
Enhances `switch` statements and expressions to support pattern matching for any object type, null-handling, and guarded cases (`when`).

### Interview Questions
- **Q:** How does pattern matching in switch improve code safety?
  - **A:** It allows matching complex types directly, safely handles `null` cases (`case null`), and supports conditional refinements using `when` clauses without needing nested `if` statements.

### Example File
- `PatternMatchingSwitchExample.java`
