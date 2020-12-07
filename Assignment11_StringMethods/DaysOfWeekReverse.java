package LabAssignments.Assignment11_StringMethods;

import java.util.Objects;

public class DaysOfWeekReverse {



    // Driver code
    public static void main(String[] args)
    {
        String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        int length = str.length();
        String RevStr = new String();



        int i = 0;
        while(i<length){
            String temp = new String();
            while(i<length && Objects.equals(str.charAt(i), ' ') == false){
                temp = temp +  str.charAt(i) ;
                i++;
            }
//            System.out.println(temp+"\n");
            RevStr = temp + " " + RevStr ;
            i++;
        }

        System.out.println("The String after Modification is : " + RevStr);

    }
}
