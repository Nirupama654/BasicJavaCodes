package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int factors = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number(should be a natural number) whom you want to check whether it is a prime or composite?");
        int num = scan.nextInt();


        for(int i = 1;i<=num;i++){
            if(num%i==0){
                factors++;
            }
        }
        if(num == 1){
            System.out.println("1 is a unique number");
        }
        else if(factors>2){
            System.out.println(num+" is a composite number");
        }
        else{
            System.out.println(num+ " is a prime number");
        }

    }
}
