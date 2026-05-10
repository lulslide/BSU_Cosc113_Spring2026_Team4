README.md

Course: COSC 113 – Computer Science II

Proposal Due: April 29, 2026

Final Due: May 6, 2025

Team Size: 2–4 Students

 Team Members

Name

GitHub Username

Role

Dylan

@lulslide

Role: Abstract classes, File I/O (saving/loading), GitHub repo setup

Tristan

@sosaintvier

Role: Subclasses (Inheritance), Business logic (Fees/Loans), Polymorphism

Cristien

@1Cristien

Role: UI/Console Menu, Custom Exceptions, Code Review/QA


 Project Description

Binner is a Digital Library Manager designed for librarians and school administrators to assist with media tracking. It solves the problem of having to manually type in data data by providing a centralized system to manage books and DVDs, track loan statuses, and ensure data is never lost by saving information to a permanent local file.

Features

Feature 1: Multi-Media Inventory - Supports different types of library items (Books and DVDs) with specific attributes

Feature 2: Real-Time Loan Tracking - Allows users to check out items by ID with instant status updates

Feature 3: Good Storage - Uses File I/O to save the entire library state to a text file so data remains after the program closes

Feature 4: Smart Fee Calculations - Automatically determines late fees based on the specific type of media being borrowed

 Architecture & OOP Design

This project applies all four OOP principles:

Encapsulation — This was used in the LibraryItem class by making fields like id, title, and isCheckedOut private. Access is controlled through public getters and setters, protecting certain data from unauthorized changes.

Inheritance — We established a class hierarchy where Book and DVD extend the LibraryItem base class. This allows the subclasses to inherit common traits while adding their own specific behavior.

Polymorphism — Demonstrated through Method Overriding. The calculateLateFee() method is defined in the parent class but behaves differently for Book ($0.50/day) and DVD ($2.00/day) objects at runtime.

Abstraction — The LibraryItem class is declared as abstract. This ensures that no one can create a generic "Item". You must create a specific Book or DVD. It also defines the abstract method calculateLateFee that all items must have.

Design Pattern(s) Used: Template Method Pattern - The abstract LibraryItem defines the "template" for what a library item looks like, while subclasses fill in the specific fee-calculation logic.

 Advanced Java Features

File I/O — The LibraryManager class uses FileWriter and PrintWriter to iterate through the HashMap and save every item’s ID, Title, and Status into a library_data.txt file.

Exception Handling — Custom exception: We implemented a Custom Exception named ItemUnavailableException. This is specifically thrown when a user tries to check out an item that doesn't exist or is already on loan, preventing the program from crashing.

 Tech Stack

Java 17+

GitHub / GitHub Flow

[Any libraries or tools]

 How to Run

# Clone the repository
git clone https://github.com/[your-org]/[repo-name].git

# Navigate to the project directory
cd [repo-name]

# Compile
javac -d out src/**/*.java

# Run
java -cp out Main


 GitHub Workflow

We follow GitHub Flow:

Create a feature branch: git checkout -b feature/your-feature

Commit frequently with clear messages

Open a Pull Request for peer review

Merge after approval

 Project Structure

src/
├── main/
│   ├── Main.java
│   ├── models/
│   ├── services/
│   └── exceptions/
├── data/

└── README.md


 Contribution Log

Member

Key Contributions

PR Links

[Name 1]

[Feature/module]

[#PR]

[Name 2]

[Feature/module]

[#PR]

[Name 3]

[Feature/module]

[#PR]

 License

This project is submitted for academic purposes — COSC 113, Spring 2026.
