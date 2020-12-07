package LabAssignments.FinalAssignment;

public class ReverseString {
    public static void main(String[] args) {

        String[] days = {"Monday" , "Tuesday", "Wednesday",  "Thursday", "Friday","Saturday" , "Sunday"};

        String[] Rev_days = new String[7] ;
        int i = 0 ;
        for(int index = (days.length)-1 ; index >= 0  ; index--){
            Rev_days[i++] = days[index] ;
        }
        System.out.println("The Reversed array of the previous string is  : " );
        for(int index = 0 ; index < Rev_days.length ; index++){
            System.out.print(Rev_days[index] + " ");
        }

    }
}
