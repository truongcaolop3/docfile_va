
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Student implements Cloneable, Comparable<Student>, Serializable {
    private static final long serialVersionUID = 1L;
    private String fullname;
    private String birthdate;
    private String gender;
    private double gpa;
    private int social_activities;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String fullname, String birthdate, String gender, double gpa, int social_activities) {
        super();
        this.fullname = fullname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.gpa = gpa;
        this.social_activities = social_activities;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getSocial_activities() {
        return social_activities;
    }

    public void setSocial_activities(int social_activities) {
        this.social_activities = social_activities;
    }

    @Override
    public int compareTo(Student s) {
        // TODO Auto-generated method stub
        int result = 0;
        if (gpa == s.gpa && social_activities == s.social_activities) {
                result = 0;
        }
        else if ((gpa > s.gpa) || (gpa == s.gpa && social_activities > s.social_activities)) {
                result = 1;
        }
        else if(gpa < s.gpa) {
                result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
            String line = "\n";
            return   "Car=[ "
                            + "fullname= "+ getFullname() + line 
                            + "birthdate= " + getBirthdate() + line
                            + "gender= " + getGender() + line
                            + "gpa= " + getGpa() + line 
                            + "social_activities= " + getSocial_activities() + line 
                            + " ]" + line;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
            // TODO Auto-generated method stub
    return super.clone();
    }

    void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fullname: ");
        this.fullname = scanner.nextLine();
        System.out.print("Birthdate: ");
        this.birthdate = scanner.nextLine();
        System.out.print("Gender: ");
        this.gender = scanner.nextLine();
        System.out.print("GPA: ");
        this.gpa = scanner.nextDouble();
        System.out.print("Social Activities: ");
        this.social_activities = scanner.nextInt();
        System.out.println();
    }
    void outputStudent() {
        System.out.println("Fullname: " + getFullname());
        System.out.println("Birthdate: " + getBirthdate());
        System.out.println("Gender: " + getGender());
        System.out.println("GPA: " + getGpa());
        System.out.println("Social Activities: " + getSocial_activities());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("A number of students are: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i<n){
            System.out.println("Enter student information " + (i+1) + ": ");
            Student student = new Student();
            student.inputStudent();
            students.add(student);
            i++;
        }
        i=0;
        while (i<students.size()){
            System.out.println("\n------------- " + students.get(i).getFullname() + " -------------");
            students.get(i).outputStudent();
            //students.get(i).toString();
            System.out.println();
            i++;
        }

    scanner.close();
    }
}
