package DataTypes;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give the inches you want to covert into the cm   ");

        double inches = input.nextDouble();
        double centimentres = inches*2.5;

        System.out.println("It is "+ centimentres + " in centimentres");

    }
}
