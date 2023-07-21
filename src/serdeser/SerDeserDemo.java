package serdeser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student student = new Student("John", 25, "California");

        String filename = "C:\\myJava\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objectOut = null;

        // Serialization
        try{
            fileOut = new FileOutputStream(filename);
            objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(student);

            objectOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n" + student);
        } catch(IOException e){
            System.out.println("IOException caught");
        }

        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try{
            fileIn = new FileInputStream(filename);
            objectIn = new ObjectInputStream(fileIn);

            Student object = (Student) objectIn.readObject();

            System.out.println("Object has been deserialized: \n" + object);

            objectIn.close();
            fileIn.close();
        } catch(IOException e){
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
           System.out.println("ClassNotFoundException is caught");
        }
    }
}
