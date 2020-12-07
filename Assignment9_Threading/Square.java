package LabAssignments.Assignment9_Threading;
import java.util.Scanner ;
public class Square extends Thread {
    int num ;
    double num_Square;
    public Square(int num){
        this.num = num ;
    }
    public void  run(){
        num_Square = Math.pow(num ,2);
        System.out.println("Square of the number(Child Thread) : " + num_Square);
    }
}
 class Sum extends Thread {
    int num ,  sum ;
    public Sum(int num){
        this.num = num ;
    }
    public void run(){
        int  sum = 0;
        int square = (int)Math.pow(num,2) ;

        while( square != 0){
            int digit = square % 10 ;
            sum = sum+digit;
            square = square/10 ;
        }
        System.out.println("(Main Thread) Sum of the digits of the square : "+sum);
    }
}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose square you want to find");
        int num = sc.nextInt();
        Square s = new Square(num);
        s.start();
        Sum s1 = new Sum(num);
        s1.start();
    }
}
