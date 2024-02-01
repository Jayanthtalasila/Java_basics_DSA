
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("enter the name = ");

        String greet = Name.next();
        System.out.println(" Greetings, " +  greet);
        System.out.println("hope your doing a great job ");
    }
}
