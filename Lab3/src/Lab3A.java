import java.util.Scanner;

public class Lab3A {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is the current balance on your edit card (Amount owed): $");
        float amountOwed = in.nextFloat();
        System.out.print("What is the Annual Percentage Rate(APR): ");
        float apr = in.nextFloat();

        float aprPer = apr/100;
        float monthlyRate = apr/12;
        float minPay = amountOwed*aprPer/12;

        System.out.printf("Monthly Percentage Rate: %.3f %n", monthlyRate);
        System.out.printf("Minimum Payment: %.2f %n", minPay);
    }
}
