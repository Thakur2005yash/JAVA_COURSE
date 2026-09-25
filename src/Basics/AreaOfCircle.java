package Basics;
import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        // Area is (pi * r * r)
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        double a = 3.14 * r * r;
        System.out.println(a);

    }
}
