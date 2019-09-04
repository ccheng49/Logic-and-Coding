/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int m;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter your birth month as numbers: ");  //prompt the user for a birth month
        m = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (m < 1 || m > 12){
            System.out.println("INVALID.");
        }
        else if (m == 9 || m == 11){
            System.out.println("There are 30 days in this month.");
        }
        else if (m == 1){
            System.out.println("There are 31 days in this month.");
        }
        else if (m % 2 == 0 || m != 2 || m != 8 || m != 10 || m != 12){
            System.out.println("There are 30 days in this month.");
        }
        else if (m % 2 == 1 || m == 8 || m == 10 || m == 12){
            System.out.println("There are 31 days in this month.");
        }
        else if (m == 2){
            System.out.println("There are either 28 or 29 days in this month.");
        }
    }
}