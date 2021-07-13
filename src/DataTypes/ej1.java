package DataTypes;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Write the temperature in F ");

        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit/2.12);

        System.out.println ("The C temperature equivalent to F is..." + celsius);



    }
}
