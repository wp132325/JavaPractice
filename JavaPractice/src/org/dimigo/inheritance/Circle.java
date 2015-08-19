package org.dimigo.inheritance;

public class Circle extends Figure {
	
	public Circle(int centerX, int centerY) {
		super(centerX, centerY);
		// TODO Auto-generated constructor stub
	}

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
	
	protected void printCenter() { 
 		System.out.println("원 "); 
 		super.printCenter(); 
 	} 


}
