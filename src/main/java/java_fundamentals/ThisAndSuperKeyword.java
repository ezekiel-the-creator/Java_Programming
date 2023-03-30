package java_fundamentals;

public class ThisAndSuperKeyword {
    public static void main(String... args){
        A a = new A();
        a.setCount(3);
        System.out.println(a.getcount());

        new C().method2();
    }

    private static class A {
        private int count;
        public void setCount(int count){
            count = count;//has no effect
        }
        public int getcount(){
            return this.count;
        }
    }

    private static class B {
        public void method1(){
            System.out.println("class B method.");
        }
    }

    private static class C extends B {
        public void method1() {
            System.out.println("class C method.");
        }
        public void method2() {
            this.method1();
            super.method1();
        }
    }
}
