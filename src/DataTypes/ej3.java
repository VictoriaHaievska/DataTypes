/*Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer*/

package DataTypes;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input will be between 0 and 1000;

        System.out.println("Write a number between 0 and 1000");
        int number = input.nextInt();

        int firstNumber = number%10;
        int remainsAfterFirst = number/10;
        int secondNumber = remainsAfterFirst%10;
        remainsAfterFirst = remainsAfterFirst/10;
        int thirdNumber = remainsAfterFirst%10;
        remainsAfterFirst = remainsAfterFirst/10;
        int fourthNumber = remainsAfterFirst%10;

        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println(sum);


    }

}
