package Randomguess;
import java.util.*;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:- ");
        String name = sc.nextLine();

        System.out.println("well, "+name+"!"+" Guess a number between 1 to 30.");
        int mynum= myrandom(1, 30);

        for(int i=0 ; i<6; i++){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Guess the number:- ");
            int guessnum =sc2.nextInt();

            if(guessnum == mynum){
                System.out.println("yeah you got the correct answer! (: ");
                break;
            }
            else if(guessnum < mynum){
                System.out.println("Your guess is too low ):");
            }
            else if(guessnum > mynum){
                System.out.println("Your guess is too high ):");
            }
            if(i>=5){
                System.out.println();
                System.out.println("The correct guess is:- "+ mynum);
                System.out.println("Better luck next time (; ");
            }
            
        }

    }
    public static int myrandom(int min,int max){
        Random ran= new Random();
        return ran.ints(min, max).findFirst().getAsInt();
    }
}
