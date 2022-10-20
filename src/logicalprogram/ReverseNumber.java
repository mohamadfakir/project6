package logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse=0; int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        number= sc.nextInt();
        for (;number != 0; number = number /10){
            int remainder = number %10;
            reverse = reverse *10 +remainder;

        }
        System.out.println("The Reverse Number Is;"  +reverse);
    }
}
