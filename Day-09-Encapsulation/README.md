Java Day 9 — Encapsulation 🔐

📚 Topics Covered

- Encapsulation
- "private" keyword
- Getters
- Setters
- Data validation
- Constructors with encapsulated data
- Controlled access to object data
- Real-world encapsulation examples

📂 Programs

File| Concept
EncapsulationBasic.java| Basic encapsulation
Student.java| Getters and setters
StudentDemo.java| Student object
BankAccount.java| Account data protection
BankDemo.java| Bank account operations
Employee.java| Employee encapsulation
EmployeeDemo.java| Employee object
Product.java| Product data validation
ProductDemo.java| Product operations
SecureStudent.java| Encapsulation mini-project

🔑 Key Concept

Encapsulation means protecting an object's internal data and providing controlled access to it.

Example:

private double balance;

public double getBalance() {
    return balance;
}

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    }
}

🎯 Learning Outcome

After Day 9, I understand how to:

- Make class fields private
- Create getters and setters
- Validate data before storing it
- Protect object data
- Build safer Java classes
- Apply encapsulation to real-world examples

🧪 Mini Project

The "SecureStudent.java" program demonstrates a student object with:

- Private fields
- Validation
- Setters
- Getters
- User input
- Display methods

🚀 Next Step

Day 10 — Inheritance
