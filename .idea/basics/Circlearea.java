import java.util.Scanner;

public class Circlearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float p = 3.14f;

        System.out.println("enter the value of radius ");
        float r = in.nextFloat();

        if (r>0) {
            r = r*r;
        }

        System.out.println("the area of circle = " + (p * r) );


    }
}


