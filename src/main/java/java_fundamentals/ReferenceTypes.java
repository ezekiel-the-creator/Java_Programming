package java_fundamentals;

public class ReferenceTypes {
    public static void main(String... args){

    }

    private static void array1(){
        int[] intArray = new int[4];
        float[][] floatArray = new float[3][6];
        String[] stringArray = new String[5];

        //elements of an array are initialized to default values at their creation time

        System.out.println(intArray[1]);//0
        System.out.println(floatArray[4]);//0.0
        System.out.println(stringArray[2]);//null
    }

    private static void array2(){
        //creating an array using an array initializer.
        int[] intArray = {3, 4, 5, 6, 0, 2, 1};
        float[][] floatArray = {{23.4f, 587.0f, 2.4f}, {4, 8, 8.3f}};
        String[] stringArray = {"Put it down on paper","nataraj"};

        System.out.println(intArray[5]);
        System.out.println(floatArray[1][3]);
        System.out.println(stringArray[1]);
    }

    public static void array3(){
        float[][] floatArray = new float[3][];
        System.out.println(floatArray.length);
        System.out.println(floatArray[0]);
        System.out.println(floatArray[1]);
        System.out.println(floatArray[2]);
        //System.out.println(floatArray[3]);    //error
        System.out.println(floatArray[2][2]);

        floatArray[0] = new float[4];
        floatArray[1] = new float[3];
        floatArray[2] = new float[7];
        System.out.println(floatArray[2][6]);   //prints: 0.0
    }
}
