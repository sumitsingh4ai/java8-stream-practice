# Java & System Design Interview – All Topics

A complete index of every topic in this repository, linking to the detailed guides and code examples.

---

## 1. Java 8: Streams & Functional Programming

| Topic | Example / Reference |
|-------|---------------------|
| Stream basics (`filter`, `map`, `collect`) | `src/main/java/com/example/stream/StreamPractice.java`, `StreamExample.java` |
| Filtering & grouping data | `StreamExample.java` |
| Frequency counting (`groupingBy` + `counting`) | `FrequencyCountExample.java` |
| Sorting with `Comparator` & method references | `ComparatorExample.java` |
| `Optional` – avoiding null checks | `OptionalExample.java` |
| Async programming with `CompletableFuture` | `CompletableFutureExample.java` |
| Strategy pattern with String handling / payment processors | `PaymentProcessor.java` |

### Interview Questions
- What is the difference between `map`, `flatMap`, and `peek`?
- Is a Stream reusable? What happens after a terminal operation?
- `Collectors.toList()` vs `Stream.toList()`?
- When should you use `Optional` instead of null?

---

## 2. Java 17 Features

| Topic | JEP | Example File |
|-------|-----|--------------|
| Text Blocks | 378 | `Java17/TextBlocksExample.java` |
| Records | 395 | `Java17/RecordExample.java` |
| Sealed Classes | 409 | `Java17/SealedClassesExample.java` |
| Pattern Matching for `instanceof` | 394 | `Java17/PatternMatchingExample.java` |
| Switch Expressions | 361 | `Java17/SwitchExpressionsExample.java` |

> Full Q&A: see **JAVA17_INTERVIEW_GUIDE.md**

---

## 3. Java 21 Features (LTS)

| Topic | JEP | Example File |
|-------|-----|--------------|
| Virtual Threads | 444 | `Java21/VirtualThreadsExample.java` |
| Sequenced Collections | 431 | `Java21/SequencedCollectionsExample.java` |
| Record Patterns | 440 | `Java21/RecordPatternsExample.java` |
| Pattern Matching for Switch | 441 | `Java21/PatternMatchingSwitchExample.java` |
| `Stream.toList()` API | (Java 16+) | `Java17/Java17StreamAndAPIsExample.java` |

> Full Q&A: see **JAVA21_INTERVIEW_GUIDE.md**

---

## 4. System Design

See **SYSTEM_DESIGN_PREP.md** for the complete guide.

### Key topics
- Scalability (vertical vs. horizontal, load balancing)
- Reliability & fault tolerance (replication, CAP theorem)
- Consistency & data management (sharding, eventual consistency)
- Performance (latency vs. throughput, caching patterns)
- Design patterns (microservices, event-driven, cache-aside, rate limiting)
- API gateways & service meshes

### Common interview problems
1. Design a URL shortener
2. Design a real-time chat system
3. Design a distributed cache
4. Design a scalable e-commerce checkout
5. Design a ride-sharing service

---

## 5. Additional Coding Challenges
- Missing number in a sequence – `src/main/java/com/example/stream/Missingnum.java`

---

## Repository Layout
```
├── JAVA17_INTERVIEW_GUIDE.md     # Java 17 feature Q&A
├── JAVA21_INTERVIEW_GUIDE.md     # Java 21 feature Q&A
├── SYSTEM_DESIGN_PREP.md         # System design interview prep
├── ALL_TOPICS.md                 # This file
└── src/main/java
    ├── com/example/stream/       # Stream/Optional/CompletableFuture examples
    ├── com/interview/java17/     # Java 17 feature examples
    └── com/interview/java21/     # Java 21 feature examples
```

## Suggested Study Order
1. Java 8 Streams & functional APIs (foundation)
2. Java 17 features (records, sealed classes, switch expressions)
3. Java 21 features (virtual threads, pattern matching, sequenced collections)
4. System design fundamentals
5. Practice with mock interviews & coding challenges