import java.util.Scanner;
public class Lab7C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int userInput = in.nextInt();

        System.out.println("This is the requested " +userInput+"x"+userInput+ " right-triangle:");

        for(int i=0; i<userInput; i++){
            for(int k=userInput; k>i; k--)
                System.out.print(" ");
                for (int j=0; j<1+i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
