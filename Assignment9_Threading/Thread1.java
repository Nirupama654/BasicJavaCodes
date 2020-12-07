package LabAssignments.Assignment9_Threading;
import java.util.Scanner;

public class Thread1 extends Thread{
    int m,n ;
    public Thread1(int m,int n){
        this.m = m ;
        this.n = n ;
    }
    public void run() {
        int i ;
        if(m%2 == 0){
            i = m ;
        }
        else{
            i = m+1 ;
        }
        for( ; i<=n ; i+=2){
            System.out.println("Child : "+ i );
        }
    }
}



class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower & upper limit");
        int m = sc.nextInt();
        int n = sc.nextInt();
        Thread1 t = new Thread1(m,n);
        t.start();
        int i ;
        if(m%2 != 0){
            i = m;
        }
        else{
            i = m+1 ;
        }
        for( ; i <= n ; i+=2 ){
            System.out.println("Parent : "+ i);
        }

    }
}

