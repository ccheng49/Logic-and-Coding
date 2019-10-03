//Knock Knock, Number 6
import java.util.Scanner;
public class Knock{
    public static void main(String args[]){
        System.out.println("Knock, Knock. Who's There?");
        Scanner text = new Scanner (System.in);
        String b = "banana", o = "orange", guess = text.nextLine();
        
        if (guess.equals(o)){
            System.out.println("Orange, You Glad You Didn't Type Banana?");
        }
        else
        while(!guess.equals(o)){
            if (guess.equals(b)){
                System.out.println("Banana Who?");
                break;
            }
            
            else
            System.out.println("You Are Not Playing My Game Very Well");
            System.out.println("Knock, Knock. Who's There?");
        }
        
        text.close();
    }
}
