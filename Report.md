# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR

    AlohaWorld --> Greeter : creates
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses

    class AlohaWorld {
        - AlohaWorld()
        + static void main(String[] args)
    }

    class ConsoleView {
        - static final Scanner SCANNER
        - static final List<String> LOCALITY_OPTIONS
        - ConsoleView()
        + static String getName()
        + static int getLocality()
        + static boolean checkRunAgain()
        + static void printGreeting(String greeting)
    }

    class Greeter {
        - final String name
        - int locality
        - static List<String> localityList
        - static final int HAWAII
        - static final int CHINA
        - static final int ITALY
        - static final int DEFAULT_LOCALITY
        + Greeter(String name)
        + Greeter(String name, int locality)
        + String getName()
        + int getLocality()
        + void setLocality(int locality)
        + String greet()
        + String greet(boolean asciiOnly)
        - String getLocalityString()
        + int hashCode()
        + boolean equals(Object obj)
        + String toString()
        + static List<String> getLocalityList()
    }

```


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).


## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * `final class`
   * `switch default case`
   * `SCANNER.nextLine().toLowerCase()`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * In a `switch` statement, the `default` case provides a fallback when none of the specified `case` values match the switch expression. It ensures that there's a defined behavior even if no match is found.
    * This code reads an entire line of input using `Scanner.nextLine()` and immediately converts the input string to all lowercase letters with `toLowerCase()`. This is useful for case-insensitive comparisons or standardizing user input.

3. What does `main` do in Java? 

   The main method is the entry point of a Java application. It must be public, static, return void, and accept a String[] parameter for command-line arguments


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

   The `toString()` method returns a human-readable string that represents an object. Implementing `toString()` in your classes makes debugging and logging easier, as it provides clear information about the object's state.

5. What is javadoc style commenting? What is it used for? 

   Javadoc style commenting uses special `/** ... */` comments in Java to document classes, methods, fields, and other code elements.
   It is used to automatically generate HTML documentation, which helps developers understand, maintain, and use the code effectively.


6. Describe Test Driving Development (TDD) in your own words. 

   Test Driven Development (TDD) means writing tests before writing code. You write a failing test, code to pass it, then refactor. This ensures code meets requirements and reduces bugs.    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
   
   Keeping client interaction contained in a single class like `ConsoleView` centralizes all input/output logic. This isolation makes the code easier to maintain, update, or modify the user interface without affecting other parts of the application.


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.



> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java