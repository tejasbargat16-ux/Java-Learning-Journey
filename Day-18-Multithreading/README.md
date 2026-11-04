# ☕ Java Day 18 — Multithreading

Welcome to Day 18 of my Java Learning Journey!

Today, I learned how Java supports concurrent execution using multiple threads.

## 🎯 Learning Objectives

- Understand processes and threads.
- Understand the Java thread lifecycle.
- Create threads using the `Thread` class.
- Create threads using the `Runnable` interface.
- Use `start()`, `run()`, `sleep()`, and `join()`.
- Check thread status using `isAlive()`.
- Understand race conditions.
- Use the `synchronized` keyword.
- Build a multithreaded task runner.

## 📚 Topics Covered

| Topic | Description |
|---|---|
| Multithreading | Concurrent execution of tasks |
| Thread | Basic thread creation |
| Runnable | Task implementation |
| start() | Starts a new thread |
| sleep() | Pauses the current thread |
| join() | Waits for a thread to finish |
| isAlive() | Checks thread execution status |
| Synchronization | Protects shared data |

## 📂 Programs

1. `ThreadExample.java`
2. `RunnableExample.java`
3. `SleepExample.java`
4. `JoinExample.java`
5. `SynchronizationExample.java`
6. `ThreadInfo.java`
7. `TwoThreadsPractice.java`
8. `TableThreadPractice.java`
9. `JoinPractice.java`
10. `CounterPractice.java`
11. `DelayedTaskPractice.java`
12. `MultithreadedTaskRunner.java`

## 🚀 Mini Project: Multithreaded Task Runner

A Java application that executes three independent tasks using separate threads:

- Data Processing
- Report Generation
- Notification

The main thread uses `join()` to wait for all tasks to finish.

## 💻 Compile and Run

Compile all Java files:

```bash
javac *.java
```

Run the mini-project:

```bash
java MultithreadedTaskRunner
```

## 🧠 Key Learnings

- A thread represents an independent execution path.
- `start()` starts a new thread; directly calling `run()` does not.
- `Runnable` separates a task from the thread executing it.
- `sleep()` pauses the current thread.
- `join()` waits for another thread to finish.
- Synchronization protects shared data from concurrent update problems.
- Thread execution order is not guaranteed.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming
- Multithreading
- Termux / VS Code
- Git and GitHub

## 📈 Learning Progress

**Day 18 — Completed:** Java Multithreading

Next: Day 19 — Java Lambda Expressions and Functional Programming.

---

*Consistency beats intensity. One day, one concept, one commit.* ⚡