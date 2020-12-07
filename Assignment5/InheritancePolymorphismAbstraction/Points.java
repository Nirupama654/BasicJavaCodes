package LabAssignments.Assignment5.InheritancePolymorphismAbstraction;
import java.util.Scanner;

class Point2D{
    private int x = 0 ;
    private int y = 0 ;
    String str ;

    Point2D(){

    }
    Point2D(int x , int y){
    this.x = x ;
    this.y = y ;
    }
    public int getX(){
        return x ;
    }
    public void setX(int x){
        this.x = x ;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
       this.y = y ;
    }

    public String ToString(){
        str = "The 2D point is  ("+x+","+ y +")";
       return str ;
    }

    public void display(){
        System.out.println("x = " + getX());
        System.out.println("y = " + getY());
        System.out.println(ToString());
    }
}
class Point3D extends Point2D{
    int x = getX();
    int y = getY();
    private int z = 0;
    Point3D(){

    }

    Point3D(int x , int y , int z){
        // assigning values to the instance variable of the current class
        this.x = x ;
       // System.out.println(this.x);
        this.y = y;
        this.z = z;
    }

    public int getZ(){
        return z;
    }
    public void setZ(int z){
      this.z = z ;
    }
    public String ToString(){
        str = "The 3D point is  ("+x+","+y+","+z+")";
        return str ;
    }
    public void display(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println(ToString());
    }

}

public class Points {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        System.out.println("enter the value of z");
        int z = sc.nextInt();
        Point2D p1  =new Point2D(x ,y);
        p1.setX(x);
        p1.setY(y);
        p1.display();
        Point3D p2 = new Point3D(x,y,z);
        p2.setZ(z);
        p2.display();
    }
}
