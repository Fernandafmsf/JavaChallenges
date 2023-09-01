package Introduction;

import java.util.Scanner;
//Java If-Else
public class ex02 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N>=1 && N<=100){
            if(N%2!=0){
                System.out.println("Weird");
            } else if(N%2==0 && 2<=N&& N<=5){
                System.out.println("Not Weird");
            } else if(N%2==0 && N<=20){
                System.out.println("Weird");
            } else if(N%2==0 && N>20){
                System.out.println("Not Weird");
            }
        }

        sc.close();
    }
}
