package LabAssignments.Assignment2;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string whom you want to check whether it is a palindrome or not");
        String str = scan.nextLine();
        char[] CharArray = str.toCharArray();
        int n = CharArray.length;
        int flag = 0;
        int i , j ;
        for(i = 0, j = n-1; i < (n/2) ; i++,j--)
        {
           if(CharArray[i] != CharArray[j]){
               flag = -1;
               break;
        }
        }

        if(flag == -1){
            System.out.println("string is not palindrome");
        }
        else{
            System.out.println("String is palindrome");
        }
    }
}
