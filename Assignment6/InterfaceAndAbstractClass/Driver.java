package LabAssignments.Assignment6.InterfaceAndAbstractClass;
import java.util.Scanner;

interface Calculator {
     double add(int a , int b) ;
     double sub(int a , int b) ;
     double mul(int a , int b) ;
     double div(int a , int b) ;

}
class DemoCalculator implements LabAssignments.Assignment6.InterfaceAndAbstractClass.Calculator {

      public double add(int a, int b){
        return a+b ;
    }
      public double sub(int a , int b){
        return a-b ;
    }
      public double mul(int a , int b){
        return a*b ;
    }
      public double div(int a , int b){
        return a/b ;
    }
}
public class Driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers upon which you want to perform the arithmetic Calculations");
        int a = sc.nextInt();
        int b = sc.nextInt();
        DemoCalculator d = new DemoCalculator();
        System.out.println(a+" + "+b+" = "+d.add(a,b));
        System.out.println(a+" - "+b+" = "+d.sub(a,b));
        System.out.println(a+" * "+b+" = "+d.mul(a,b));
        System.out.println(a+" / "+b+" = "+d.div(a,b));
    }
}


