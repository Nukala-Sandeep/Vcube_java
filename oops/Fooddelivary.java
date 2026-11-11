package com.oops;

class Delivery {
	int deliveryId;
	String partnerName;
	double distance;
	
	
	public double calculateDeliveryCharge(double distance){
		double dcharge=0.0;
		return dcharge;
	}
	void show() {
		System.out.println("DeliveryId: "+deliveryId);
		System.out.println("partnerName: "+partnerName);
		System.out.println("Distance: "+distance);
	}
}

class BikeDelivery extends Delivery{

	@Override
	public double calculateDeliveryCharge(double distance){
		double dcharge=10*distance;
		return dcharge;
	}
}
class CycleDelivery extends Delivery{
	@Override
	public double calculateDeliveryCharge(double distance){
		double dcharge=5*distance;
		return dcharge;
	}
}

class ExpressDelivery extends Delivery{
	@Override
	public double calculateDeliveryCharge(double distance){
		double dcharge=20*distance;
		return dcharge;
	}
}

public class Fooddelivary {

	public static void main(String[] args) {
		Delivery d1=new ExpressDelivery();
		d1.deliveryId=1;
		d1.partnerName="Sandeep";
		d1.distance=5.0;
		double price =d1.calculateDeliveryCharge(d1.distance);
		d1.show();
		System.out.println("Price =Rs."+price);

	}

}
