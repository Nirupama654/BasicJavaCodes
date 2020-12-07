package LabAssignments.Assignment7.btech.arithmetic;
import  java.util.Scanner ;

public class MyMath {
    public  double add(int a , int b){
        return a+b ;
    }
    public  double sub(int a , int b){
        return a-b ;
    }
    public double mul(int a , int b){
        return a*b ;
    }
    public double div(int a , int b){
        return (double)a/b ;
    }
    public double modulo(int a , int b){
        return (a%b) ;
    }
}

class Test{
    private static Scanner sc;
    static int   OneInput(int x){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath m1 = new MyMath();
        int a=0 ,b=0 ,x = 0;

        while(true){
            System.out.println("Enter the Options accordingly to perform the  Operations of Calculator:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");

            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println("Enter the two numbers which you want to add");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a + " + " + b + " = " + m1.add(a, b));
                }
                case 2 ->{
                    System.out.println("Enter the two numbers which you want to Subtract");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" - "+b+" = "+m1.sub(a,b));
                }
                case 3 ->{
                    System.out.println("Enter the two numbers which you want to Multiply");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" * "+b+" = "+m1.mul(a,b));
                }
                case 4 ->{
                    System.out.println("Enter the two numbers which you want to Divide");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" / "+b+" = "+m1.div(a,b));
                }
                case 5 ->{
                    System.out.println("Enter the two numbers which you want to Divide");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" / "+b+" = "+m1.modulo(a,b));
                }
                case 6 -> System.exit(0);
                default -> System.out.println("Not a valid Option!!");
            }
        }
    }
}

