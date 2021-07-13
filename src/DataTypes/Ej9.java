/*Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).*/

package DataTypes;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integer1 = input.nextInt();
        int integer2 = input.nextInt();

        int sum = integer1 + integer2;
        int dif = integer1 - integer2;
        int prod = integer1 * integer2;
        float average = (integer1 + integer2)/2;
        int dist = (int) (Math.abs(integer1 - integer2));
        int min = (int) (Math.min(integer1, integer2));
        int max = (int) (Math.max(integer1, integer2));

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + dif);
        System.out.println("Product of two integers: " + prod);
        System.out.println("Average of two integers: " + average);
        System.out.println("Distance of two integers: "+ dist);
        System.out.println("Max Integer: " + max);
        System.out.println("Min Integer: " + min);
    }
}
