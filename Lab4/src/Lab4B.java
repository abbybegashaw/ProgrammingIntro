import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String userInput = in.nextLine();

        if(userInput.equalsIgnoreCase("monday") || userInput.equalsIgnoreCase("wednesday")){
            System.out.println("I have class today!");
        }
        else if(userInput.equalsIgnoreCase("tuesday") || userInput.equalsIgnoreCase("thursday")){
            System.out.println("I should use this time to do my homework.");
        }
        else if(userInput.equalsIgnoreCase("friday")){
            System.out.println("It’s Friday! Friday! Gotta get down on Friday!");
        }
    }
}
