package LabAssignments.Assignment2;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms up to which you want to print the fibonacci series");
        int n = sc.nextInt();
        int first = 0, second = 1  , third ;
        System.out.print(first + "\t");
        System.out.print(second + "\t");

        int i;
        for(i = 1; i <= n-2 ; i++){
            third = first+second;
            first = second;
            second = third;
            System.out.print(third + "\t");
        }


    }
}
