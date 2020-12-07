package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int m,n;
        int sum = 0;
        int count = 0;
        System.out.println("Enter two positive integers such that m<n");
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();

        System.out.println("You entered two numbers "+m + " & "+ n);

        for (int i=m+1;i<n;i++){
            if((i%3 == 0) && (i%5 == 0)){
                count++;
                System.out.println(i);
                sum+= i;
            }
        }
        System.out.println("There are "+count+ " numbers which are divisible by 3 & 5 & their total sum is: "+ sum );
    }
}
