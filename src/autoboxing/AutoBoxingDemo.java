package autoboxing;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i = 10;

        // Autobox
        Integer iObj = Integer.valueOf(i);
        System.out.println("Value of Integer obj: " + iObj);

        // Auto-Unbox
        int i1 = iObj;
        System.out.println("Value of i1: " + i1);

        // Autobox
        Character charObj = 'a';

        // Auto-Unbox
        char ch = charObj;
        System.out.println("\nValue of ch: " + ch);
        System.out.println("Value of charObj: " + charObj);
    }
}
