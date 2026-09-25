package Basics;
import java.util.Scanner;

public class TakingInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");

        int x = sc.nextInt();
        x = x +5;
        System.out.println(x);
    }
}
