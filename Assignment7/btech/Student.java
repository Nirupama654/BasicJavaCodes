package LabAssignments.Assignment7.btech;
import java.util.Scanner ;

public  class Student {
    int roll;
    String Name ;
    double sub1 ,sub2 , sub3 ;

     Student(int roll , String Name , double sub1 , double sub2 , double sub3 ){
        this.roll = roll ;
        this.Name = Name ;
        this.sub1 = sub1 ;
        this.sub2 = sub2 ;
        this.sub3 = sub3 ;
    }
    public void display(){
        System.out.println("Name : " + Name);
        System.out.println("Roll No. : " + roll);
        System.out.println("Sub1 : " + sub1);
        System.out.println("Sub2 : " + sub2);
        System.out.println("Sub3 : " + sub3);
    }

}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No. of Student");
        int roll = sc.nextInt();
        sc.nextLine() ;
        System.out.println("Enter the Name of Student");
        String Name = sc.nextLine();
        System.out.println("Enter the Marks of Students in Subject 1");
        double sub1 = sc.nextDouble();
        System.out.println("Enter the Marks of Students in Subject 2");
        double sub2 = sc.nextDouble();
        System.out.println("Enter the Marks of Students in Subject 3");
        double sub3 = sc.nextDouble();

        Student s1 = new Student(roll , Name , sub1 , sub2 , sub3);
        s1.display();

        double Total = sub1 + sub2 + sub3 ;
        double avg = Total/3.0 ;
        System.out.println("Total Marks Obtained by the Student : " + Total);
        System.out.println("Average Marks : " + avg);

    }
}
