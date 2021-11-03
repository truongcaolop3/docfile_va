/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_11_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Car {
    private 
        String name ;
        String engine;
        int seats;
        int production_date;
            
    public Car() {
        super();
    }

    public Car(String name, String engine, int seats, int production_date) {
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        this.production_date = production_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getProduction_date() {
        return production_date;
    }

    public void setProduction_date(int production_date) {
        this.production_date = production_date;
    }

    @Override
    public String toString() {
		String line = "\n";
		return "Car=[ "
                                + "name= "+ name + line 
                                + "engine= " + engine + line
                                + "seats= " + seats + line
                                + "production_date= " + production_date + line 
                                + " ]" + line;
	}
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Engine: ");
        this.engine = scanner.nextLine();
        System.out.print("Seates: ");
        this.seats = scanner.nextInt();
        System.out.print("Production Date: ");
        this.production_date = scanner.nextInt();
        

    }

    void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Engine: " + this.engine);
        System.out.println("Seats: " + this.seats);
        System.out.println("Production Date: " + this.production_date);
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Car c = new Car("audi", "audi2020", 2, 2020);
        c.toString();
        ArrayList<Car> cars = new ArrayList<>();
        System.out.print("A number of cars are ");
        int n = scanner.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter car information " + (i+1) + ": ");
            Car car = new Car();
            car.input();
            cars.add(car);
        }

        for (int i=0; i<cars.size(); i++) {
            System.out.println("\n========== " + cars.get(i).getName() + " ==========");
            cars.get(i).output();
            cars.get(i).toString();
            System.out.println();
        }
    scanner.close();
    }
	
}
