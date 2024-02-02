package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the value =");
        int n = in.nextInt();

        int fact = factorial(n);
        System.out.println("the factorial of" + n + "is " + fact);



    }

    static int factorial(int n) {
        int c = 1;
        for(int i=1; i<=n; i++){
            c = c * i;
        }
        return c;
    }
}
