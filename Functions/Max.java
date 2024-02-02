package Functions;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter r values = ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int largest = MaxMin( a,  b,  c);
        System.out.println(" largest number is " + largest);

        int smallest = Min(a, b , c);
        System.out.println(" smallest number is " + smallest);
    }

    static int Min(int a, int b, int c) {
        int small = a;
        if( b < a ) {
            small = b;
        }
        if ( c < small ){
            small = c;
        }

        return small;

    }

    static int MaxMin(int a, int b, int c) {
        int lrg = a;
        if(b>a) {
            lrg = b;
        }
        if (c > lrg) {
            lrg = c;
        }
        return lrg;
        }

    }

