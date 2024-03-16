import java.util.Scanner;

public class Lab2A {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name1 = in.nextLine();
        System.out.print("Enter another name: ");
        String name2 = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        System.out.print("Once upon a time, there was a person named " +name1+
                " who had a child named " +name2+ ". This child would " +verb+
                " " +adverb+ " while singing to strangers.");
    }
}
