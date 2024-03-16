import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int userInput = in.nextInt();

        System.out.println("This is the requested " +userInput+"x"+userInput+ " box:");

        for(int j=0; j<userInput; j++){
            for(int i=0; i<userInput; i++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
