package oop_java.abstraction;

public abstract class Language {
   public void display() {
    System.out.println("This is java programming");
   }
}

class Main extends Language {
    public static void main(String... args){
        Main obj = new Main();

        obj.display();
    }
}
