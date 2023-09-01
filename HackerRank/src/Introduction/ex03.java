package Introduction;

import java.util.Scanner;

//## Java Output Formatting
public class ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String x_value= Integer.toString(x);// changing int into string so i can verify the var characters quantity
            if(s1.length()<=10 && x_value.length()<=3){ //verifying quantity
                System.out.printf("%-15s%03d%n", s1 , x);

            }
        }
        System.out.println("================================");

    }

    //%-15s:
    // This is a format specifier for a string with a width of 15 characters and left-justified alignment.
    // The - flag indicates left alignment. If the string is shorter than 15 characters, it will be padded with spaces on the right.
    // If it's longer, it will not be truncated, and the next formatted value will start in the next available space.

    //%03d:
    // This is a format specifier for an integer with a width of 3 characters and leading zeros. The 0 flag indicates that leading zeros should be added. If the integer has fewer than 3 digits, leading zeros will be added to fill the remaining width.

    //%n: This is a platform-independent line separator. It inserts a newline character.

}

