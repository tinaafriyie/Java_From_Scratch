import java.util.Scanner;

public class MadLipsGame {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        //0178 for superscript of 2

        String adjective1;
        String noun1;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an adjective(descriptive): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(an animal or a person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective(descriptive): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter one more adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday,I went to a " + adjective1 + " zoo. ");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}