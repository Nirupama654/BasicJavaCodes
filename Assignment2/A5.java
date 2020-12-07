package LabAssignments.Assignment2;
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string whose reverse you want to find");
        String str = scan.nextLine();
        char[] CharArray = str.toCharArray();
        int n = CharArray.length;
        int i,j;
        char temp;
        for(i = 0 , j = n-1 ; i< n/2 ; i++ , j--){
            temp = CharArray[i];
            CharArray[i] = CharArray[j];
            CharArray[j] = temp;
        }

        String rev = String.valueOf(CharArray);
        System.out.println("The reversed string is : "+ rev);

    }
}
