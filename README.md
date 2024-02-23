# **Java_Programming**

Java is a popular high-level programming language that was developed by James Gosling at Sun Microsystems. It is a general purpose programming language used for developing mobile, web, desktop and server-side applications.

### **Features:**

* *Platform independence*

Java programs can run on any operating system or hardware platform as long as there is a Java Virtual Machine(JVM) installed.

* *Object-oriented programming.*

Java is based on the concepts of objects, which can contain both data and methods to manipulate that data.

* *Security.*

Java has a strong emphasis on security, making it a popular choice for developing web applications and mobile aplications.

* *Versatility.*

Java can be used for a wide range of applications, including desktop, web, and mobile applications, as well as embedded systems and server-side applications.


# **Java Syntax**

*Java Syntax* is a set of rules that we follow when we are writing programs in java programming language. We use words like `class` and `public` to tell the computer what we want to do and symbols like curly braces `{}` and parantheses `()` to group things together and make our program easier to read.

Each Java language construct has its own unique syntax that specifies how it is written and used in java program.By following the correct syntax for each costruct, we can ensure that our java programs are correct and functional.

#### ***Class definition Syntax***
A class is declared using the `class` keyword followed by the name of the class, and then the body enclosed in curly braces. 
```java
public class Myclass {
  //body of the class
}
```

The class body is where the properties and behaviour of a class is defined.

#### ***Variable declaration syntax***
The syntax for defining properties in a class is to declare variables inside the class body using access modifier such as public or private followed by a variable type and name. Here is an example:

```java
public class Myclass {
  public int x; //variable x declared with access modifier public and data type int
  private String name; //Property name declared with access modifier private and data type String
}
```
# **Java Collection Interface**

The `Collection` interface is the root interface of the java collection framework.The `collection` interface is implemented in indirectly by the `List`, `Queue` and `Set` subinterfaces. The `arraylist`, `linkedlist` classes implement the `list` interface which is a sub-interface of the `collection` interface.

#### ***Methods of the collection interface***

* add()
* size()
* remove()
* addAll()
* removeAll()
* clear()
* iterator()

*** Java List ***
Elements are stored and accessed sequentially. It extends the collection interace. Classes that Implement the functionalities of the `list` interface are:

* ArrayList
* LinkedList
* Vector
* Stack

*We must import `java.util.List` package inorder to use list

```java
//ArrayList Implementation of List
List<String> items = new ArrayList<>();

//LinkedList Implementation of list
List<String> numbers = new LinkedList<>();
```

**Methods of the list Interface**

* add()
* addAll()
* get()
* iterator()
* set()
* remove()
* removeAll()
* clear()
* size()
* toArray()
* contains()

**Java List vs Set**
* List can include duplicate elements. However, sets cannot have duplicate elements.
* Elements in list are sorted in some order. Elements in sets are stored in groups like a set in mathedmatics.

**String processing**

### **Methods of the String Class**

### ***String analysis***
* Length.()
* isEmpty()
* indexOf()
* lastIndexOf()
* matches()

### ***String comparison***

* equals()
* equalsIgnoreCase()
* contentEquals()
* contains()
* startsWith()
* endsWith()
* compareTo()
* compareToIgnoreCase()

### ***String transformation***
* substring()
* format()
* concat()


