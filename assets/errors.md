# Java Compilation & Runtime Errors Study Notes

## 1. Missing Semicolon
*   **Error Message:** 
    ```text
    Main.java:3: error: ';' expected
           System.out.println("Hello, backend!")
                                                ^
    1 error
    ```
*   **Explanation:** The compiler was telling us that the Java syntax rules require every statement to end with a semicolon, and it reached the end of the line without finding one.

---

## 2. Incorrect Method Name (`printline`)
*   **Error Message:**
    ```text
    Main.java:3: error: cannot find symbol
           System.out.printline("Hello, backend!");
                     ^
      symbol:   method printline(String)
      location: variable out of type PrintStream
    ```
*   **Explanation:** The compiler was informing us that `printline` is not a valid method within the `PrintStream` class (which `System.out` belongs to), meaning it doesn't recognize that method name.

---

## 3. Mismatched Public Class Name and File Name
*   **Error Message:**
    ```text
    Main.java:2: error: class Application is public, should be declared in a file named Application.java
    public class Application {
           ^
    1 error
    ```
*   **Explanation:** The compiler enforces a strict naming convention stating that a `public` class must be stored in a file whose name matches the class name plus the `.java` extension.

---

## 4. Missing `static` Keyword in `main` Method (Runtime Error)
*   **Error Message:**
    ```text
    Error: Main method not found in class Main, please define the main method as:
       public static void main(String[] args)
    or a JavaFX application class
    ```
*   **Explanation:** Although the code compiled successfully, the Java runtime environment told us it couldn't execute the program because the entry-point method must be marked `static` so it can be called without creating an instance of the class first.

---

## 5. NullPointerException Stack Trace (Task 3.4)
*   **Full Stack Trace:**
    ```text
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
        at Calculator.triggerNullPointer(Calculator.java:65)
        at Calculator.main(Calculator.java:44)
    ```
*   **Which file and which line caused the exception?**
    *   File: `Calculator.java`, Line: `65`.
*   **Which line of the trace is the first one that mentions code you wrote?**
    *   `at Calculator.triggerNullPointer(Calculator.java:65)`.
*   **What single change would prevent it?**
    *   Initializing `text` with a valid string object (e.g., `String text = "Hello";`) or adding a null check (`if (text != null)`) before invoking `.length()`.