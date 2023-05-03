**Java Annotations**

Annotations are metadata for a program's source code. They serve to provide additional information about the program to the compiler but are not
part of the program itself.

Example: *@Override Annotation Example*

```java
class Animal {
	public void displayInfor(){
		System.out.println("I am an animal");
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
