# School Registration System

A Java Swing application with Apache Derby database for student registration and login authentication.

## Features

- **Registration Form** - Register new students with all personal, contact, and parent details
- **Login Form** - Authenticate users with username and password
- **Input Validation** - Name (letters only), Phone (10 digits starting with 09)
- **Auto-generated ID** - Database handles student ID automatically
- **Unique Username** - Prevents duplicate usernames

## Project Files

| File | Description |
|---|---|
| `RegistrationForm.java` | Student registration form with validation |
| `LoginForm.java` | User login authentication form |
| `SchoolRegistration.java` | Launcher - opens both forms |
| `create_table.sql` | SQL command to create the database table |

## Prerequisites

- NetBeans IDE 8.0 or higher
- Java JDK 8
- Apache Derby (Java DB) - included with NetBeans

## Quick Setup

### 1. Open Project
- Open NetBeans -> File -> Open Project
- Select the SchoolRegistration folder

### 2. Add Derby Library
- Right-click project -> Properties -> Libraries
- Add JAR/Folder: Navigate to NetBeans installation folder
- Go to `ide/modules/ext/`
- Select `derbyclient.jar` and `derby.jar`

### 3. Start Derby Server
- Window -> Services (Ctrl+5)
- Right-click Java DB -> Start Server
- Wait for: "started and ready to accept connections on port 1527"

### 4. Create Database
- Right-click Java DB -> Create Database
- Database Name: `StuRegDB`
- Username: `naol`
- Password: `1111`

### 5. Create Table
- Right-click the database connection -> Execute Command
- Paste the contents of `create_table.sql`
- Click Run (Ctrl+Shift+E)

### 6. Run
- Right-click `RegistrationForm.java` -> Run File (to register)
- Right-click `LoginForm.java` -> Run File (to login)
- Right-click `SchoolRegistration.java` -> Run File (to open both)

## Database Credentials
