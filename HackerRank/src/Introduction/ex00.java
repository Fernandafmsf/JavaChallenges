package Introduction;
//In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.

import java.util.Scanner;
//Java Stdin and Stdout I
public class ex00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
