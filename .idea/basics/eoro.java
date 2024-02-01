import java.util.Scanner;

public class eoro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number n= " );

        int n = in.nextInt();
        if (n%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }
}
