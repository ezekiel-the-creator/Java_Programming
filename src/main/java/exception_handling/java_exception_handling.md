**Approaches to handle exceptions in java**

* try...catch block

Syntax:

    ```java
    try {
        //code
    }
    catch(Exception e){
        //code
    }
    ```
The `try` block includes the code thatmight generate an exception, the `catch` block includes the code that is excecuted when an exceptions occurs inside the `try` block.
We can use the `try` block without the `catch` block but never vice versa.
For each try block there can be zero or multiple catch blocks. Multiple catch blocks allows each exception to be handled differently.
However since Java SE 7 and later, more than one type of exception can be hanled in a single catch block, this reduces code duplication and increases the simplicity and efficiency. Each exception type to be handled is separated using the vertical bar `|`.

Syntax:

    ```java
    try {
        //code
    }catch(ExceptionTypeA | ExceptionTypeB ex){
        //catch block code
    }
    ```
* try-with-resources

A try statement that has one or more resurce declarations.

Syntax:

    ```java
    try(resource declaration) {
        //use of resource
    } catch (Exception e){
        //catch block
    }
    ```

Example:

    ```java
    try(Scanner input = new Scanner(System.in)){
        //Use of the scanner resource
    }
    ```
    This statement automatically closes all the resources at the end of the statement.

* finally block

`finally` block is always excecuted no matter whether there is an exception or not in the `try` block.

Syntax:

    ```java
    try {
        //code
    }catch(Exception e){
        //code
    }finally{
        //This block is always excecuted.
    }
    ```
*Advantages of using finally block*

1. code that might be accidentally skipped by return, continue or break can be included in the `finally` block.
2. clean up code like closing a file or connection can also be included in the `finally` block.

* throw and throws keyword

`throw` keyword is used to explicitly throw a single exception, when an exception is thrown the flow of the program moves from the `try` block to the `catch` block.