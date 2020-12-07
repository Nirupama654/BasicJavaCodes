package LabAssignments.Assignment6.InterfaceAndAbstractClass;
import java.util.Scanner ;

 interface Calculator1 {
    public double add(int a , int b) ;
    public double sub(int a , int b) ;
    public double mul(int a , int b) ;
    public double div(int a , int b) ;

}

 interface ScientificCalculator extends Calculator {
     public double RaisedToPower(int a , int b) ;
     public double Expo(int a ) ;
     public double NaturalLog(int a ) ;
     public double Log10(int a ) ;
     public double Sqrt(int a );
     public double SineOf(int x) ;
     public double arcSine(int x);
     public double CosOf(int x);
     public double arcCos(int x);

}
class Concrete implements LabAssignments.Assignment6.InterfaceAndAbstractClass.ScientificCalculator{

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

    public double RaisedToPower(int a , int b) {
        double x0;
        x0 = Math.pow(a,b);
        return x0 ;
    }
    public double Expo(int a) {
        double x1;
        x1 = Math.exp(a);
        return x1;
    }
    public double NaturalLog(int a ) {
        double x2 ;
        x2 = Math.log(a) ;
        return x2 ;
    }
    public double Log10(int a ) {
        double x3 ;
        x3 = Math.log10(a) ;
        return x3 ;
    }
    public double Sqrt(int a ){
        double x4 ;
        x4 = Math.sqrt(a);
        return x4 ;
    }
    public double SineOf(int x){
        double x5 ;
        x5 = Math.sin(x) ;
        return x5 ;
    }
    public double arcSine(int x){
        double x6 ;
        x6 = Math.asin(x) ;
        return x6 ;
    }
    public double CosOf(int x){
        double x7 ;
        x7 = Math.cos(x);
        return x7;
    }
    public double arcCos(int x){
        double x8 ;
        x8 = Math.acos(x) ;
        return x8 ;
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
        Concrete c = new Concrete();
        int a=0 ,b=0 ,x = 0;

        while(true){
            System.out.println("Enter the Options accordingly to perform the  Operations of Scientific Calculator:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Raised to the power of(base,power)");
            System.out.println("6. Exponent(e^x)");
            System.out.println("7. Natural Log");
            System.out.println("8. Log to the base 10");
            System.out.println("9. Square Root ");
            System.out.println("10. Sine Of");
            System.out.println("11. Sine Inverse Of");
            System.out.println("12. Cos of");
            System.out.println("13. Cosine Inverse of");
            System.out.println("14. Exit");
            int n = sc.nextInt();

            switch (n) {
                case 1 -> {
                    System.out.println("Enter the two numbers which you want to add");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a + " + " + b + " = " + c.add(a, b));
                }
                case 2 ->{
                    System.out.println("Enter the two numbers which you want to Subtract");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" - "+b+" = "+c.sub(a,b));
                }
                case 3 ->{
                    System.out.println("Enter the two numbers which you want to Multiply");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" * "+b+" = "+c.mul(a,b));
                }
                case 4 ->{
                    System.out.println("Enter the two numbers which you want to Divide");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+" / "+b+" = "+c.div(a,b));
                }
                case 5 ->{
                    System.out.println("Enter the values of base & power");
                    a = OneInput(a);
                    b = OneInput(b);
                    System.out.println(a+"^"+b+" = " + c.RaisedToPower(a,b));
                }
                case 6 ->{
                    System.out.println("Enter the value of exponential power");
                    x = OneInput(x);
                    System.out.println("e ^ "+x+" = " + c.Expo(x));
                }
                case 7 ->{
                    System.out.println("Enter the number whose natural log you want to find");
                    x = OneInput(x);
                    System.out.println("log e("+x+") = " + c.NaturalLog(x));
                }
                case 8 ->{
                    System.out.println("Enter the number whose log you want to find");
                    x = OneInput(x);
                    System.out.println("log10("+x +") = " + c.Log10(x));
                }
                case 9 ->{
                    System.out.println("Enter the number whose Square Root you want to find");
                    x = OneInput(x);
                    System.out.println("Square root Of"+ x + " = "+ c.Sqrt(x));
                }
                case 10 ->{
                    System.out.println("Enter the value whose sine  you want to find");
                    x = OneInput(x);
                    System.out.println("sin("+x+") = " + c.SineOf(x));
                }
                case 11 ->{
                    System.out.println("Enter the value whose sine inverse you want to find");
                    x = OneInput(x);
                    System.out.println("arcSin("+x+") = " + c.arcSine(x));
                }
                case 12 ->{
                    System.out.println("Enter the value whose cosine you want to find ");
                    x = OneInput(x);
                    System.out.println("Cos("+x+") = " + c.CosOf(x));
                }
                case 13 ->{
                    System.out.println("Enter the value whose cosine inverse you want to find");
                    x = OneInput(x);
                    System.out.println("arcCos("+x+") = " + c.arcCos(x));
                }
                case 14 -> System.exit(0);
                default -> System.out.println("Not a valid Option!!");
            }
        }
    }
}
