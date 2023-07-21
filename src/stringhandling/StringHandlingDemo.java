package stringhandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "Shikhu is studying";
        String str2 = " in college";
        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        result = String.format("The name of the student is " + "%s, and the age is %d", "Sobuu", 20);
        System.out.println(result);

        System.out.println(str1.charAt(5));

        if(str1.equals(str2))
            System.out.println("Both strings are same");
        else
            System.out.println("Both strings are different");

        System.out.println(str1.indexOf('y'));

        System.out.println(str1.replace('s', 'r'));

        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr1 = str1.substring(1, 5);
        System.out.println(newStr1);

        // StringBuffer and StringBuilder
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial Capacity: " + sb.capacity());
        sb.append("Sobuu");                                         // Adds string to existing string
        System.out.println("String: " + sb);
        System.out.println("Length: " + sb.length());                   // Prints string length
        sb.deleteCharAt(4);                                       // Deletes Character from a particular index
        sb.insert(0, "Shikhu ka ");                          // Adds string to particular index
        String nickname = sb.toString();                                // Cast the whole string to String object
        System.out.println("Final: " + nickname);
        // StringBuilder is same but it is not ThreadSafe
    }
}