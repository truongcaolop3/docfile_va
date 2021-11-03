/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_11_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class aaaaa {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
        String fileString = "car.txt";
	try {
        FileOutputStream out = new FileOutputStream(fileString);
        ObjectOutputStream oout = new ObjectOutputStream(out);

        ArrayList<Car> cars = new ArrayList<>();
        System.out.print("A number of cars are: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i<n){
            System.out.println("Enter car information " + (i+1) + ": ");
            Car car = new Car();
            car.input();
            cars.add(car);
            i++;
        }
        i=0;
        while (i<cars.size()){
            System.out.println("\n------------- " + cars.get(i).getName() + " -------------");
            cars.get(i).output();
            oout.writeObject(cars.get(i).toString());
            System.out.println();
            i++;
        }
//        for (int i=0; i<n; i++) {
//            System.out.println("Enter car information " + (i+1) + ": ");
//            Car car = new Car();
//            car.input();
//            cars.add(car);
//        }
//        for (int i=0; i<cars.size(); i++) {
//            System.out.println("\n------------- " + cars.get(i).getName() + " -------------");
//            cars.get(i).output();
//            oout.writeObject(cars.get(i).toString());
//            System.out.println();
//        }
        oout.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileString));

        ois.readObject();
        ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        scanner.close();
    }
}
