# 🧮 Java Calculator Projects

This repository contains **two versions of a simple calculator** built in Java — one using **AWT (Abstract Window Toolkit)** for a GUI-based experience, and another using **Exception Handling** for a robust console-based implementation.

These projects demonstrate two distinct approaches to problem-solving in Java:  
- **AWT Calculator** → Focuses on user interface design and event-driven programming.  
- **Exception Handling Calculator** → Focuses on input validation, error management, and clean logic flow.

---

## 📘 Table of Contents

- [Introduction](#introduction)
- [Project 1: AWT Calculator](#project-1-awt-calculator)
- [Project 2: Exception Handling Calculator](#project-2-exception-handling-calculator)
- [Comparison](#comparison)
- [How to Run](#how-to-run)
- [Developer Notes](#developer-notes)
- [License](#license)

---

## 🧩 Introduction

Both calculator implementations were created to demonstrate Java’s flexibility in handling **GUI-based** and **non-GUI (logic-based)** applications.  
Each version supports basic arithmetic operations and includes design considerations relevant to its environment.

---

## 🪟 Project 1: AWT Calculator

### 🧠 Overview
A GUI-based calculator built using **Java AWT components**, showcasing event-driven programming.

### ⚙️ Features
- Graphical interface with buttons and text fields  
- Real-time operation handling (addition, subtraction, multiplication, division)  
- Clear and Reset functionalities  
- Event listeners for button actions  

### 🏗️ Technologies Used
- **Java AWT** (`Frame`, `Button`, `TextField`, `Label`, etc.)  
- **Event Handling** (`ActionListener`)  

### 🧩 Example UI
```
 -------------------------
|  Java AWT Calculator   |
 -------------------------
|  [ 7 ] [ 8 ] [ 9 ] [+] |
|  [ 4 ] [ 5 ] [ 6 ] [-] |
|  [ 1 ] [ 2 ] [ 3 ] [*] |
|  [ 0 ] [ C ] [ = ] [/] |
 -------------------------
```

### 🧾 Sample Output
```
Result: 25
```

---

## 💻 Project 2: Exception Handling Calculator

### 🧠 Overview
A **console-based** calculator that emphasizes input validation and runtime error handling using Java’s **try-catch** mechanism.

### ⚙️ Features
- Performs all basic arithmetic operations  
- Handles invalid input types (e.g., characters or symbols)  
- Handles division by zero gracefully  
- Clean input prompts and result outputs  

### 🧱 Technologies Used
- **Core Java** (no AWT or GUI elements)  
- **Exception Handling** (`try`, `catch`, `finally`, `throw`)  
- **Scanner** for user input  

### 🧾 Sample Execution
```
Enter first number: 10
Enter operator (+, -, *, /): /
Enter second number: 0
Error: Division by zero is not allowed.
```

---

## ⚖️ Comparison

| Feature | AWT Calculator | Exception Handling Calculator |
|----------|----------------|-------------------------------|
| Interface | Graphical (GUI) | Console (Text-based) |
| Libraries | AWT, Event Handling | Core Java, Scanner |
| Focus | UI & Event Logic | Input Validation & Exceptions |
| Error Handling | Minimal | Robust |
| User Experience | Interactive | Functional |

---

## ▶️ How to Run

### 🪟 Run AWT Calculator
```bash
javac AwtCalculator.java
java AwtCalculator
```

### 💻 Run Exception Handling Calculator
```bash
javac ExceptionCalculator.java
java ExceptionCalculator
```

Ensure both `.java` files are in the same directory and Java (JDK 8 or later) is installed on your system.

---

## 🧠 Developer Notes

- These projects are great starting points for learning **event handling**, **GUI programming**, and **exception management** in Java.  
- You can extend them by adding:
  - Memory functions (M+, M-, MR)
  - Scientific operations (sin, cos, log)
  - Input history or clear entry functionality  

---

## 🪪 License

This project is released under the **MIT License**.  
Feel free to modify, distribute, and use these examples for educational or personal development purposes.

---
