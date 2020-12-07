package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int count = 0 , i = 1, sqn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  how  many  square  numbers  you want  to  print ");
        int  n =  sc.nextInt();
        while(count < n)
        {
            System.out.println(sqn);
            count++;
            sqn+= i ;
            i+=2;
        }
    }
}

