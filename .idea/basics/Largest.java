
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first numbeer = ");
        System.out.println("enter the second numnber = ");

        Float n1= in.nextFloat();
        Float n2= in.nextFloat();

//        if (n1>n2)
//            System.out.println(n1);
//        else
//            System.out.println(n2);

        Float largest = Math.max(n1, n2);
        System.out.println(largest);
    }
}
