package LabAssignments.Assignment11_StringMethods;

import java.util.Scanner;

public class SortingAlphabetically {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Strings in the string array");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        String temp = null ;

        System.out.println("Enter the strings Of the array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("The array of String before sorting : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }

        System.out.println("The array of String after  sorting : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
