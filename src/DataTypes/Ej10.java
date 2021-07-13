package DataTypes;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int integer = input.nextInt();
        while (integer > 0) {
            System.out.print(integer%10);
            integer = integer/10;
        }
        }

    }

