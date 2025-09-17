Project Overview:-
The Campus Course & Records Manager (CCRM) is a console-based Java application designed to manage student and course records for an educational institute. 
It provides functionalities for student management (add, update, enroll), course management (create, search, assign instructors), grading, and transcript generation. 
The project demonstrates core and advanced Java SE concepts, including Object-Oriented Programming (OOP), modern file I/O with NIO.2, the Stream API, and common design patterns.

How to Run:-
Prerequisites
  Java Development Kit (JDK): Version 17 or later.
  IDE: A configured Java IDE such as Eclipse.

Steps:-
Clone the Repository:
git clone <your-repository-link>

Open in IDE: Open the cloned folder as a new project in your IDE.
Locate Main Class: Navigate to the Main.java file in the main src directory.
Run: Right-click on Main.java and select "Run" or "Run as Java Application". The application menu will appear in the console.

Evolution of Java:-

1995: Java 1.0 is released by Sun Microsystems with the motto "Write Once, Run Anywhere."
1998: J2SE 1.2 (Java 2) introduces the Collections Framework and Swing.
2004: J2SE 5.0 (Tiger) is a major release, adding Generics, Enums, and Annotations.
2014: Java SE 8 revolutionizes the language with Lambda Expressions, the Stream API, and a new Date/Time API.
2017-Present: Java moves to a 6-month release cycle, with Long-Term Support (LTS) versions released periodically.

Java ME vs SE vs EE comparison:-
## Java SE (Standard Edition)
Java SE is the foundation of the Java language. It provides the core functionalities, including the Java Virtual Machine (JVM), the Java Development Kit (JDK), and the standard libraries (APIs). It's the most common platform for general-purpose programming.
Purpose: Developing desktop applications, command-line tools, and the core logic for servers.
Core Components: java.lang, java.io, java.net, Swing, AWT, etc.

## Java EE (Enterprise Edition) / Jakarta EE
Java EE is built on the Java SE platform. It provides a robust set of APIs and a runtime environment for developing and running large-scale, multi-tiered, and secure network applications. In 2017, it was moved to the Eclipse Foundation and renamed Jakarta EE.
Purpose: Building large, scalable, and reliable server-side enterprise applications.
Added Components: Adds libraries for web services, distributed computing, and security on top of Java SE. Key APIs include Servlets, JavaServer Pages (JSP), Enterprise JavaBeans (EJB), and Java Persistence API (JPA).

## Java ME (Micro Edition)
Java ME is a stripped-down version of Java SE, designed for devices with limited memory, processing power, and battery life. It provides a lightweight virtual machine and a subset of the standard Java APIs.
Purpose: Developing applications for small and embedded devices.
Key Features: Small memory footprint, optimized for low power consumption. It uses specialized JVMs like the KVM (Kilo Virtual Machine).

JDK/JRE/JVM explanation:-

JVM (Java Virtual Machine): An abstract machine that executes Java bytecode. It's the component that provides platform independence.
JRE (Java Runtime Environment): The software package needed to run a Java application. It contains the JVM and core Java libraries.
JDK (Java Development Kit): The full development kit needed to write and compile Java applications. It includes the JRE, the compiler (javac), the debugger, and other tools.

Mapping table: syllabus topic → file/class/method:- 

Syllabus Topic	File / Class / Method Demonstration
OOP - Encapsulation:		
Student.java and Course.java use private fields with public getters/setters.

OOP - Inheritance:		
Student.java and Instructor.java extend the abstract Person.java class.

OOP - Abstraction:		
Person.java is an abstract class with an abstract method.

OOP - Polymorphism:	
A List<Person> can hold both Student and Instructor objects, demonstrating virtual method invocation.

Design Pattern - Singleton:		
AppConfig.java ensures only one instance of application settings exists.

Design Pattern - Builder:
The Course.CourseBuilder static nested class is used to construct Course objects.

File I/O (NIO.2):	
An ImportExportService.java class would use java.nio.file.Path and Files for all file operations .

Streams & Lambdas:	
A CourseService.java class would use the Stream API and lambda expressions for searching and filtering courses.


Custom Exceptions:		
MaxCreditLimitExceededException.java and DuplicateEnrollmentException.java are custom checked exceptions .

Date/Time API:		
Student.java uses java.time.LocalDate for the registration date.


Enums with Fields:		
Grade.java enum has a constructor and a gradePoint field.

Recursion:
A FileUtils.calculateDirectorySize() method would recursively calculate the size of a directory

Enabling Assertions:
This project uses the assert keyword to check for internal program invariants (i.e., conditions that should always be true). For example, we might assert that a student ID is never negative.
By default, the Java Virtual Machine (JVM) disables assertions, so they will have no effect. You must explicitly enable them using a VM flag.
To enable assertions, you must use the -enableassertions or the shorthand -ea flag when running the application.

Sample Commands
Command Line
If you were running the application as a packaged JAR file, you would use the flag like this:
java -ea -jar CCRM.jar

In an IDE Eclipse:-
Go to Run > Run Configurations.
Select the run configuration for your Main class.
Click on the Arguments tab.
In the VM arguments box, type -ea.
Click Apply, then Run.


Java Installation Verification:-
![image alt](https://github.com/brotodeep/source_code/blob/main/Screenshots/Java%20Installation%20Verification.png?raw=true)

New Project Creation:
![image alt](https://github.com/brotodeep/source_code/blob/main/Screenshots/New%20Project%20Creation.png?raw=true)

Program Running Successfully:
![image alt](https://github.com/brotodeep/source_code/blob/main/Screenshots/Program%20Running%20Successfully.png?raw=true)

Project Structure:
![image alt](https://github.com/brotodeep/source_code/blob/main/Screenshots/Project%20Structure.png?raw=true)

Run Configuration:
![image alt]()









