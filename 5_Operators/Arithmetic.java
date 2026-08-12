/**
 * Arithmetic
 */
public class Arithmetic {

    public static void main(String[] args) {
        // Arithmetic operators are used to perform common mathematical operations.

       
        // System.out.println(6 + 7);// addition -- Adds together two values
        // System.out.println(6 - 7);//Subtraction	-- Subtracts one value from another
        // System.out.println(6 * 7);// multiplication -- Multiplies two values
        // System.out.println(6 / 7.0);// divison - divides two values // discard the decimal value in int/int division
        // System.out.println(6 % 7);// Modulus -- Returns the division remainder

        // increment -- Increases the value of a variable by 1

        int num = 10;
        int result1 = num++; // fetch the value and assign to the variable and then  increment (POST INCREMENT)
        // result 1 -- 10 and num --- 11
        int result2 = ++num; // increment and then assign(PRE INCREMENT)

        System.out.println(result1);
        System.out.println(result2);

        // decrement -- Decreases the value of a variable by 1
        int num2 = 10;
        int result3 = num2--; // fetch the value and assign to the variable and then  decerement (POST decerement)
        // result3 -- 10 and num2 --- 9
        int result4 = --num2; // decerement and then assign(PRE decerement)

        System.out.println(result3);// 10
        System.out.println(result4);//8
    }

}