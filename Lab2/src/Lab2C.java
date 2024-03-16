import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();

        int totalWidth = width*2;
        int totalHeight = height*2;
        System.out.println("The area is " + (width*height));
        System.out.println("The perimeter is " + (totalWidth+totalHeight));
    }
}
