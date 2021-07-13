/*Write a Java program to compute body mass index (BMI)*/

package DataTypes;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight: ");
        double weight = input.nextInt();
        System.out.print("What is your height in metres: ");
        double height = input.nextInt();

        double bmi = weight/(height*height);
        System.out.println(bmi);
    }
}
