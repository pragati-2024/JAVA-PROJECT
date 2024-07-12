package Gradecalc;
import java.util.*;

public class gradecal {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Enter Number of Subjects you want to enter:- ");
        int numsub = sc2.nextInt();
        if(numsub<=0){
            System.out.println("Please enter valid number of Subjects.");
            return;
        }

        int tmarks=0;
        int maxnum=100;
        for(int i=1; i<=numsub; i++){
            System.out.println("Enter marks obtained in subjects "+i+ "(out of 100):");
            int marks = sc2.nextInt();

            if(marks < 0 || marks>maxnum){
                System.out.println("Please enter the marks in range between 1 to 100");
                i--;
            }
            else{
                tmarks += marks;
            }
        }
 
        double avpercg= ((double) tmarks / (numsub*maxnum))*100;
        System.out.println("Total marks will be:- "+ tmarks);
        System.out.println("The average of the total number is :- "+ (double)avpercg+"%");
        String grade;
        if(avpercg >= 90) {
            grade= "A";
        }
        else if(avpercg >= 80){
            grade = "B";
        }
        else if(avpercg >= 70){
            grade= "C";
        }
        else if(avpercg >= 60){
            grade= "D";
        }
        else{
            grade= "E";
        }
       System.out.println("Your grade will be:- "+ grade);

       
    }
}
