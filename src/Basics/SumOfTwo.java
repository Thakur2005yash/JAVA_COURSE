package Basics;
import java.util.Scanner;

public class SumOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int z = sc.nextInt();

        System.out.print("Sum of All Number: ");
        System.out.println(x+y+z);
    }
}
