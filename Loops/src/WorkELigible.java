import java.util.Scanner;

public class WorkELigible {

    public static void main(String[] args) {

        int EligibleAge;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the Age of the persone: ");
        EligibleAge = scanner.nextInt();

        if(EligibleAge >= 16) {
            System.out.println("The Person is eligible to be hired");
        } else {
            System.out.println("The person is too young to be hired");
        }
    }
}