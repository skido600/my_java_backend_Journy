public class Type {
    public static void main(String[] args) {
        stringDemo();
        numberDemo();
        booleanDemo();
        charDemo();
    }

    // ===== STRING METHODS =====
    public static void stringDemo() {
        String name = "Leo Wave";
        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Substring(0,3): " + name.substring(0, 3));
        System.out.println("Contains 'Wave': " + name.contains("Wave"));
        System.out.println("Replace 'Leo' with 'Mr': " + name.replace("Leo", "Mr"));
        System.out.println("Trim example: '" + "  Hello  ".trim() + "'");
        System.out.println("Equals 'leo wave': " + name.equals("leo wave"));
        System.out.println("EqualsIgnoreCase 'leo wave': " + name.equalsIgnoreCase("leo wave"));
        System.out.println("Split example:");
        String[] parts = name.split(" ");
        for (String part : parts) {
            System.out.println(" - " + part);
        }
        System.out.println();
    }

    // ===== NUMBER METHODS =====
    public static void numberDemo() {
        int a = 10;
        int b = 20;
        double d = 5.7;

        System.out.println("Integer a: " + a);
        System.out.println("Integer b: " + b);
        System.out.println("Max: " + Integer.max(a, b));
        System.out.println("Min: " + Integer.min(a, b));
        System.out.println("Sum: " + (a + b));
        System.out.println("Double d: " + d);
        System.out.println("Math.round(d): " + Math.round(d));
        System.out.println("Math.ceil(d): " + Math.ceil(d));
        System.out.println("Math.floor(d): " + Math.floor(d));
        System.out.println();
    }

    // ===== BOOLEAN METHODS =====
    public static void booleanDemo() {
        boolean flag = true;
        System.out.println("Boolean flag: " + flag);
        Boolean boolObj = Boolean.valueOf(flag);
        System.out.println("Boolean object: " + boolObj);
        boolean parsed = Boolean.parseBoolean("false");
        System.out.println("Parsed from string 'false': " + parsed);
        System.out.println();
    }

    // ===== CHAR METHODS =====
    public static void charDemo() {
        char letter = 'A';
        char digit = '1';
        System.out.println("Char letter: " + letter);
        System.out.println("Is letter? " + Character.isLetter(letter));
        System.out.println("Is digit? " + Character.isDigit(letter));
        System.out.println("Uppercase of 'a': " + Character.toUpperCase('a'));
        System.out.println("Lowercase of 'Z': " + Character.toLowerCase('Z'));
        System.out.println("Is digit? " + Character.isDigit(digit));
        System.out.println();
    }
}
