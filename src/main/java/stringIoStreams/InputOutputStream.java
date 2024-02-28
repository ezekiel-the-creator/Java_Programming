package stringIoStreams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.io.StreamTokenizer;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InputOutputStream {
    private static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    private static void main(String... args) throws Exception {
        byteArrayInputStream1();
        byteArrayInputStream2();
        byteArrayInputStream3();
        fileInputStream1();
        fileInputStream2();
        fileInputStream3();
        objectInputOutputStream();
        pipedInputOutputStream1();
        pipedInputOutputStream2();
        pipedInputOutputStream3();
        pipedInputOutputStream4();
        sequenceInputStream();
        filterInputStream();
        printStream1();
        printStream2();
        printStream3();
        printStream4();
        printStream5();
        streamTokenizer();
        scanner1();
        scanner2();
        scanner3();
        scanner4();
    }

    private static byte[] bytesSource(){
        return new byte[] {42, 43, 44};
    }

    private static void byteArrayInputStream1() {
        System.out.println("\nbyteArrayInputStream1():");
        byte[] buffer = bytesSource();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data = bais.read();
            while(data != -1) {
                System.out.print(data + " ");
                data = bais.read();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void byteArrayInputStream2() {
        System.out.println("\byteArrayInputStream2():");
        byte[] buffer = bytesSource();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data;
            while ((data = bais.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void byteArrayInputStream3() {
        System.out.println("\byteArrayInputStream3():");
        byte[] buffer = bytesSource();
        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data;
            while((data = bais.read()) != -1) {
                System.out.print(((char)data) + " ");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void fileInputStream1() {
        System.out.println("\nfileInputStream1():");
        String file = classLoader.getResource("hello.txt").getFile();
        try(FileInputStream fis = new FileInputStream(file)){
            int data;
            while ((data = fis.read()) != -1){
                System.out.print(((char)data) + " ");
            }
        } catch (Exception ex){
            ex.printStackTrace();
            pauseMs(100);
        }
    }

    private static void fileInputstream2() {
        System.out.println("\nfileInputStream2():");
        String file = classLoader.getResource("hello.txt").getFile();
        try(FileInputStream fis = new FileInputStream(file)){
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((data) + " ");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void fileInputStream3() {
        System.out.println("\nfileInputStream3():");
        try(InputStream is = InputOutputStream.class.getResourceAsStream("/hello.txt")){
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((data) + " ");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static class SomeClass implements Serializable {
        private int field1 = 42;
        private String field2 = "abc";
    }
    private static void objectInputOutputStream() {
        
        System.out.println("\nobjectInputOutputStream():");
        String fileName = "someClass.bin";
        try{
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(fileName));
             ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream(fileName))){
            SomeClass obj = new SomeClass();

            objectOutputStream.writeObject(obj);

            SomeClass objRead = (SomeClass) objectInputStream.readObject();

            System.out.println(objRead.field1);
            System.out.println(objRead.field2);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
