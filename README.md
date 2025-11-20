# EstiMate Console

## Overview
A robust, beginner-friendly Java console application designed to help you estimate both material and labor costs for architecture or construction projects. This tool is entirely text-based and runs in your terminal, making it easy to use and understand for new programmers.

The program guides you through creating a new estimate, adding items (such as materials and labor), viewing a summary of all costs, and saving your results to a markdown file. All user input is validated to prevent errors, and the application provides clear instructions and feedback at every step.

This project is also a learning tool: it demonstrates all four major Object-Oriented Programming (OOP) principles in Java—encapsulation, inheritance, polymorphism, and abstraction—using simple, well-commented code. You can study the source files to see how these concepts are applied in practice.

No prior experience with Java is required beyond basic terminal usage and following step-by-step instructions. This estimator is ideal for first-year computer science students or anyone new to programming who wants to see how a real-world console application is built and structured.

## Features

## Example Session
```
==============================
 ARCHITECTURE ESTIMATOR TOOL 
==============================
Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 1
New estimate created.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 2
Add Item:
1. Material
2. Labor
Select item type: 1
Material name: Concrete
Quantity: 100
Unit cost: 5.5
Material added.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 2
Add Item:
1. Material
2. Labor
Select item type: 2
Labor name: Mason
Hours: 40
Hourly rate: 20
Labor added.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 3

Estimate Summary:
-------------------------------------------------------------
Item            | Qty/Hrs  | Rate/Cost |      Total
-------------------------------------------------------------
Concrete        |   100.00 |      5.50 |    550.00
Mason           |    40.00 |     20.00 |    800.00
-------------------------------------------------------------
TOTAL                               |   1350.00
-------------------------------------------------------------

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 4
Saving estimate.....
Estimate saved to estimate_output.md
```

## How to Compile and Run

### Step-by-Step Setup and Run Instructions

#### 1. Clone or Download the Project

If you are using Git:
1. Open your terminal (PowerShell recommended on Windows).
2. Navigate to the folder where you want to put the project.
3. Run:
   ```
   git clone <repository-url>
   ```
   Replace `<repository-url>` with the actual link to this project.

If you have a ZIP file:
1. Download and extract the ZIP file to a folder (e.g., `C:\Users\YourName\Downloads\your_directory`).

#### 2. Install the Java Development Kit (JDK)

1. Download the latest JDK for Windows:
   [JDK 25 Windows x64 Direct Download](https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe)
2. Run the installer and follow all prompts (default options are fine).
3. After installation, open a new terminal and type:
   ```
   java -version
   ```
   If you see a version number (e.g., `java version "25.0.0"`), Java is installed and ready to use.
   If you get an error, restart your computer and try again.

#### 3. Open the Project Folder in Terminal

1. Open PowerShell.
2. Navigate to the project folder. For example:
   ```
   cd C:\Users\YourName\Downloads\estimator
   ```

#### 4. Compile and Run the Program Automatically

1. In the project folder, run the provided PowerShell script:
   ```
   .\run_estimator.ps1
   ```
2. The script will:
   - Compile all Java source files.
   - Run the estimator tool in the console.
3. If you see the menu, you are ready to use the program!

#### 5. (Optional) Manual Compile and Run

If you want to do it manually:
1. Compile all Java files:
   ```
   javac -d bin src/*.java
   ```
2. Run the application:
   ```
   java -cp bin src.EstimatorApp
   ```

#### 6. Troubleshooting

- If you see errors about Java not found, make sure you installed the JDK and restarted your terminal.
- If you see compilation errors, check that you are in the correct folder and all `.java` files are present in `src/`.
- If you need help, ask your instructor or search for "How to install Java JDK on Windows".

## Example Session
```
==============================
 ARCHITECTURE ESTIMATOR TOOL 
==============================
Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 1
New estimate created.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 2
Add Item:
1. Material
2. Labor
Select item type: 1
Material name: Concrete
Quantity: 100
Unit cost: 5.5
Material added.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 2
Add Item:
1. Material
2. Labor
Select item type: 2
Labor name: Mason
Hours: 40
Hourly rate: 20
Labor added.

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 3

Estimate Summary:
-------------------------------------------------------------
Item            | Qty/Hrs  | Rate/Cost |      Total
-------------------------------------------------------------
Concrete        |   100.00 |      5.50 |    550.00
Mason           |    40.00 |     20.00 |    800.00
-------------------------------------------------------------
TOTAL                               |   1350.00
-------------------------------------------------------------

Menu:
1. Create new estimate
2. Add item (Material/Labor)
3. View summary
4. Save estimate to markdown
5. Exit
Select option: 4
Saving estimate.....
Estimate saved to estimate_output.md
```

## OOP Principles Used
- **Encapsulation:** Private fields, getters/setters with validation in all item classes.
- **Inheritance:** `Material` and `Labor` extend `ProjectItem`.
- **Polymorphism:** Array of `ProjectItem`, overridden methods used via base-type references.
- **Abstraction:** `ProjectItem` is abstract, defines common behavior.

## Developer Notes
- All user input is validated and exceptions are handled gracefully.
- Arrays are used for item management as required.
- Console output is formatted for clarity and aesthetics.
- See source code comments for further details.
