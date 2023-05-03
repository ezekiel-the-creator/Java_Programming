## **Java Annotations**

Annotations are metadata for a program's source code. They serve to provide additional information about the program to the compiler but are not
part of the program itself.

Example: *@Override Annotation Example*

```java
class Animal {
	public void displayInfor(){
		System.out.println("I am an animal");
		}
	}
}


class Dog extends Animal{
	@Override
	public void displayInfor(){
		System.out.println("I am a dog")
		}
	}
}

class Main {
	public static void main(String... args){
		Dog d1 = new Dog();
		d1.displayInfor();
		}
	}
}
```
### **Annotation formats**

1. Marker Annotations

	Marker annotations do not contain members/elemts. Only used for marking a declaration.

	Syntax:

	```java
	@AnnotationName
	```
	It is not necessary to include parantheses in the annotation name since this kind of annotations have no members. For example the @Override annotation.

2. Single element Annotations

	These annotations contain only one element.

	Syntax:

	```java
	@AnnotationName(elementName = "elementValue")
	```
3. Multiple element Annotations

	These annotaions contain multiple elements separated by commas.

	Syntax: 

	```java
	@AnnotationName(element1 = "value1", element2 = "value2")

### **Annotation placement**

1. **Above declarations**

	Java annotations can be placed above class, method, interface, field and other program element declarations.

	Example:

	```java
	import java.util.*;
	class Main {
		@SupressWarnings("unchecked")
		static void wordsList(){
			ArrayList wordList = new ArrayList<>();
			
			//unchecked warning
			wordList.add("These choppers in these place they all doing the same, they take me overseas");
			System.out.println("Word list => " + wordList);
		}

		public static void main(String... args){
			wordsList();
		}
	}
	```
2. **Type annotations**	

	*constructor invocations*
	
	```java
	new @Readonly ArrayList<>()
	```

	*type definitions*

	```java
	@NonNull String str;
	
	@ NonNull List<String> newList;

	```
	*type casts*

	```java
	newStr = (@NonNull String) str;
	```
	*extends and implements clause*

	```java
	class Warning extends @Localized Message
	```
	*throws clause*

	```java
	public Srting readMethod() throws @Localized IOException
	```
	***Type Anotations*** enables java code to be analyzed better and provide even stronger type checks.

### **Use of Annotations**

* **Compiler Instructions** - Built in annotations can be used for giving instructions to the compiler, detect errors or supress warnings.
* **Compile-time Instructions** - Compile-time annotations can help software build tools to generate code, XML files and many more.
* **Runtime instructions** - Some annotations can be defined to give instructions to the program at runtime. They are accessed using java reflection.