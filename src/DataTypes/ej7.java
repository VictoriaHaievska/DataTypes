
/*Write a Java program that reads a number and display the square, cube, and fourth power*/

package DataTypes;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int squared = (int) Math.pow(number, 2);
        int tripled = (int) Math.pow(number, 3);
        int cuatro = (int) Math.pow(number, 4);

        System.out.println(squared + " " + tripled + " " +cuatro);
    }
}
