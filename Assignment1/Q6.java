package LabAssignments.Assignment1;
import java.util.Scanner;


public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two numbers whose gcd you want to find");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int i;

        if(num1<num2){
            for ( i = num1; i>0 ;i--){
                if((num1%i == 0) && (num2%i == 0)){
                    break;
                }
            }
            System.out.println("The gcd of "+ num1+ " & "+ num2 +  " is: "+ i);
        }
        else{
            for ( i = num2; i>0 ;i--){
                if((num1%i == 0) && (num2%i == 0)){
                    break;
                }
            }
            System.out.println("The gcd of"+ num1+ "&"+ num2 +  "is:"+ i);
        }


    }
}
