# Advanced Java & Spring Boot Lab Experiments

This repository contains practical Java lab programs covering the Java Collections Framework, Exception Handling, Multithreading & Concurrency, and Spring Boot REST APIs[cite: 1].

## 📋 List of Experiments

| Sr. No. | Aim of Experiment | Key Concepts |
| :---: | :--- | :--- |
| **1** | Write a simple Java program to create an `ArrayList`, `LinkedList`, `HashSet`, `LinkedHashSet`, and `TreeSet`, add elements to each collection, and demonstrate how they handle duplicate elements[cite: 1]. | Java Collections (`List`, `Set`), Duplicate Handling |
| **2** | Write a simple Java program to create and perform operations like add, remove, iterate, and sort on `HashMap`, `LinkedHashMap`, and `TreeMap`. Use Map methods to find duplicate elements in a given list[cite: 1]. | `Map` Interface, Iteration, Sorting, Frequency Counting |
| **3** | Write a simple Java program to demonstrate the creation of a custom exception class and exception propagation[cite: 1]. | Custom Exceptions, `try-catch-throw-throws`, Call Stack Propagation |
| **4** | Develop a Java program to implement multithreading using the `Thread` class and `Runnable` interface, demonstrating the use of `join()` and `sleep()` methods[cite: 1]. | Multithreading, `Thread`, `Runnable`, Thread Lifecycle (`join()`, `sleep()`) |
| **5** | Develop a Java program to demonstrate thread safety using the `synchronized` keyword and inter-thread communication using `wait()`, `notify()`, and `notifyAll()` methods[cite: 1]. | Synchronization, Thread Safety, Inter-thread Communication |
| **6** | Design a Java program to manage thread pools using `ExecutorService` and handle multithreading tasks with return values using `Callable` and `Future`[cite: 1]. | Thread Pools, `ExecutorService`, `Callable`, `Future` |
| **7** | Write a Java program to demonstrate concurrent data handling using `ConcurrentHashMap`, `CopyOnWriteArrayList`, and `BlockingQueue`[cite: 1]. | Concurrent Collections (`java.util.concurrent`) |
| **8** | Create a basic Spring Boot application with REST endpoints. Create an array and perform CRUD operations (Create, Read, Update, Delete) using that array[cite: 1]. | Spring Boot, RESTful APIs, HTTP Methods (`GET`, `POST`, `PUT`, `DELETE`) |

---

## 🛠️ Prerequisites & Setup

* **Java Development Kit (JDK):** JDK 17 or higher recommended
* **Build Tool (for Experiment 8):** Maven or Gradle
* **IDE:** IntelliJ IDEA, Eclipse, or VS Code

### Running Standard Java Programs (Experiments 1–7)
```bash
# Compile the Java file
javac ExperimentName.java

# Run the compiled bytecode
java ExperimentName
