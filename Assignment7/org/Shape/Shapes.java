package LabAssignments.Assignment7.org.Shape;
import java.util.Scanner ;

class Square{

  public double area(double side){
      return (side*side) ;
  }

  public double perimeter(double side){
      return 4*side ;
  }
}
class Triangle{

    public double area(double  side1 ,double side2 , double side3){
        double s ,area;
        s = (side1 + side2 + side3)/2 ;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area ;
    }

    public double perimeter(double  side1 ,double side2 , double side3){
        return  side1+side2+side3 ;
    }
}
class Circle{

    public double area(double radius){
         return 3.14*Math.pow(radius ,2);
    }

    public double perimeter(double radius){
        return (2* 3.14 * radius) ;
    }
}
class Rectangle{

    public double area(double length , double width){
        return length*width ;
    }

    public double perimeter(double length , double width){
        return 2*(length + width);
    }
}

class Shapes{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option ;

        Square s = new Square() ;
        Triangle t = new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        while(true){
            System.out.println("Enter the corresponding options to find Area & Perimeter of Respective Shapes");
            System.out.println("1.Square");
            System.out.println("2.Triangle");
            System.out.println("3.Circle");
            System.out.println("4.Rectangle");
            System.out.println("Exit");

            option = sc.nextInt();

            switch (option){
                case 1 ->{
                    System.out.println("Enter the side of Square");
                    double side = sc.nextDouble();
                    System.out.println(s.area(side));
                    System.out.println( s.perimeter(side));
                }
                case 2->{
                    System.out.println("Enter the side1");
                    double side1 = sc.nextDouble();
                    System.out.println("Enter the side2");
                    double side2 = sc.nextDouble();
                    System.out.println("Enter the side3");
                    double side3 = sc.nextDouble();

                    System.out.println(t.area(side1, side2 ,side3));
                    System.out.println( t.perimeter(side1, side2 ,side3));
                }
                case 3 ->{
                    System.out.println("Enter the radius of the Circle");
                    double radius = sc.nextDouble();
                    System.out.println(c.area(radius));
                    System.out.println(c.perimeter(radius));
                }
                case 4->{
                    System.out.println("Enter the length of the Rectangle");
                    double length = sc.nextDouble() ;
                    double width = sc.nextDouble();
                    System.out.println(r.area(length, width));
                    System.out.println(r.perimeter(length ,width));
                }
                case 5 ->  System.exit(0);

                default -> System.out.println("Not a Valid response!!!");
            }


        }

    }
}