package libraries;

import org.apache.commons.codec.binary.Base64;

public class Codec {
    public static void main(String... args){
        String encodedStr = new String(Base64.encodeBase64("Hello, world!".getBytes()));
        System.out.println(encodedStr);

        System.out.println(Base64.isBase64(encodedStr));

        String decodedStr = new String(Base64.decodeBase64(encodedStr.getBytes()));
    }
}
