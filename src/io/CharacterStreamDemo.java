package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        FileReader readerStream = null;
        FileWriter writerStream = null;
        try{
            readerStream = new FileReader("C:\\myJava\\source.txt");
            writerStream = new FileWriter("C:\\myJava\\destination.txt");

            // Reading source file and writing content to target file character by character
            int content;
            while((content = readerStream.read()) != -1){
                writerStream.append((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(readerStream != null){
                try {
                    readerStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writerStream != null){
                try {
                    writerStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
