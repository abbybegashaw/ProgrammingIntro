import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        int q = in.nextInt();
        System.out.print("Enter the number of dimes: ");
        int d = in.nextInt();
        System.out.print("Enter the number of nickels: ");
        int n = in.nextInt();
        System.out.print("Enter the number of pennies: ");
        int p = in.nextInt();

        int total = q*25+d*10+n*5+p*1;
        int dollars = total/100;
        int cents = total%100;


        System.out.print("You entered " +q+ " quarters.\n" +
                "You entered " +d+ " dimes. \n" +
                "You entered " +n+ " nickels. \n" +
                "You entered " +p+ " pennies.\n\n");

        System.out.println("Your total is " +dollars+ " dollars and " +cents+ " cents.");
    }
}
