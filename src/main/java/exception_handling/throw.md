**Java throw keyword**

`throw` keyword is used to explicitly throw a single exception. The flow of the program flows from try block to the catch block when an exception is thrown within a method.

Syntax:

    ```java
    throw throwableObject;
    ```
A throwable object is an instance of the class Throwable or subclass of the Throwable class.

Example:

```java
class Main {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String... args){
        divideByzero();
    }
}
```

Throwing checked exceptions

```java
import java.io.*;

class Main {
    public static void findFile() throw IOException {
        throw new IOException("file not found");
    }

    public static void main(String... args){
        try{
            findFile();
            System.out.println("Rest of code in try block");
        } catch(IOException j){
            System.out.println(j.getMessage());
        }
    }
}
```
**Output**

```java
file not found
```