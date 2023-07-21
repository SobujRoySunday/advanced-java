package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try{
            inStream = new FileInputStream("C:\\myJava\\source.txt");
            outStream = new FileOutputStream("C:\\myJava\\destination.txt");

            // Reads a byte at a time, if it reached end of the file, returns -1
            int content;
            while((content = inStream.read()) != -1){
                outStream.write((byte) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(inStream != null){
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outStream != null){
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}