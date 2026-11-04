# ☕ Day 18 — Multithreading

## 🎯 Concept
**Multithreading** in Java allows concurrent execution of two or more parts of a program to maximize CPU utilization. A **thread** is a lightweight sub-process that shares memory with other threads within the same process. Multithreading enables background operations, responsive user interfaces, and parallel task execution.

## 🧠 Key Points
- **Thread Creation Approaches:**
  1. *Extending `Thread` class:* Override `public void run()`. Start with `thread.start()`.
  2. *Implementing `Runnable` interface:* Implement `public void run()`, pass the `Runnable` instance to `new Thread(runnable)`, and call `.start()`.
  *(Prefer `Runnable` because Java supports single inheritance of classes but multiple interfaces).*
- **`start()` vs `run()`:**
  - `start()` allocates a new call stack and triggers the thread asynchronously.
  - Calling `run()` directly merely executes the method synchronously on the caller's thread without creating a separate thread.
- **Thread Lifecycle:** `New` → `Runnable` → `Running` → `Blocked / Waiting` → `Terminated`.
- **Key Thread Methods:**
  - `Thread.sleep(millis)`: Pauses execution of the current thread for a specified duration (throws `InterruptedException`).
  - `thread.join()`: Forces the calling thread to wait until `thread` completes its execution.
  - `thread.isAlive()`: Returns whether the thread has started and not yet terminated.
  - `Thread.currentThread()`: Returns a reference to the currently executing thread.
- **Race Condition & Synchronization:**
  - Occurs when multiple threads read and write shared mutable state concurrently without coordination.
  - The `synchronized` keyword locks access to a method or code block so only one thread can execute it at any given time.

## 💻 Code Example
```java
class Counter {
    private int count = 0;

    // synchronized prevents race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish

        System.out.println("Final count: " + counter.getCount()); // Guaranteed 2000
    }
}
```
*(from `CounterPractice.java` & `SynchronizationExample.java`)*

## 🧪 Programs Written
| File | What it does |
|---|---|
| `ThreadExample.java` | Creating and starting threads by extending the Thread class |
| `RunnableExample.java` | Creating threads by implementing the Runnable interface |
| `SleepExample.java` | Pausing thread execution using Thread.sleep() |
| `JoinExample.java` | Coordinating thread execution using join() to wait for completion |
| `JoinPractice.java` | Sequential thread coordination with join() |
| `SynchronizationExample.java` | Protecting shared resources using the synchronized keyword |
| `CounterPractice.java` | Resolving race conditions on a shared counter across threads |
| `ThreadInfo.java` | Inspecting thread properties (id, name, priority, alive state) |
| `TwoThreadsPractice.java` | Concurrent interleaved execution of two independent threads |
| `TableThreadPractice.java` | Multi-threaded multiplication table computation |
| `DelayedTaskPractice.java` | Simulating delayed asynchronous execution |
| `MultithreadedTaskRunner.java` | Mini-project: Concurrent task runner executing and coordinating worker threads |

## ⚠️ Common Mistakes
- Calling `run()` instead of `start()` (runs on the main thread, no concurrency).
- Calling `start()` twice on the same thread instance throws `IllegalThreadStateException`.
- Missing `join()` when the main thread needs results from worker threads, leading to race conditions or incomplete reads.
- Not handling or ignoring `InterruptedException` thrown by `sleep()` and `join()`.
- Over-synchronization causing performance bottlenecks or deadlocks when multiple threads wait on each other's locks.

## ❓ Interview Questions
- **Q: What is the difference between `Thread` class and `Runnable` interface?**  
  A: Implementing `Runnable` is better practice because it keeps tasks decoupled from thread mechanics and allows extending other classes, whereas extending `Thread` consumes the single class inheritance slot.
- **Q: What happens if you call `run()` directly instead of `start()`?**  
  A: No new thread is spawned. The `run()` method executes as a normal method on the currently executing thread.
- **Q: What is a race condition and how is it resolved?**  
  A: A race condition occurs when concurrent threads access and modify shared data simultaneously, leading to unpredictable results. It is resolved using the `synchronized` keyword, `ReentrantLock`, or atomic variables.
- **Q: What is the purpose of `join()` in Java?**  
  A: `join()` halts the execution of the calling thread until the thread on which `join()` was called completes its execution.

## 🔗 Practice Code
[📁 Day-18-Multithreading](../Day-18-Multithreading)

---
*🤖 Auto-generated note*
