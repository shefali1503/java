public class literals {
    public static void main(String[] args) {
        // a fixed value that can be written directly in the code

        // integer literals;
        int a = 110; // decimal (Base 10)
        int b = 0b110; // binary (Base 2)
        int c = 0110; // octal (Base 8)
        int d = 0x110; // hexadecimal (Base 16)

        // floating point literals
        // double literals
        double num = 3.14; // normal decimal number
        double expo = 2e-24; // normal decimal number 2 * 10^-24
        // float literal that ends with a f or
        float f = 3.14f;

        // character literals (16 bit UNICODE Characters)
        // 'a' , '?' . '1'
        // unicode escape codes '\u0061' 0061 is a hexadecimal code for a character
        char ch = '\u0062';
        System.out.println(ch);

        // escape sequences -- represent a specific control characters
        System.out.println("Hi\tRohan");

        // string literals -- double quotes

        // boolean literals - only true or falso no 0 and 1

        // null literals -- that this reference variavble do not point to any object in the memory

        // literal enhancements rules

        // underscore in numeric literals you can insert underscores (_) anywhere between digits in integer or floating-
        int salary = 10_00_00_00_00;
        System.out.println(salary);

        

    }

}
