public class Variable {

    // string
    // way of declearing variable in java is type name of the variable value(type
    // motor="rang")
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        Number();
        ConstantF();
        Othervaariable();
    }

    // number
    public static void Number() {
        int number = 10;
        System.out.println(number);

        int myNum;
        myNum = 15;
        System.out.println(myNum);
    }

    // java dont use const or constnt like my lovely js ts it use final
    public static void ConstantF() {
        final int myNum = 200;

        System.out.println(myNum);
    }

    public static void Othervaariable() {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
    }

}
