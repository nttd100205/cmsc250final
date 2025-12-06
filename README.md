# Task Manager – Java Swing Desktop App

A simple desktop application for managing tasks, built as a final project for an introductory computer science course.  
Users can add and remove tasks, and the underlying data model supports priority, due date, and completion status.

---

## 🧾 Features

✓ Add a new task using a pop-up input dialog  
✓ Display tasks in a list with easy-to-read formatting  
✓ Remove selected tasks from both the UI and the data model  
✓ OOP structure with a separate model (`Task`) and controller (`TaskManager`)  
✓ GUI built using Java Swing components

**Task properties supported by the model:**
- Task name
- Completion status (true/false)
- Priority level (integer)
- Due date and due time (optional)
- Custom `toString()` formatting using `SimpleDateFormat`

> Current GUI implements **Add** and **Remove**.  
> The architecture already supports additional features like editing and completing tasks.

---

## 🛠 Tech Stack

| Category | Technology |
|---------|------------|
| Language | **Java** |
| GUI Framework | **Swing** (`JFrame`, `JPanel`, `JList`, `JButton`, `JScrollPane`) |
| Data Storage | `ArrayList<Task>` |
| Date/Time | `java.util.Date`, `java.text.SimpleDateFormat` |
| Paradigm | Object-Oriented Programming |

---

## 📂 Project Structure

App.java → Entry point (main method)
Task.java → Task data model
TaskManager.java → Logic for storing & managing tasks
TaskManagerGUI.java → User interface (Swing)

---

## ▶️ How to Run

### Option A — Running in an IDE (IntelliJ, Eclipse, NetBeans)

1. Clone the repository 
   git clone https://github.com/nttd100205/cmsc250final.git
Open the folder in your IDE as a Java project

Set TaskManagerGUI (or App) as the main class

Click Run → a window titled "Task Manager" will appear

Option B — Command Line
Clone and enter the project folder:

git clone https://github.com/nttd100205/cmsc250final.git
cd cmsc250final
Compile all Java files:

javac *.java
Run the program:

java TaskManagerGUI
