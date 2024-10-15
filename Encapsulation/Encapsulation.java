package Encapsulaion;

class Car{
	private int wheel=4;
	private int door=4;
	private int engine=1;
	private int max_speed=50;
	private String milege="150m/l";
	private String price="20lakh";
	
	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		if(wheel==4) {
			this.wheel=wheel;
		}
	}
	
	
	
	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		if(door==4) {
			this.door = door;
		}
		
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		if(engine==1) {
			this.engine = engine;
		}
	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		if(max_speed==50) {
			this.max_speed = max_speed;
		}	
	}

	public String getMilege() {
		return milege;
	}

	public void setMilege(String milege) {
		this.milege = milege;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	void getDetail() {
		System.out.println("Wheels: "+wheel);
		System.out.println("Doors: "+door);
		System.out.println("Engine: "+engine);
		System.out.println("Max_speed: "+max_speed);
		System.out.println("Milege: "+milege);
		System.out.println("Price: "+price);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setWheel(5);   //this won't give 5 bcoz  of change in code
		c.setEngine(5);
		c.setMax_speed(60);
		c.setDoor(6);
		c.getDetail();

	}

}
