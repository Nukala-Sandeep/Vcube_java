package com.oops;
class Vehicle{
	
	private String vehicleNumber;
	private String brand;
	private double rentPerDay;
public Vehicle(String vehicleNumber,String brand,double rentPerDay) {
	this.vehicleNumber=vehicleNumber;
	this.brand=brand;
	this.rentPerDay=rentPerDay;
		
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	double calculateRent(){
		return 0;
	}
	void display() {
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Brand: "+brand);
		System.out.println("Rent per day: "+rentPerDay);
		
	}
}

class  Car extends Vehicle{
	int days;
	Car(String vehicleNumber,String brand,double rentPerDay,int days){
		super(vehicleNumber,brand,rentPerDay);
		this.days=days;
	}
	double calculateRent(int days){
		return days*getRentPerDay();
	}
	void display() {
		System.out.println("Your selected car details: \n");
		System.out.println("Vehicle Number: "+getVehicleNumber());
		System.out.println("Brand: "+getBrand());
		System.out.println("Rent per day: "+getRentPerDay());
		System.out.println("No of Days: "+days);
		System.out.println("total rent: "+calculateRent(days));
	}
}
class Bike extends Vehicle{
	int days;
	Bike(String vehicleNumber,String brand,double rentPerDay,int days){
		super(vehicleNumber,brand,rentPerDay);
		this.days=days;
	}
	
	double calculateRent(int days){
		return days*getRentPerDay();
	}
	void display() {
		System.out.println("Your selected bike details: \n");
		System.out.println("Vehicle Number: "+getVehicleNumber());
		System.out.println("Brand: "+getBrand());
		System.out.println("Rent per day: "+getRentPerDay());
		System.out.println("No of Days: "+days);
		System.out.println("total rent: "+calculateRent(days));
	}
}
public class Vehicle_Rental_System {

	public static void main(String[] args) {
		Vehicle c=new Car("TG201234", "Maruthi", 2000, 3);
		c.display();
		System.out.println("************************************************");
		Vehicle b=new Bike("TG205467", "Activa 5G", 500, 3);
		b.display();
	}

}
