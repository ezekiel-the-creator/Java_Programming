1. **Predefined Annotations**

    * @Deprecated
        A marker annotation that indicates an element has been deprecated and has been replaced by a newer element.
    * @Override
        Specifies that a method of the subclass overrides a method of the super class with the same name, return type and parameter list if there is any.
    * @SuppressWarnings
        Instructs the compiler to supress the warnings that are generated while aprogram executes.
    * @SafeVarargs
        Asserts that the annotated method does not perform unsafe operation on its varargs(variable number of arguments.)
        This type of annotation can only be used on methods and constructors than can't be overriden(i.e final and static methods), for java 9 and later they can as well be used on private methods.
    * @FunctionalInterface
        Indicates that the type declaration on which it is used is a functional interface. A *functional inteface* is one which can only have a single abstract method.

2. **Meta-annotations**

    Annotations that are applied to other annotations are called Meta-annotations.

    * @Retention
        Specifies the level up to which the annotation will be available.
        Syntax:

        ```java 
        @Retention(RetentionPolicy)
        ```
        .SOURCE, .CLASS AND .RUNTIME are three types of Retention policies available at the source level, at compiler level and at JVM during runtime respectively.

    * @Documented
        Used to include a customized annotation in the javadoc documentation.
    * @Target
        used for restricting an annotation to be applied to specific targets.
    * @Inherited
        If there is need to inherit an annotation from the superclass then @Inherited is used.
    * @Repeatable
        An annotation that is marked repeatable can be applied multiple times to the same declaration.

3. **Custom Annotations**
    These are annotations that you create on your own. 

    *About custom annotations*
    
    * They can be created by using `@interface` followed by the annotation name.
    * They can have elements that look like methods but do not have an implementation.
    * The default value is optional. The parameters cannot have a null value.
    * The return type of the method can be primitive, enum, string, class name or array of these types.