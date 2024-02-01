import java.util.Scanner;

public class Occur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        int count= 0;

        while(n > 0) {
            long rem = n % 10;
            if(rem == 4) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
