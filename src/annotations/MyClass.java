package annotations;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("My Custom Annotation");
    }

    public static void main(String[] args) {
        /**
         * @Override
         * @SuppressWarning
         * @Author
         */

        MyClass object = new MyClass();
        try {
            Method methodValue = object.getClass().getMethod("sayHello");
            MyCustomAnnotation myCustomAnnotation = methodValue.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Value is: " + myCustomAnnotation.value());
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("Cannot access the specified method");
        }
    }
}
