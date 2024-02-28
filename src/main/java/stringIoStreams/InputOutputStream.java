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

    private static void pipedInputOutputStream1() throws Exception {
        System.out.println("\npipedInputOutputStream1():");
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
    }

    private static void pipedInputOutputStream2() throws Exception {
        System.out.println("\npipedInputOutputStream2():");
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
    }

    private static void pipedInputOutputStream3() throws Exception {
        System.out.println("\npipedInputOutputStream3():");
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
    }

    private static class PipedOutputWorker implements Runnable{
        private PipedOutputStream pos;

        public PipedOutputWorker(PipedOutputStream pos) {
            this.pos = pos;
        }

        @Override
        public void run() {
            try {
                for(int i = 1; i < 4; i++) {
                    pos.write(i);
                }
                pos.close();
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }

    private static class PipedInputWorker implements Runnable{
        private PipedInputStream pis;

        public PipedInputWorker(PipedInputStream pis) {
            this.pis = pis;
        }

        @Override
        public void run() {
            try {
                int i;
                while((i = pis.read()) > -1){
                    System.out.print(i + " ");
                }
                pis.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void pipedInputOUtputStream4() {
        System.out.println("\npipedInputOutputStream4():");
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        try {
            pos.connect(pis);
            new Thread(new PipedOutputWorker(pos)).start();
            new Thread(new PipedInputWorker(pis)).start();
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void sequenceInputStream() {
        System.out.println("\nsequenceInputStream():");
        String file1 = classLoader.getResource("hello.txt").getFile();
        String file2 = classLoader.getResource("howAreYou.txt").getFile();
        try(FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2)){
                int i;
                while((i = sis.read()) > -1){
                    System.out.print((char)i);
                }
            }catch (Exception ex) {
                ex.printStackTrace();
            }
    }

    private static void filterInputStream() {
        System.out.println("\nfilterInputStream():");
        String file = classLoader.getResource("hello.txt").getFile();
        try(FileInputStream fis = new FileInputStream(file);
            FilterInputStream filter = new BufferedInputStream(fis)){
                int i;
                while((i = filter.read()) > -1){
                    System.out.print((char)i);
                }
            }catch (Exception ex) {
                ex.printStackTrace();
            }
    }

    private static void printStream1() {
        System.out.println("\nprintStream1():");
        String fileName = "output.txt";
        try(FileOutputStream fos = new FileOutputStream(fileName);
            PrintStream ps = new PrintStream(fos)){
                ps.println("Hi there!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }

    private static void printStream2() {
        System.out.println("\nprintStream2():");
        String fileName = "output.txt";
        try (PrintStream ps = new PrintStream(fileName)){
            ps.println("Hi there!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printStream3() {
        System.out.println("\nprintStream3():");
        for (String chs : Charset.availableCharsets().keySet()) {
            System.out.println(chs);
        }
    }

    private static void printStream4() {
        System.out.println("\nprintStream4():");
        System.out.printf("Hi, %s!%n", "dear reader");
        System.out.format("Hi, %s!%n", "dear reader");
    }
}
