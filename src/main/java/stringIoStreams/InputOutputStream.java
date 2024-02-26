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

    private static byte[] byteSource(){
        return new byte[] {42, 43, 44};
    }

    private static void byteArrayInputStream() {
        System.out.println("\nbyteArrayInputStream1()");
    }
}
