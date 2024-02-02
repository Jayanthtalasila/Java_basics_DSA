import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Long.sum;

public class Methods {

    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
        static int sum() {
            Scanner in = new Scanner(System.in);
            System.out.print("enter num1 =");
            int a = in.nextInt();
            System.out.println("enter num2 = ");
            int b = in.nextInt();
            int c = a + b;
            return c;
        }
    }
