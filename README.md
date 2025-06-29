# 📚 Library Management System - Desktop Application

A Java-based desktop application built with Swing and Oracle SQL Database to manage a library's book inventory, member interactions, and transaction records. This project emphasizes Object-Oriented Programming principles and user-friendly interfaces for efficient book management.

---

## Technologies Used

- **Java** (Core + OOP Concepts)
- **Java Swing** (GUI Development)
- **Oracle SQL** (Backend Database)
- **JDBC** (Database Connectivity)

---

## Features

- **Search Books:** Find books by title, author, or category.
- **Issue Books:** Issue books to registered members with transaction logging.
- **Return Books:** Return issued books and update availability status.
- **Receipts:** Generate and fetch receipts for transactions.
- **Secure Storage:** All data operations are securely managed via Oracle SQL.

---

## OOP Principles Applied

- **Encapsulation:** Restricted direct access to class internals using getters/setters.
- **Abstraction:** Simplified interfaces for complex data operations.
- **Inheritance:** Created reusable and extendable components.
- **Polymorphism:** Enabled method overriding and dynamic behavior.

---

## Application Modules

- `Login.java`: Handles user authentication
- `MainDashboard.java`: Navigation and UI for managing modules
- `SearchBook.java`: UI and backend logic to search available books
- `IssueBook.java`: Handles issuing operations
- `ReturnBook.java`: Handles return transactions
- `ReceiptManager.java`: Generates and fetches receipts
- `DBConnection.java`: Manages Oracle SQL database connection

---

## Database Schema (Oracle SQL)

Tables include:
- `books(book_id, title, author)`
- `issue_details(student_name, roll_num, email, book, department, semester, issue_date, return_date)`
- `return_details(student_name, roll_num, email, book, department, semester, issue_date, return_date)`

> Ensure Oracle Database is running and tables are created before launching the app

---

## How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/TahaImran7/Library_Management_System.git
