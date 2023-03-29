package java_fundamentals;

public class AccessModifiers {
    String prop1;
    private String prop2;
    protected String prop3;
    public String prop4;

    void method1(){}
    private void method2(){}
    protected void method3(){}
    public void method4(){}


    class A1{}
    protected class A2{}
    public class A3{}
    private class A4{}

    interface I1{ }
    public interface I2{ }
    private interface I3{}
    protected interface I4{}

    private String topLevelPrivateProperty = "top-level private value";
    private void topLevelPrivateMethod(){
        var inner = new InnerClass();
        System.out.println(inner.innerPrivateProperty);
        inner.innerPrivateMethod();
    }

    private class InnerClass{
        private String innerPrivateProperty = "Inner private Value";
        private void innerPrivateMethod(){
            System.out.println(topLevelPrivateProperty);
        }
    }

    private static class InnerStaticClass {
        private static String prop = "Inner private Static";
        private String innerPrivateProperty = "Inner Private value";
        private void innerPrivateMethod(){
            var top = new AccessModifiers();
            System.out.println(top.topLevelPrivateProperty);
        }
    }

    public static void main(String[] args){
        var top = new AccessModifiers();
        top.topLevelPrivateMethod();
        //var inner = new InnerClass();
        System.out.println(InnerStaticClass.prop);
        var  inner = new InnerStaticClass();
        System.out.println(inner.innerPrivateProperty);
        inner.innerPrivateMethod();
    }
}
