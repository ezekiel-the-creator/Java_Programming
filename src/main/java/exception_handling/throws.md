**Java throws Keyword**

`throws` keyword is used in method declaration to declare the type of exceptions that might occur within it.

Syntax:

    ```java
    accessModifier returnType methodName() throws ExceptionTypeA, ExceptionTypeB ... {
        //body of method
    }
    ```
There might be several methods that can cause excetions and writing  `try...catch` for each method can be tedious and also result to lengthy codes that are less readable, throws might come in handy in such a situation since multiple exceptions can be thrown at once and easily handled.
It is also useful when you have a checked exception that you don't want to catch in your current method.