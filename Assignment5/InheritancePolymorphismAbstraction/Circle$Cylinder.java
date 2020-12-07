package LabAssignments.Assignment5.InheritancePolymorphismAbstraction;
import java.util.Scanner;
 class Circle extends Point2D{
     private double radius = 1.0 ;
     private String color = "red";
     int x = getX();
     int y = getY();
     double area ;
     public Circle(){

     }
     public Circle(int x, int y, double radius , String color){
         this.x = x ;
         this.y = y ;
         this.radius = radius ;
         this.color = color ;
     }
     double getRadius(){
      return radius ;
     }

     void setRadius(double radius){
         this.radius = radius ;
     }
     String getColor(){
         return color ;
     }
     void setColor(String color){
         this.color = color ;
     }
     double getArea(){
         area = 3.14 * Math.pow(radius,2);
         return area ;
     }
     public String ToString(){
         str = "Circle [ Center = (" +x+"," + y+") , radius ="+ radius+ " ,color = "+color+"]";
         return str ;
     }
     public void display(){

         System.out.println(ToString());
     }
 }
 class Cylinder extends Circle{
     private double height = 1.0 ;
     double radius = getRadius();
     String color = getColor();
     double volume ;
     Cylinder(){

     }

     Cylinder(int x, int y , double radius, String color , double height){
         this.x = x ;
         this.y = y ;
         this.radius = radius ;
         this.color = color ;
         this.height = height;
     }
     double getHeight(){
         return height ;
     }
     void setHeight(double height){
         this.height = height ;
     }
     double getVolume(){
         this.volume = 3.14*Math.pow(this.radius,2)*this.height;
         System.out.println(volume);
         return volume ;
     }
     public String ToString(){
          str = "Cylinder Base is a Circle[Center = ("+x+","+y+"), radius = " +radius + ","+ " color =" + this.color+"] Cylinder height = " + height+ " Volume = "+ volume ;
         return str ;
     }
     public void display(){
         System.out.println(ToString());
     }
 }


public class Circle$Cylinder {
    public static void main(String[] args) {

        int x,y ;
        double height ;
        double radius ;
        String color ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of center x ");
        x = sc.nextInt();
        System.out.println("Enter the value of y");
        y = sc.nextInt();
        System.out.println("Enter the radius");
        radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder");
        height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the color");
        color = sc.nextLine();
        Circle c1 = new Circle(x , y , radius, color);
        c1.setColor(color);
        c1.setRadius(radius);
        c1.display();
        Cylinder c2 = new Cylinder();
        c2.setHeight(height);
        c2.getVolume();
        c2.display();
    }
}
