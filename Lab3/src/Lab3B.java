import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Course 1 hours: ");
        float c1 = in.nextFloat();
        System.out.print("Grade for course 1: ");
        float g1 = in.nextFloat();
        float gpa1 = c1*g1;

        System.out.print("Course 2 hours: ");
        float c2 = in.nextFloat();
        System.out.print("Grade for course 2: ");
        float g2 = in.nextFloat();
        float gpa2 = c2*g2;

        System.out.print("Course 3 hours: ");
        float c3 = in.nextFloat();
        System.out.print("Grade for course 3: ");
        float g3 = in.nextFloat();
        float gpa3 = c3*g3;

        System.out.print("Course 4 hours: ");
        float c4 = in.nextFloat();
        System.out.print("Grade for course 4: ");
        float g4 = in.nextFloat();
        float gpa4 = c4*g4;

        int totalHrs = (int) ((int)c1+c2+c3+c4);
        int qualityPts = (int) ((int)gpa1+gpa2+gpa3+gpa4);
        float gpa = (gpa1+gpa2+gpa3+gpa4)/(c1+c2+c3+c4);

        System.out.println("Total hours is: " +totalHrs);
        System.out.println("Total quality points is: " +qualityPts);
        System.out.printf("Your GPA for this semester is %.5f %n", +gpa);

    }

}
