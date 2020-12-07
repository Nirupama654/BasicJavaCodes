package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        long fact ;
        double sum = 1;
        int i , j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of variable x");
        int x = sc.nextInt();
        System.out.println("Enter the no. of terms up to which you want to evaluate this term!");
        int n = sc.nextInt();
        System.out.println("Number of terms entered  = "+ n);

        for(i = 1 ; i<=n ; i++)
        {
            fact =1;
            for(j = 1; j<=i ; j++)
            {
                    fact = fact*j;
            }
            sum+= (java.lang.Math.pow(x,i))/fact;

        }

        System.out.println("The sum of the required series is : "+ sum);



    }
}
