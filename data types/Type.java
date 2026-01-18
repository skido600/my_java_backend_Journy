public class Type {
    public static void main(String[] args) {
        stringdemo();
        numberdemo();
    }

    public static void stringdemo() {
        String name_1 = "leowave";
        System.out.println(name_1);

        // string methods this seems similar to javascript own
        System.out.println(name_1.length());
        System.out.println(name_1.toUpperCase());
        System.out.println(name_1.toLowerCase());
        System.out.println(name_1.charAt(0));
        System.out.println(name_1.contains("t"));
        System.out.println(name_1.replace("l", "h"));
    }

    public static void numberdemo() {
        // Primitive number types are divided into two groups:
        // Integer types, short int long byte
        // Floating point float double
        // int myNum = 100;
        // System.out.println(myNum);

        // The byte data type can store whole numbers from -128 to 127.
        byte myNumB = 100;
        System.out.println(myNumB);

        // The short data type can store whole numbers from -32768 to 32767:
        short myNum = 5000;
        System.out.println(myNum);

        // The long data type can store whole numbers from -9223372036854775808 to
        // 9223372036854775807.

        long myNumL = 15000000000L;
        System.out.println(myNumL);

        // The int data type can store whole numbers from -2147483648 to 2147483647. In
        // general, and in our tutorial, the int data type is the preferred data type
        // when we create variables with a numeric value

        int myNumI = 100000;
        System.out.println(myNumI);

        // Floating Point Types
        // You should use a floating point type whenever you need a number with a
        // decimal, such as 9.99 or 3.14515.
        float myNumf = 5.75f;
        System.out.println(myNumf);

        double myNumd = 19.99d;
        System.out.println(myNumd);
    }

    public static int add(int a, int b) {
        return a + b;

    }
}
