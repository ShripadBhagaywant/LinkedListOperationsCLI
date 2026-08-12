# 🔗 Java Linked List Operations

A **menu-driven Java application** that demonstrates the implementation and core operations of a **Singly Linked List** from scratch without using Java's built-in `LinkedList` class.

This project was created to understand how linked lists work internally and to practice fundamental **Data Structures & Algorithms (DSA)** concepts in Java.

---

## 📌 Features

The application supports the following operations:

### ➕ Insertion

* Insert a node at the **beginning/head**
* Insert a node at the **end/tail**
* Insert a node at a **specific position**

### ➖ Deletion

* Delete the **first node**
* Delete the **last node**
* Delete a node from a **specific position**

### 🔍 Searching

* Search for a specific value in the linked list
* Returns whether the requested data is present

### 👀 Display

* Traverse the complete linked list
* Display nodes in a readable format using `=>`

Example:

```text
10=>20=>30=>40
```

### 🖥️ Menu-Driven Interface

The application provides an interactive console menu:

```text
*_*_*_*_* MENU *_*_*_*_*

Enter 1 To Insert
Enter 2 To Delete
Enter 3 To Search
Enter 4 To Display
Enter 5 To Exit
```

---

## 🧠 Data Structure Used

### Singly Linked List

Each node contains two parts:

```java
class Node {
    int data;
    Node next;
}
```

* `data` → stores the value
* `next` → stores the reference to the next node

The linked list maintains a `head` reference pointing to the first node.

```text
Head
 ↓
[10 | •] → [20 | •] → [30 | •] → null
```

---

## ⚙️ Operations Implemented

| Operation           | Method                      | Description                          |
| ------------------- | --------------------------- | ------------------------------------ |
| Insert at Beginning | `insertAtBeginning()`       | Adds a new node at the head          |
| Insert at Last      | `insertAtLast()`            | Adds a new node at the tail          |
| Insert at Position  | `insertAtSpecificPostion()` | Adds a node at a given position      |
| Delete First        | `deleteFrist()`             | Removes the first node               |
| Delete Last         | `deleteLast()`              | Removes the last node                |
| Delete at Position  | `deleteSpecificPostion()`   | Removes a node from a given position |
| Search              | `searchData()`              | Searches for a value                 |
| Display             | `printData()`               | Traverses and prints the list        |

---

## 🏗️ Project Structure

```text
LinkedList-Operations/
│
├── Operation.java
└── README.md
```

The `Operation.java` file contains:

* `Node` class
* Linked list operations
* Menu methods
* User input handling
* Main application logic

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project

Open the project in:

* IntelliJ IDEA
* Eclipse
* VS Code
* Any Java-supported IDE

### 3. Compile

```bash
javac Operation.java
```

### 4. Run

```bash
java Operation
```

---

## 💻 Example

Suppose we insert:

```text
10
20
30
```

The linked list becomes:

```text
10=>20=>30
```

If we insert `5` at the beginning:

```text
5=>10=>20=>30
```

If we delete the first node:

```text
10=>20=>30
```

If we search for `20`:

```text
Yes, data is present in list
```

---

## ⏱️ Time Complexity

| Operation           | Time Complexity |
| ------------------- | --------------: |
| Insert at Beginning |          `O(1)` |
| Insert at Last      |          `O(n)` |
| Insert at Position  |          `O(n)` |
| Delete First        |          `O(1)` |
| Delete Last         |          `O(n)` |
| Delete at Position  |          `O(n)` |
| Search              |          `O(n)` |
| Display             |          `O(n)` |

---

## 🎯 Learning Objectives

This project helps practice:

* Singly Linked Lists
* Node creation
* References in Java
* Traversal
* Insertion algorithms
* Deletion algorithms
* Searching
* Time complexity
* Menu-driven programming
* Object-oriented programming fundamentals

---

## 🛠️ Technologies

* **Java**
* **Java OOP**
* **Data Structures & Algorithms**
* **Java Scanner**
* **Console-based Application**

---

## 📚 Concepts Practiced

```text
Java
 │
 ├── Classes & Objects
 ├── Constructors
 ├── References
 ├── Loops
 ├── Conditional Statements
 ├── Methods
 ├── Exception Handling
 │
 └── Data Structures
      └── Singly Linked List
           ├── Insertion
           ├── Deletion
           ├── Searching
           └── Traversal
```

---

## 👨‍💻 Author

**Shripad Bhagaywant**

Java Full Stack Developer | Spring Boot | React.js | REST APIs

📍 Pune, India

---

⭐ If you find this project useful for learning Java Data Structures, consider giving the repository a star!
