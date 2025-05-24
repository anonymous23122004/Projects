# 🗳️ Online Survey System

The **Online Survey System** is a Java Swing-based desktop application designed to facilitate secure user sign-up, login, and potentially further survey functionalities. This system forms the foundation for creating and managing online surveys by managing user authentication efficiently.

# Features

- User Sign-Up functionality with form validation
- User Login with credential verification
- GUI developed using Java Swing components
- JDBC integration for database operations
- Basic UI layout using GridBagLayout and other layout managers

# Technologies Used

- Java (Swing for GUI)
- JDBC for database connection
- Oracle Database (assumed)
- MVC-style class separation

# Project Structure

OnlineSurveySystem/
│
├── Main.java # Entry point, launches login screen
├── Login.java # Handles user login UI and authentication
└── SignUp.java # Handles new user registration UI and logic


## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/online-survey-system.git
   cd online-survey-system

2. Make sure you have:

   JDK installed
   Oracle Database with appropriate tables (USERS) created.

3. Run the Application:

   javac Main.java Login.java SignUp.java
   java Main

4. Modify the JDBC connection strings in Login.java and SignUp.java to match your Oracle DB configuration.


# Contact

For any queries, feel free to connect with me on skt23122004@gmail.com



