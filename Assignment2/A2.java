package LabAssignments.Assignment2;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to calculate");
        int n = sc.nextInt();
        long fact;
        int i;
        fact =1;
        for(i = 1; i<=n ; i++)
        {
            fact = fact*i;
        }
        System.out.println("The factorial of "+ n + " is "+ fact);
    }
}
