public class Relational {
    // Comparison operators are used to compare two values (or variables). This is
    // important in programming, because it helps us to find answers and make
    // decisions.
    // it only true or false

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // > - greater than
        System.out.println(a > b); // false
        // < - less than
        System.out.println(a < b); // true
        // == equals too
        System.out.println(a == b); // false
        // != not equal too
        System.out.println(a != b); // true
        // >= - greater than equal to
        System.out.println(a >= b);// false
        // <= - less than equal to
        System.out.println(a <= b); // true

        // Logical Operators -- they are used to compare the relational exprssions

        // logical and && -- gives true only when both the operand are true
        boolean result = 4 > 5 && 6 < 7;
        System.out.println(result);
        // logical or || -- gives true only if one of the operand is true

        result = 4 > 5 || 6 < 7;
        System.out.println(result);

        // logical not ! -- reverse the value
        System.out.println(!result);

    }
}
