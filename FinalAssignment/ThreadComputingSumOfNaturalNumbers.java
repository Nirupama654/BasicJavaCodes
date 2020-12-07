package LabAssignments.FinalAssignment;
import java.util.Scanner;

public class ThreadComputingSumOfNaturalNumbers extends Thread {
    public static  int m , sum = 0;
    Scanner scan = new Scanner(System.in);
   public void run(){
       synchronized (this){
               System.out.println("Enter the value of n");
               int n = scan.nextInt();
               sum += n ;
       }
   }
}

class ThreadTest{
    public static void main(String[] args) {

        ThreadComputingSumOfNaturalNumbers nu = new ThreadComputingSumOfNaturalNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m( No.0f Threads)");
        nu.m = sc.nextInt();
        ThreadComputingSumOfNaturalNumbers[] th = new ThreadComputingSumOfNaturalNumbers[nu.m];
        for(int i = 0 ; i < nu.m ; i++){
            th[i] = new ThreadComputingSumOfNaturalNumbers();
            th[i].start();
            try {
                th[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of the n natural numbers is : " + nu.sum);
    }
}

