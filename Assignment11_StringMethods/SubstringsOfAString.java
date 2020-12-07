package LabAssignments.Assignment11_StringMethods;
import java.util.Scanner;

public class SubstringsOfAString {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String whose substring u want to find");
            String str = sc.nextLine();
            System.out.println("All substring of" + str + " are:");
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j <= str.length(); j++) {
                    System.out.println(str.substring(i,j));

                }
            }
        }
    }


