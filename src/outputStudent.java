
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class outputStudent {
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String fileString = "student.txt";
        try {
        FileOutputStream out = new FileOutputStream(fileString);
        ObjectOutputStream oout = new ObjectOutputStream(out);


        ArrayList<Student> students = new ArrayList<>();
        System.out.print("A number of students are ");
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
            oout.writeObject(students.get(i).toString());
            System.out.println();
            i++;
        }
        oout.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileString));
        ois.readObject();
        ois.close();
        } 
        catch (Exception ex) {
        ex.printStackTrace();
        }
        scanner.close();
    }
}
