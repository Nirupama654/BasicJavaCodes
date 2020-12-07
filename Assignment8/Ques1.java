package LabAssignments.Assignment8;
import java.util.Scanner;

public class Ques1 {
    public  void validate(int a , int b){

        if( (a-b) == 0){
            throw new ArithmeticException("Denominator is zero! Can't divide by zero !!!!");
        }
        else{
            System.out.println(a/(a-b));
        }
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("enter the values of a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Ques1 q = new Ques1();
        try{
            q.validate(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Enter proper Values");
        }

    }
}
