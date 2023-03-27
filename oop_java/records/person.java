//records are a new feature that provides a compact syntax for declaring classes that are primarily used to hold data.
//available for java16 and later versions

public record Person(String name, int age){}

//the declaration does not include any constructors or methods, these are generated automatically by the compiler based on the record's fields.

//creating an object syntax

Person Zak = new Person("Zak", 20);

//Accessing data

System.out.println(Zak.name());
