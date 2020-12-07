package LabAssignments.Assignment5.InheritancePolymorphismAbstraction;
import java.util.Scanner ;

class Shape{
    Scanner sc = new Scanner(System.in);
    private String color  = "red" ;
    private boolean filled = true ;

    public Shape(){
        color = "green";
        filled = true ;
    }
    public Shape(String color , boolean filled){
        this.color = color ;
        this.filled = filled ;
    }
    public String getColor(){
        System.out.println("Enter the color");
        sc.nextLine() ;
        color = sc.nextLine();
        return color ;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        System.out.println("Filled Or Not ??  (Ans either true/false)");
        filled = sc.nextBoolean() ;
        return  filled ;
    }
    public void setFilled(boolean filled){
        this.filled = filled ;
    }
    public String ToString(){
        String s = "" ;
        if(!filled){
           s = "Not" ;
        }
        return "A Shape with color of "+ color + "and " + s +"Filled";
    }
}
class circle extends Shape{
    Scanner scan = new Scanner(System.in);
    private double radius  ;
    public circle(){

    }
    public circle( double radius ){
        radius = 1.0 ;
    }
    public circle(double radius , String color , boolean filled){
        this.radius = radius ;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getRadius(){
        System.out.println("Enter the value of Radius");
        radius  = sc.nextDouble();
        return radius ;
    }
    public void setRadius(double radius){
        this.radius = radius ;
    }
    public double getArea(){
        return (3.14 * Math.pow(radius ,2));
    }
    public double getPerimeter(){
        return (2 * 3.14 * radius);
    }
    public String ToString(){
        return "A circle with radius = " + radius + "which is a subclass of " + super.toString() ;
    }
}
class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    private double width  ;
    private double length ;
    public Rectangle(){
        width = 1.0 ;
        length = 1.0;
    }
    public Rectangle(double width , double length){
        this.length = length ;
        this.width = width ;
    }
    public Rectangle(double width , double length , String color , boolean filled){
        this.width = width ;
        this.length = length ;
        super.setColor(color);
        super.setFilled(filled);

    }
    public double getWidth(){
        System.out.println("Enter the width");
        width = sc.nextDouble() ;
        return  width ;
    }
    public void setWidth(double width){
        this.width = width ;
    }
    public double getLength(){
        System.out.println("Enter the length");
        length = sc.nextDouble();
        return length ;
    }
    public void setLength( double length){
        this.length = length  ;
    }
    public double getArea(){
        return (length * width) ;
    }
    public double getPerimeter(){
        return (2*(length + width)) ;
    }
    public String ToString(){
        return "A rectangle with width = "+ width + "and length = "+  length + "which is a subclass of " + super.ToString() ;
    }
    void display(){
        System.out.println("Length = " + length + "Width = " + width + "color = " + getColor() + "Area = " + getArea() + "Perimeter = " + getPerimeter() );
    }
}
class Square extends Rectangle{
     double side ;
    public Square(){

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side , String color , boolean filled ){
        this.side = side ;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide(){
        System.out.println("Enter the side of Square");
        side = sc.nextDouble() ;
        return side ;
    }
    public void setSide(double side){
        this.side = side ;
    }
    public void setWidth(double side){
        this.side = super.getWidth() ;

    }
    public void setLength(double side){
        this.side = super.getLength() ;
    }
    public String ToString(){
        return "A square with side = "+ side + "which is a subclass of  " + super.ToString() ;
    }

}

public class ShapeAndSize {
    public static void main(String[] args) {
        Shape s = new Shape() ;
        circle c = new circle();
        circle c1 = new circle(c.getRadius());
        circle c2 = new circle(c.getRadius(), c.getColor(), c.isFilled()) ;

        c.ToString() ;
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(r.getWidth(), r.getLength()) ;
        Rectangle r2 = new Rectangle(r.getWidth() , r.getLength() , r.getColor() , r.isFilled()) ;
        r.ToString() ;
        Square sq  = new Square( );
        Square sq1 = new Square(sq.getSide());
        Square sq2 = new Square(sq.getSide() , sq.getColor() , sq.isFilled());
        sq.ToString() ;
    }
}
