//Title: Histogram
// Abstract: User enters in length of array and the numbers in the array. program then counts the occurances and sorts into a
//vertical histogram
//Author: Nicole Safty
//Date: 02/02/2022
import java.util.Scanner;
import java.util.Arrays;
public class Histogram {
    public static void main(String[] args) {
        int input;
int max=0;//the biggest number
int col=0;//the length of the histogram, the max of the array;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("How many input values [max: 30]");
        input=keyboard.nextInt();
        int[] values=new int[input];
        System.out.println("Enter "+ input +" numbers");
        for(int i=0;i<input;i++){//enter a value each time
            values[i]=keyboard.nextInt();
        }

        Arrays.sort(values);// sort the array
        int[] used=new int [input];
        int visited = -1;

        for(int i = 0; i < input; i++){
            int count = 1;
            for(int j = i+1; j < input; j++){
                if(col<values[i]){//make this the major value
                    col=values[i];
                }
                if(values[i] == values[j]){
                    count++;
                    //To avoid counting same element again
                    used[j] = visited;
                }
            }
            if(used[i] != visited)
                used[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Number | Occurance");
        System.out.println("---------------------------------------");
        for(int i = 0; i < used.length; i++){
            if(max<used[i]){
                max=used[i];
            }
            if(used[i] != visited)
                System.out.println("    " + values[i] + "        " + used[i]);
        }

        //histogram
        System.out.println("========= Vertical Bar ========");

int num=max-1;
        System.out.print("| "+max+" | ");

        for (int i = max; i > 0; i--)
        {
            for (int j = 0; j < used.length; j++)
            {
                if (used[j] >= i)
                {
                    System.out.print("* ");
                }
        else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(num>0){
                System.out.print("| "+num+" | ");
                num--;}
            else{
                continue;
            }
        }


        System.out.println("===============================");
        System.out.println("| No | 0 1 2 3 4 5 6 7 8 9");
        System.out.println("===============================");
    }}

