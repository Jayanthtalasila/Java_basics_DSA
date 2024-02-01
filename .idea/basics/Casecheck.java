import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the letter = ");

        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("its a capital letter ");
        } else if ( ch >+ 'a' && ch <= 'z') {
            System.out.println("its a small letter ");
        } else {
            System.out.println(" its not a letter ");

    }
}
}
