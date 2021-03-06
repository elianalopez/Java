<br />
 <p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/212px-Java_programming_language_logo.svg.png" width="50" height="100">
    <h1 align="center">Programming Language Project: Java</h1>
    <p align="center" class="h6">Simmons University</p>
    <p align="center" class="h6">By Eliana Lopez</p>
    <p align="center">This GitHub repository is created for a semester long project in my CS 330 (Structure and Organization of Programming Language) class. I have chosen Java as the language of my choice, so throughout this repository you will view Java tutorials, Java specific structures(syntax, naming conventions, ect...), and general computer science foundations that can be applied with Java.</p>
 </p>




<!-- TABLE OF CONTENTS -->
## Table of Contents  
<!-- AUTO-GENERATED-CONTENT:START (TOC:collapse=true&collapseText="Click to expand") -->
<details>
<summary>click to expand</summary>
 
- [Assignment 1: Language Selection and Overview](#assignment-1-language-selection-and-overview)  
- [Assignment 2: Installation, programming environment, and Hello, World!](#assignment-2-installation-programming-environment-and-hello-world)  
  * [hello.java](#hellojava)
- [Assignment 3: Data types and naming conventions](#assignment-3-data-types-and-naming-conventions)  
  * [Primitive and Non-Primitive Data Types](#the-primitive-and-non-primitive-data-types)  
  * [Naming Conventions](#Java-Naming-Conventions)
  * [DataTypes.java](#DataTypes.java)
- [Assignment 4: Control Flow](#assignment-4-control-flow)  
  * [Squential Structure](#Squential-Structure)  
  * [Selection Structure](#Selection-Structure)
  * [Repetition Structure](#Repetition-Structure)
  * [Branching Statements](#Branching-Statements)
- [Assignment 5: Functions and Parameter Passing](#assignment-5-functions-and-parameter-passing)  
- [Assignment 6: Naming, Scope, and Bindings](#assignment-6-naming-scope-and-bindings)  
- [Final Project: Java Tic-Tac-Toe](#final-project--java-tic-tac-toe)  
- [Citations](#works-cited)  
</details>
<!-- AUTO-GENERATED-CONTENT:END -->

## Assignment 1: Language Selection and Overview
This assignment consist of researching my language of choice, Java, and I answer questions based on the language's history, functionaility, and how it is utilized.
The link to the document is <a href="https://github.com/elianalopez/Java/blob/master/Assignment1/PLP-Assignment1.pdf">here</a>.


## Assignment 2: Installation, programming environment, and Hello, World!
### Installing Java for Windows
For assignment 2 I have documented a tutorial on how to install Java for windows. If you would like to read it, link to the PDF is <a href="https://github.com/elianalopez/Java/blob/master/Assignment2/Java_Installation.pdf">here</a>.
### Hello, World! Program and Documentation
I have also created a Hello, World! program in Java under the name <a href="https://github.com/elianalopez/Java/blob/master/Assignment2/hello.java">hello.java</a>.
Lastly, all my documentation regarding installation, programming environment, and the Hello, World! programming processes has been documented to this <a href="https://github.com/elianalopez/Java/blob/master/Assignment2/PLP-Assignment2.pdf">PDF</a>.
#### hello.java
Veiw the source code <a href="https://github.com/elianalopez/Java/blob/master/Assignment2/hello.java">here</a>.
```java
class HelloWorld{
    public static void main(String[]args){
        System.out.println("\n Hello World!");
    }
}
```
## Assignment 3: Data types and naming conventions
In this assignmentI have studied the various types of primitive and non-primitive data types in Java. I have also learned about the best naming convetions for Java when it comes to naming certain variables in order to make Java legible and easy to analyze from a causal spectator of my code. This entire assigment has been recorded <a href="https://github.com/elianalopez/Java/blob/master/Assignment3/PLP-Assignment3.pdf">here</a>.
Down below is a short summary of the full-indepth information I have written.

<!-- AUTO-GENERATED-CONTENT:START (TOC:collapse=true&collapseText="Click to expand") -->
<details>
 
<summary>click for a brief view on data types and naming conventions in Java</summary>
 
### The primitive and non-primitive data types
Java has two categories of data types: primitve and non-primitive data types. Primitive data types are already pre-defined data types while non-primitve data types are created by programmer. 

#### Primitive data types
* Byte                
* Short               
* Int                 
* Long
* Float
* Double
* Boolean
* Char

#### Non-Primitive data types
* Strings               
* Arrays             
* Classes
#### DataTypes.java

Veiw the entire source code <a href="https://github.com/elianalopez/Java/blob/master/Assignment3/DataTypes.java">here</a>.

```java
public class DataTypes {
  public static void main(String[] args) {

    //primitive data type example
    //notice the use of lowerCamelCase on the variables
    int myNum = 5;               // integer (whole number)
    float myFloatNum = 3.1415f;    // floating point number
    char myLetter = 'E';         // character
    boolean myBool = true;       // boolean

    //non-primitive data type example
    String myText = "Hello";     // String

    System.out.println(myNum); //prints out int myNum
  }
}

```
### Java Naming Conventions
The practice of following these naming conventions make Java programs much easier to analyze and read for a casual observer of the code. Java communities, such as Sun Microsystems and Netscape, ecourage certain pratices utilizing CamelCase when naming variables. CamelCase is the practice of writing words without spaces or punctuation of any kind. 

<br>

```
lowerCamelCase \\Variables and Class Members are expressed in lowerCamelCase
```

<br>

```
UpperCamelCase \\Classes are typically written in UpperCamelCase
```

<br>

```
com.sun.eng \\For packages, use reverse URI (Uniform Resource Identifier)
```

<br>

```
ALL_CAPS \\variables declared class constants
```

<br>
To learn more about naming conventions, I recommended viewing the document Sun Microsystems created which I will direct to via <a href="https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html">this webpage</a>.

</details>
<!-- AUTO-GENERATED-CONTENT:END -->

## Assignment 4: Control Flow
Control Flow is the order in which a computer executes the statements of a program, in Java there are three basic types of control flow structures: sequential, selection, and repetition control structure. For assignment 3 I have went into deep detail to understand how Java utilizes control flow, the processes has been documented to <a href="https://github.com/elianalopez/Java/blob/master/Assignment4/PLP-Assignment4.pdf">here</a> but also feel free to look at the <a href="https://github.com/elianalopez/Java/blob/master/Assignment4">Assignment 4</a> folder to understand the source code that complements the assignment. 

### Sequential Structure
The default form of control flow in a program for Java. It executes statements of code one line after another in how it is written within the source code, some describe it as being executed in the manner of reading a cookbook!

### Selection Structure
In order to alter the flow from its default sequential order of execution, a selection type of structure would “branch out” to certain statements, which happens if the state of a certain variable(s) match the desired condition.
<br>
In Java there are three types of selection statements: 
* single selection (if statement)
* double selection (if-else statement)
* multiple selection (switch-case statement)


### Repetition Structure
A repetition structure, also known as a loop, is a block of code that is repeated multiple times. 
<br>
In Java there are three types of repetition statements: 
* while repetition statement (while loop)
* do...while repetition statement (do while loop)
* for repetition statement (for loop)

### Branching Statements
In Java there are three types of branching statements that help us adjust the control flow of execution based on certain conditions:
* break                
* continue               
* return

## Assignment 5: Functions and Parameter Passing
In programming, functions can be defined as “self-contained” sequences of code that are program to execute a specific task;  it is a way to combine multiple actions into one single process. Functions in programming work in a similar way to functions in mathematics; as they both have inputs and outputs. <br>
In the case of Java, what is typically referred to as a function in other programming languages is known as a method. What makes a method a method specifically is that it is a function that belongs to a class, and in Java “every function belongs to a class.”  This entire assigment has been recorded <a href="https://github.com/elianalopez/Java/blob/master/Assignment5/PLP-Assignment5.pdf">here</a> and feel free to also browse the assignment folder <a href="https://github.com/elianalopez/Java/blob/master/Assignment5">here</a>.

## Assignment 6: Naming, Scope, and Bindings
Naming plays an important aspect in programing languages because it enables programmers to identify variables, constants, operations, data types, and so on, “rather than using low-level hardware components” like an address.
<br>
Binding is the operation of associating two things, such as a name and the entity that name represents.
<br>
Scope is the region of the program where name-to-object binding is active. In Java the scoping area can easily be described as right between the curly brackets. This is important to know because it plays an important part of where and how variables should be either named or referenced.

This entire assigment has been recorded <a href="https://github.com/elianalopez/Java/blob/master/Assignment6/PLP-Assignment6.pdf">here</a> and feel free to also browse the assignment folder <a href="https://github.com/elianalopez/Java/blob/master/Assignment6">here</a>.

## Final Project | Java Tic-Tac-Toe

The final project of my programming langugues course will be a Java implementation of a tic-tac-toe game on the command line.

Feel free to look at the <a href="https://github.com/elianalopez/Java/blob/master/Final%20Project/Programming%20Language%20Project%20Presentation.pdf">final presentation</a> I created about Java in my programming languages course as well as my <a href="https://github.com/elianalopez/Java/blob/master/Final%20Project/PLP-Final%20Paper.pdf">final paper</a> regarding my tic-tac-toe project.
 
### Features

The game had the following features:

* Multiple Game Modes (Single Player, Two Player, Spectator)
* Instructions 
* Players were given custom names
* Keep track of previous winners based off given names
* Wins and Ties were part of the functionality of the tic-tac-toe game

### The players

There are two types of players within the tic-tac-toe game, local players and CPUs, and they both function differently. A local player is able to place their answer within the commandline manually while the CPU randomly generates an answer. 

Also one thing to note is to make the CPUs more life like there is a random timer that pauses the method for a short amount of time to mimick human pauses during the game when while thinking of the next move. 

### Start Screen

The start screen entirely runs from a while statement and a switch case senario, in order to go to the different modes which is respectively each a method on its own. 

<p align="center"><img src="https://github.com/elianalopez/Java/blob/master/Images/StartScreen.PNG?raw=true" width="100%" height="100%"></p>

```java
        welcome(); //releases welcome method

        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("1.) Single Player Mode\n");
            System.out.print("2.) Two Player Mode\n");
            System.out.print("3.) Spectator Mode\n");
            System.out.print("4.) Instructions\n");
            System.out.print("5.) Winner List\n");
            System.out.print("\nEnter Your Menu Choice: ");
            choice = input.nextInt();
            //nextInt() is a method from the java.util.Scanner

            switch (choice) {
                case 1:
                    Game oneGame = new Game();
                    oneGame.onePlayer(gameBoard);
                    break;
                case 2:
                    Game twoGame = new Game();
                    twoGame.twoPlayer(gameBoard);
                    break;
                case 3:
                    Game cpuGame = new Game();
                    cpuGame.spectator(gameBoard);
                    break;
                case 4:
                    instructions();
                    break;
                case 5:
                    winners();
                    break;
                default:
                    System.out.println("\nThis is not a valid Menu Option! Please Select Another!!\n");
                    //if inputs do not match cases this will print
                    break;
            }
        }
```

### Winner List

There are two versions the the winner list within this program, an empty list prior to before a player starts a game and a winner list with at least one winner from the tic-tac-toe game. Utilizing the built-in isEmpty() method from the java.util package, I was able to guage on whether which verison of the list to implement. If there is a winner, then the screen would display all previous winners from each game. 

#### Winner List (Empty/No Winners)

<p align="center"><img src="https://github.com/elianalopez/Java/blob/master/Images/WinnerListEmpty.PNG?raw=true" width="100%" height="100%"></p>

#### Winner List (Not Empty)

<p align="center"><img src="https://github.com/elianalopez/Java/blob/master/Images/WinnerList.PNG?raw=true" width="100%" height="100%"></p>

The construction and implementation of the winner list after a player is declared a winner.

```java
    static ArrayList<String> winners = new ArrayList<String>(); //winners list
```

```java
            String result = winningPatterns();
            if(result.length() > 1){
                System.out.println(result);
                System.out.println(CPU1 + "'is the winner!");
                winners.add(CPU1);
                welcome();
                break;
```

The syntax underneath determines what to display within the winner list screen.

```java
    public static void winners() {
        System.out.println("\n--------------------------------------WINNER-LIST--------------------------------------\n");

        Scanner scanner = new Scanner(System.in);
        if (winners.isEmpty()){
            System.out.println("\nWelcome to our Winner's List! \nAs of now there are now new winners yet!");
            System.out.println("Try playing a game to find out if you will be on the list :)");
        }
        else{
            System.out.println("\nPrevious Winners: ");
            for (int i = 0; i < winners.size();i++)
            {
                System.out.println(winners.get(i));
            }
        }
        System.out.println("\n1. Main Menu: ");
        System.out.print("\nEnter Your Choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            welcome();
        }
        else{
            System.out.println("\nThis is not a valid Menu Option! Please Select Another!!\n");
            winners();
        }
    }
```

### Gameplay

<p align="center"><img src="https://github.com/elianalopez/Java/blob/master/Images/Game.PNG?raw=true" width="100%" height="100%"></p>

<p align="center"><img src="https://github.com/elianalopez/Java/blob/master/Images/Win.PNG?raw=true" width="85%" height="85%"></p>


## Works Cited
<!-- AUTO-GENERATED-CONTENT:START (TOC:collapse=true&collapseText="Click to expand") -->
<details>
<summary>expand citations</summary>
 
<p>
Bhatnagar, A. (2019, May 02). <i>The complete History of Java Programming Language</i>. Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://www.geeksforgeeks.org/the-complete-history-of-java-programming-language/ <br>
Elizabeth, J. (2018, April 05). <i>Top 5 most popular Java projects on GitHub</i>. Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://jaxenter.com/top-5-most-popular-java-projects-github-143123.html <br>
Gries, D. (2018). <i>Safety and Strong Versus Weak Typing</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.cs.cornell.edu/courses/JavaAndDS/files/strongWeakType.pdf<br>
GeeksforGeeks.(2017, April 24). <i>Comments in Java</i>. Retrieved September 10, 2020, from <br>
&thinsp;&thinsp;  https://www.geeksforgeeks.org/comments-in-java/ <br>
GeeksforGeeks. (2019, November 17). <i>Type conversion in Java with Examples</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.geeksforgeeks.org/type-conversion-java-examples/<br>
GeeksforGeeks. (2020, August 24). <i>Java Naming Conventions</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.geeksforgeeks.org/java-naming-conventions/ <br>
GitHub. (n.d.). <i>Java</i>. Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://github.com/topics/java?o=desc&s=stars <br>
<i>Is Java Compiled or Interpreted Programming language?</i> (2017, June 11). Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://javarevisited.blogspot.com/2014/06/is-java-interpreted-or-compiled-programming-language.html <br>
Jarosciak, J. (2018, January 18). <i>Java for Beginners 2 – Addressing Data Type Limitations</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.joe0.com/2018/01/18/java-for-beginners-addressing-data-type-limitations/<br>
<i>Java Data Types</i>. (n.d.). Retrieved September 24, 2020, from <br>
&thinsp;&thinsp;  https://www.w3schools.com/java/java_data_types.asp<br>
Oracle. (2015). <i>Dynamic typing vs. static typing</i>. Retrieved September 24, 2020, from <br>
&thinsp;&thinsp;  https://docs.oracle.com/cd/E57471_01/bigData.100/extensions_bdd/src/cext_transform_typing.html<br>
Oracle. (n.d.). <i>Oracle JDK 8 and JRE 8 Certified System Configurations</i>. Retrieved September 09, 2020, from <br>
&thinsp;&thinsp;  https://www.oracle.com/java/technologies/javase/products-doc-jdk8-jre8-certconfig.html <br>
Singh, V. (2020, August 20). <i>Best Java IDE 2020: Most Popular Java IDE for Coding</i>. Retrieved September 10, 2020, from <br>
&thinsp;&thinsp;  https://hackr.io/blog/best-java-ides<br>
Sun Microsystems. (2015). <i>Naming Conventions</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html<br>
Vaidya, N. (2019, July 25). <i>What is Type Casting in Java?: Java Type Casting Examples</i>. Retrieved September 25, 2020, from <br>
&thinsp;&thinsp;  https://www.edureka.co/blog/type-casting-in-java/<br>
Vats, R. (2020, June 26). <i>Top 8 Java Projects on Github You Should Get Your Hands-on [2020]</i>. Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://www.upgrad.com/blog/java-projects-on-github/ <br>
<i>What is a boilerplate code?</i> (n.d.). Retrieved September 10, 2020, from  <br>
&thinsp;&thinsp;  https://www.educative.io/edpresso/what-is-a-boilerplate-code <br>
<i>Where is Java used in Real World?</i> (2017, December 3). Retrieved September 05, 2020, from <br>
&thinsp;&thinsp;  https://javarevisited.blogspot.com/2014/12/where-does-java-used-in-real-world.html <br>
</p>


</details>
<!-- AUTO-GENERATED-CONTENT:END -->
