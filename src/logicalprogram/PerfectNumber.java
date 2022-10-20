package logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i, Number, Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter The Number: ");
        Number = sc.nextInt();
        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum += i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d Is the Perfect Number", Number);
        } else {
            System.out.format("\n% d is Not A Perfect Number", Number);
        }
    }
}
