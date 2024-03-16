import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("Welcome!");
        do{
            System.out.print("Please input a number: ");
            int userInput = in.nextInt();

            System.out.println("What would you like to do with this number: ");
            System.out.println("0) Get the additive inverse of the number\n" +
                    "1) Get the reciprocal of the number\n" +
                    "2) Square the number\n" +
                    "3) Cube the number\n" +
                    "4) Exit the program \n");
            choice = in.nextInt();

            switch (choice){
                case 0:
                    System.out.println("The additive inverse of " +userInput+ " is -" +userInput);
                    break;
                case 1:
                    System.out.println("The reciprocal of " +userInput+ " is 1/" +userInput);
                    break;
                case 2:
                    System.out.println("The square of " +userInput+ " is " +(userInput*userInput));
                    break;
                case 3:
                    System.out.println("The cube of " +userInput+ " is " +(userInput*userInput*userInput));
                    break;
                case 4:
                    System.out.println("Thank you, goodbye!");
                    break;
                default:
                    System.out.println("Invalid input, please try again! ");
            }
        }while(choice!=4);
    }
}
