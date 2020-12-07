package LabAssignments.InheritancePolymorphismAbstraction;
import java.util.Scanner;

class Person{
    private String name ;
    private String address;
    String str ;

    Person(){

    }
    Person(String name ,String address){
        this.name = name;
        this.address = address ;
    }
    String getName(){
        return name ;
    }
    String getAddress(){
        return address ;
    }
    void setAddress(String address){
        this.address  = address ;
    }
    String ToString(){
       str = name+"("+ address + ")";
        return str ;
    }

}
class Student extends Person{
    String name = super.getName();
    String address = super.getAddress();
    private int numCourses = 0 ;
    private String[] courses  ;
    private int[] grades ;
    static int gIndex = 0 ;
    static int cIndex = 0 ;


    Student(String name , String address){
        this.name  = name ;
        this.address = address ;
    }
    String ToString(){
        str = "Student : "+name+"("+ address + ")";
        return str ;
    }
    void setCourses(int num ){
        numCourses = num ;
    }
    void addCourseGrade(String course , int grade){
        courses[cIndex++] = course ;
        grades[gIndex++] = grade ;
    }

    void printGrades$printCourses(){
        int i ;
        System.out.format("%20s%10s\n","CourseName","Grade");
        for(i = 0 ; i < cIndex ; i++){
        System.out.format("%20s%10d\n",courses[i],grades[i]);
        }
    }
    double getAverageGrade(){
        double avg = 0 ;
        int i ;
        for(i = 0; i< cIndex ; i++){
            avg+=grades[i];
        }
        avg = avg/numCourses ;
        return avg ;
    }

}

class Teacher extends Person{
    private int numCourses = 0 ;
    private String[] courses ;
    static int cIndex = 0;

    String name = super.getName();
    String address = super.getAddress();

    Teacher(String name , String address){
        this.name  = name ;
        this.address = address ;
    }

    void setCourseNo(int num){
        this.numCourses  = num ;
    }
    void addCourseT(String course){
        courses[cIndex++] = course ;
    }
    String ToString(){
        str = "Teacher : "+name+"("+ address + ")";
        return str ;
    }

    boolean addCourse(String course){
        int i ;
        boolean b ;
        for(i = 0 ; i < cIndex ; i++){
            if(course.equals(courses[i])){
                break ;
            }
        }
        if(i < numCourses && courses[i].equals(course))
        {
            b = false ;
        }
        else if(cIndex == numCourses ){
            System.out.println("Course list has no space !! Can't add further more courses");
            b =  true ;
        }
        else
            {
            courses[cIndex++] = course ;
            b = true;
        }
        return b ;
    }
    boolean removeCourse(String course){
        if(cIndex == 0){
        return false ;
        }
        else{
            int i ;
            for(i = 0 ; i < cIndex ; i++ ){
                if(course.equals(courses[i])){
                    for (int j = i ; j<=cIndex ; j++){
                        courses[j] = courses[j+1];
                    }
                    numCourses--;
                }
            }
            return true ;
        }
    }

    void display(){
        System.out.println("The list of courses taken by Teacher are  : ");
        int i = 0 ;
        for(i = 0 ; i < numCourses ; i++){
            System.out.println(courses[i]);
        }
    }
}

public class Students$Teachers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the address of the Student");
        String address = sc.nextLine();
        Student s = new Student(name , address);
        System.out.println("Enter the number of Courses the Student is enrolled in");
        int numCourses = sc.nextInt();
        sc.nextLine();
        s.setCourses(numCourses);
        for(int i = 0 ; i< numCourses ; i++){
        System.out.println("Enter the Course name & respective Course Grade of Course "+ (i+1));
            sc.nextLine();
            String cName = sc.nextLine();
            int Grade = sc.nextInt();
            sc.nextLine();
            s.addCourseGrade(cName,Grade);
        }
        System.out.println(s.ToString());
        s.printGrades$printCourses();
        System.out.println("average Grade = "+ s.getAverageGrade());
        System.out.println("Enter the no. of Courses taken by the Teacher");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the Teacher");
        String nameT = sc.nextLine();
        System.out.println("Enter the address of the Teacher");
        String addressT = sc.nextLine();
        Teacher t = new Teacher(nameT , addressT);
        t.setCourseNo(num);
        for(int i = 0 ; i< num ; i++){
            System.out.println("Enter the Course name taken by Teacher of Course "+ (i+1));
            String ctName = sc.nextLine();
            t.addCourseT(ctName);
        }
        System.out.println("Enter the course name of the Teacher to be added");
        String tCourse = sc.nextLine();
        boolean b = t.addCourse(tCourse);
        System.out.println(b);
        System.out.println(t.ToString());
        t.display();
    }
}
