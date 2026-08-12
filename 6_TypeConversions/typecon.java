public class typecon {
    // It is the process in Java where we convert one datatype into another

    // so that we can perform operations on different datatypes

    // Implicit -- happens automatically when converting an smaller datatype into
    // larger ones
    public static void main(String[] args) {
        byte a = 124;
        int b = a;
        float c = a;
        // flow 
        System.out.println(a);
        System.out.println(c);

        // explicit -- manually when converting larger datatype into smaller one
        // datatype variablename = (datatype to be converted) variablename
        // type casting or narrowing

        double d = 34.56;
        int i = (int)d;

        System.out.println(d);
        System.out.println(i);

        // int to byte conversion --- if the value is within the range of byte then  it will be converted as it is if not modulus of the number is taken by 4

        int num = 12388;
        byte n = (byte) num;
        System.out.println(n); // 12388 modulo with 256 as byte can have exactly 256 values and remainder will be the answwer

    }

}
