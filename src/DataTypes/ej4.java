/*Write a Java program to convert minutes into a number of years and days*/

package DataTypes;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        long timeZone = System.currentTimeMillis();

        System.out.println("Give the minutes to convert them into the years");
        int minutes = input.nextInt();

       int hours = minutes/60;
       int days = hours/24;
       int years = days/365;
       int daysFinal = days%365;

       System.out.println("These seconds are enqual to " + years + "years, and " + daysFinal + " days");
    }
}
