package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {


        System.out.println("Enter any number between 0 to 9");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = new String("Number");

        switch(n)
        {
            case 0: str = "Zero";
            break;
            case 1: str = "One";
            break;
            case 2: str = "Two";
            break;
            case 3: str = "Three";
            break;
            case 4: str = "Four";
            break;
            case 5: str = "Five";
            break;
            case 6: str = "Six";
            break;
            case 7: str = "Seven";
            break;
            case 8: str = "Eight";
            break;
            case 9: str = "Nine";
            break;
        }

        if (n == 0 || n == 1){
            System.out.println( str +" green bottle standing on the wall");
        }
        else{
            System.out.println( str +" green bottles standing on the wall");
        }
    }
}
