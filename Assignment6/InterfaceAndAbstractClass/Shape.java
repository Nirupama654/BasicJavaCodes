package LabAssignments.Assignment6.InterfaceAndAbstractClass;
import java.util.Scanner ;

public class Shape {
    void draw( ){
        System.out.println("Drawing Shape...");
    }
    void erase(){
        System.out.println("Erasing Shape...");
    }
}
class Circle extends Shape{
    void draw( ){
        System.out.println("Drawing Circle...");
    }
    void erase(){
        System.out.println("Erasing Circle...");
    }
}
class Triangle1 extends Shape{
    void draw( ){
        System.out.println("Drawing Triangle...");
    }
    void erase(){
        System.out.println("Erasing  Triangle...");
    }
}
class Square extends Shape{
    void draw( ){
        System.out.println("Drawing Square...");
    }
    void erase(){
        System.out.println("Erasing Square...");
    }
}
class DrawAndErase{
    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle1 t = new Triangle1();
        Square s = new Square();

        Scanner sc = new Scanner(System.in) ;
        while(true){
            System.out.println("Enter the options accordingly");
            System.out.println("1 for drawing Circle");
            System.out.println("2 for drawing Triangle");
            System.out.println("3 for drawing square");
            System.out.println("Exit");
            int n = sc.nextInt();

            switch(n){
                case 1 ->{
                    c.draw();
                    c.erase();
                }
                case 2 ->{
                    t.draw();
                    t.erase();
                }
                case 3 ->{
                    s.draw();
                    s.erase();
                }
                case 4 ->{
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option!!!");
            }
        }

    }
}
