import java.util.Scanner;
public class WhileLoops{
    public static void main (String args[]){
        Scanner keys = new Scanner(System.in);
        
        int quit = 3, guess = quit - 1, number, square, cube;
        while(quit != guess){
            System.out.println("Enter a number: ");
            number = keys.nextInt();
            
            System.out.println("Pick a number to do an action:");
            System.out.println("1 to square, 2 to cube, 3 to quit");
            guess = keys.nextInt();
            if(guess == 1){
                square = number * number;
                System.out.println("Square: " + square);
                System.out.println("------Restart------");
                System.out.println();
            }
            else if(guess == 2){
                cube = number * number * number;
                System.out.println("Cube: " + cube);
                System.out.println("------Restart------");
                System.out.println();
            }
        }
        System.out.println("------Quit Opperation------");
        keys.close();
    }
}