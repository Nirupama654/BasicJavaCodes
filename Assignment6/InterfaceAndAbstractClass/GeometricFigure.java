package LabAssignments.Assignment6.InterfaceAndAbstractClass;
import java.util.Scanner ;

abstract public class GeometricFigure {
    double dim1 , dim2 ;
}
class Rectangle extends GeometricFigure{
    double getArea(double a , double b){
        dim1 = a ;
        dim2 = b ;
        double area;
        area = dim1 * dim2 ;
        return area ;
    }
}
class Triangle extends GeometricFigure{
    double getArea(double a , double b){
        dim1 = a ;
        dim2 = b ;
        double area;
        area = 0.5*(dim1 * dim2) ;
        return area ;
    }
}
class  Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        while(true){
            System.out.println("Enter the options accordingly");
            System.out.println("1 . Area of Rectangle \n 2. Area of Triangle \n 3. Exit");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch(n){
                case 1 ->{
                    System.out.println("Enter the length & breadth of Rectangle");
                    double length = sc.nextDouble();
                    double breadth = sc.nextDouble();
                    System.out.println("Area of Rectangle = " + r.getArea(length, breadth));
                }
                case 2 ->{
                    System.out.println("Enter the base & height of Triangle");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    System.out.println("Area of Rectangle = " + t.getArea(base, height));
                }
                case 3 ->{
                    System.exit(0);
                }
                default -> System.out.println("invalid Option !!!");
            }
        }
    }
}
