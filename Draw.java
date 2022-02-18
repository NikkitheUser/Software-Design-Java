//Title: DrawDiagram
       // Abstract: User enters in integer and program output isosceles and parallelograms
        //Author: Nicole Safty
        //Date: 02/02/2022

import java.util.Scanner;
public class Draw {
    public static void main(String[] args) {
        int length;
        System.out.println("Enter a length: ");
        Scanner keyboard= new Scanner(System.in);
        length=keyboard.nextInt();
        //parallelogram
        int line=1;
        while(line<=length){//outer while loop
            int j=1;
            while(j<=length-line){//inner while loop
                System.out.print(" ");//print space
                j++;
            }
            j=1;
            while(j<=length){//inner while loop
                System.out.print("* ");//print character after space
                j++;
            }
            System.out.print("\n");//move to next line
            line++;
        }
System.out.println(" ");
//isosceles
        for(int i=1;i<=length;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("eat ass");
        String specialPrice = keyboard.next();
        System.out.println("Your special price is $" + specialPrice + ".");
    }
}
