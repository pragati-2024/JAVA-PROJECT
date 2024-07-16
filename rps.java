package rps;

import java.util.Random;
import java.util.Scanner;

public class rps {
    // Here we are forming  a game ROCK PAPER SCISSOR
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock.. 1 for Paper.. 2 for Scissor");
        Scanner sc=new Scanner(System.in);
        // here we take input of the person who are playing game with computer
        int person= sc.nextInt();
        
        // here is the random number choosen by computer
        Random ran= new Random();
        int compperson=ran.nextInt(3);

        // agar computer aur aapne same number guess kara
        if(person == compperson){
            System.out.println("bhai Draw hogya :( ");
        }
        // aur agr aap dono nae alg alg number guess kara
        else if(person==0 && compperson==2 || person==1 && compperson==0 || person==2 && compperson==1 ){
            System.out.println("AAP JEET GYE, YAY!! :)");
        }
        else{
            System.out.println("COMPUTER BHAII JEETGYA");
        }

        // ab computer ki choice bhi ptaa honi chahiye
        System.out.println("Computer chooses "+ compperson);
    }
}
