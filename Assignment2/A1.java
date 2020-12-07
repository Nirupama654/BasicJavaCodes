package LabAssignments.Assignment2;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        // Basic Calculator Operations
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which operation do you want to perform ");
            System.out.println("Enter the respective numbers for desired operation");
            System.out.println("1. Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Modulo \n 6.exit");
            int n = sc.nextInt();

            double result;
            double x,y;

            switch(n)
            {

                case 1:
                    System.out.println("Enter the numbers which you want to operate");
                     x = sc.nextDouble();
                     y = sc.nextDouble();
                    result = x+y;
                    System.out.println( x + " + "+  y +" = "+ result );
                break;
                case 2:
                    System.out.println("Enter the numbers which you want to operate");
                     x = sc.nextDouble();
                     y = sc.nextDouble();
                    result = x-y;
                    System.out.println( x + " - "+  y +" = "+ result );
                break;
                case 3:
                    System.out.println("Enter the numbers which you want to operate");
                     x = sc.nextDouble();
                     y = sc.nextDouble();
                    result = x*y;
                    System.out.println(x + " * "+  y +" = "+ result  );
                break;
                case 4:
                    System.out.println("Enter the numbers which you want to operate");
                     x = sc.nextDouble();
                     y = sc.nextDouble();
                    result = x/y;
                    System.out.println(x + " / "+  y +" = "+ result  );
                break;
                case 5 :
                    System.out.println("Enter the numbers which you want to operate");
                     x = sc.nextDouble();
                     y = sc.nextDouble();
                    result = x%y;
                    System.out.println(x + " % "+  y +" = "+ result  );
                break;
                case 6: System.exit(0);
                break;
                default:
                    System.out.println("You have not entered a valid number");
            }
        }


    }
}
