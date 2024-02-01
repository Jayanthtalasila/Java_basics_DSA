import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

//        System.out.println("enter the operator ");
//        char op = in.next().trim().charAt(0);

//        System.out.println("enter two numbers");
//        int a = in.nextInt();
//        int b = in.nextInt();

        while (true) {

            System.out.println("enter the operator ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*') {


                System.out.println("enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("Division by zero is not allowed");
                        break;
                    }
                } else if (op == '*') {
                    ans = a * b;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Operation invalid");
                break;
            }
            System.out.println(ans);
        }

    }
}
