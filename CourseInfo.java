
import java.util.Scanner;

public class CourseInfo {
    private String courseTitle;
    private String instructor;
    private int enrollment;
    double average;
    private double score1,score2,score3;

    public void printInfo() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment: " + enrollment);
        System.out.println("Average: " + average);
    }

    public void readInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter course title: ");
        courseTitle = keyboard.nextLine( );
        System.out.print("Enter instructor name: ");
        instructor = keyboard.nextLine( );
        System.out.print("Enter enrollment: ");
        enrollment = keyboard.nextInt( );
        System.out.println("Enter a score");
        score1= keyboard.nextInt();
        System.out.println("Enter a score");
        score2= keyboard.nextInt();
        System.out.println("Enter a score");
        score3= keyboard.nextInt();

        average=(score1+score2+score3)/3;
    }
}
