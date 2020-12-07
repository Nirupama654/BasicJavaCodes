package LabAssignments.Assignment11_StringMethods;
import java.util.Scanner ;

public class SpaceRemoverInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String from which you want to remove the multiple spaces");
        String str = sc.nextLine();
        System.out.println("The Original String is : "+ str);
        System.out.println("The modified String is : ");
        System.out.println(str.replaceAll("\\s+"," ").trim());

    }
}
