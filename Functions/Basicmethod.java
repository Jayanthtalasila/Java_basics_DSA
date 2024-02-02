import java.util.Scanner;

public class Basicmethod {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1 =");
        int a = in.nextInt();
        System.out.println("enter num2 = ");
        int b = in.nextInt();
        int c = a + b;
        System.out.println(" the sum is " + c );
    }
}
