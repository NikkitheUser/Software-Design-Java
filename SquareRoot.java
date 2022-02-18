//Title: SquareRoot
// Abstract: User enters in whole number and program outputs muultiple squareroot guesses until correct answer
//Author: Nicole Safty
//Date: 02/08/2022
import java.util.InputMismatchException;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        double input=-1;
        int count=1;

        System.out.println("This program estimates square roots.");
        boolean done=false;
                while(!done){

            try { System.out.println("Please enter a whole number");
                Scanner keyboard= new Scanner(System.in);//we do this to avoid a loop if user enters a String
                input=keyboard.nextInt();
                if(input<0){//use exception handling
                    System.out.println("Please enter a whole number (That's a negative!)");
                    continue;
                }
                done=true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a whole number (no words, just numbers)");
            }

        }
        double guess=input/2;
        double temp;
       System.out.printf("Initial guess %.2f", guess );
       System.out.println();

      do{
          count++;
          temp=guess;
          guess=(temp+(input/temp))/2;
          System.out.print(" guess "+count+ ": ");
          System.out.printf("%.6f",guess);
          System.out.println();

      }while((temp-guess)/guess>.01);
      int last= (int)input;
        System.out.print("The estimated square root of "+last+" is " );
        System.out.printf(" %.2f", guess );
}}
