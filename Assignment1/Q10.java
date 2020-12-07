package LabAssignments.Assignment1;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight ? \n If you are entering in pounds press \"1\" \n If you are entering in kilograms press \"2\" ");
        int n1 = scan.nextInt();
        System.out.println("Enter your body mass");
        double mass = scan.nextDouble();

        System.out.println("What is your height ? \n If you are entering in inches press \"1\" \n If you are entering in metre press \"2\" ");
        int n2 = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();

        if(n1 == 1){
            mass = 0.454*mass;
        }
        if(n2 == 1){
            height = 0.0254*height;
        }
        double BMI = mass/(java.lang.Math.pow(height,2));

        System.out.println("Your Body Mass Index is: "+ BMI);
        if(BMI < 20){
            System.out.println("You are underweight!!");
        }
        else if(BMI <= 25){
            System.out.println("You are healthy!!");
        }
        else{
            System.out.println("You are Overweight");
        }



    }
}
