/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapdl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Nhapdl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
	String str = sc.nextLine();
    try {
        File myObj = new File("file.txt");
        if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
        } else {
        System.out.println("File already exists.");
        }
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      FileWriter myWriter = new FileWriter("file.txt");
      myWriter.write(str);
      myWriter.close();
      System.out.println("Successfully wrote to the file");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
        File myObj = new File("file.txt");
        Scanner docfile = new Scanner(myObj);
        while (docfile.hasNextLine()) {
        String data = docfile.nextLine();
        System.out.println(data);
        }
        docfile.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
}
    
