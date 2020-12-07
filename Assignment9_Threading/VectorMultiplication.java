package LabAssignments.Assignment9_Threading;
import java.util.Scanner ;

class EvenPos extends Thread{
    int[] arr1 ;
    int[] arr2 ;
    int[] arr;
    public EvenPos(int[] arr1 , int[] arr2 , int[] arr){
        this.arr1 = arr1 ;
        this.arr2 = arr2 ;
        this.arr = arr ;
    }

    public void run(){
        for(int i = 0 ; i < arr1.length ; i += 2){
            arr[i] = arr1[i] * arr2[i];
        }
    }
}

class OddPos extends Thread{
    int[] arr1 ;
    int[] arr2 ;
    int[] arr ;
    public OddPos(int[] arr1 , int[] arr2 , int[] arr){
        this.arr1 = arr1 ;
        this.arr2 = arr2 ;
        this.arr = arr ;
    }

    public void run(){
        for(int i = 1 ; i < arr1.length ; i+=2){
            arr[i] = arr1[i] * arr2[i];
        }
    }
}


public class VectorMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of The array ");
        int size= sc.nextInt();

        int[] arr = new int[size];

        int[] arr1 = new int[size];

        System.out.println("Enter the elements of First Array");
        for(int i =0 ; i < size; i++){
            arr1[i] = sc.nextInt() ;
        }
        int[] arr2 = new int[size];
        System.out.println("Enter the elements of Second Array");
        for(int i =0 ; i < size; i++){
            arr2[i] = sc.nextInt() ;
        }

        EvenPos e = new EvenPos(arr1 , arr2 , arr);
        e.start();
        OddPos o = new OddPos(arr1 , arr2 ,arr);
        o.start() ;

        System.out.println("Multiplication Of the Two Vectors are");
        for(int i = 0 ; i< size ; i++){
            System.out.print(" " +arr[i]+ " ");
        }
    }
}
