package stringIoStreams;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.net.URI;

public class Files {
    public static void main(String... args) throws Exception {
        createFile1();
        createFile2();
        list1();
    }

    private static void createFile1() {
        File f = new File("NameOnly.txt");
        try {
            f.createNewFile();
            f.delete();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
