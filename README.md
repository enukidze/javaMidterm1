# Java Midterm Project
By Merab Enukidze

## Task 1
To compile and run Task 1:
```bash
# Compile Task 1
javac task1.java

# Run Task 1
java task1
```

## Task 2
To compile and run Task 2:
```bash
# Compile Task 2 (compile all required files)
javac merab_enukidze_1/midterm1/t2/chicken/A21.java
javac merab_enukidze_1/midterm1/t2/pot/actor/A22.java
javac merab_enukidze_1/midterm1/t2/chicken/sub/R21.java

# Run Task 2
java merab_enukidze_1.midterm1.t2.chicken.sub.R21
```

## Task 3: Payroll Management System

### Project Structure
```
.
├── src/
│   └── t3/
│       ├── Employee.java
│       ├── PMS.java
│       └── PayrollTester.java
├── ms.md
└── README.md
```

### How to Compile and Run Task 3

1. Make sure you have Java installed. You can check by running:
```bash
java -version
javac -version
```

2. Navigate to the project root directory:
```bash
cd path/to/javaMidterm1
```

3. Compile the program:
```bash
javac src/t3/*.java
```

4. Run the program:
```bash
java -cp src t3.PayrollTester
```

### Expected Output for Task 3
When you run the program, you should see:
- Initial list of employees
- Salary calculation demonstration
- Final list of employees after removal

### Documentation
For detailed system documentation of Task 3, please refer to `ms.md`

## Note
Make sure you are in the root directory of the project (where this README file is located) when running these commands.

## Reflection on AI Usage and Challenges

### Challenges Faced
During this exam, I encountered several challenges:
1. Package structure issues in Task 3 - initially had problems with the correct directory structure for the Java packages
2. File organization - needed to properly organize the code files in the appropriate directories
3. Documentation formatting - ensuring consistent and clear documentation across different files

These challenges were resolved by:
- Creating proper directory structure (src/t3) to match the package names
- Carefully organizing and moving files to their correct locations
- Using markdown formatting consistently across documentation

### AI Tool Usage and Benefits
AI tools were particularly helpful in:
1. Task 3 (Payroll Management System):
   - Generating initial code structure
   - Creating consistent documentation in ms.md
   - Implementing the salary calculation feature
   - Setting up proper package structure

2. Documentation:
   - Formatting README.md
   - Creating clear installation and running instructions
   - Maintaining documentation consistency

### Cases Where AI Was Less Helpful
Some situations where AI assistance wasn't as effective:
1. Initial package structure errors - needed manual intervention to properly set up directories
2. Some specific Java syntax issues - required manual verification and testing
3. Complex debugging scenarios - needed direct code inspection and testing