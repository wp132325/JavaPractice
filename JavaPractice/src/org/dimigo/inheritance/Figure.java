package org.dimigo.inheritance;

public class Figure {
	
	private int centerX;
	private int centerY;
	
	public Figure() {
		
	}
	
	public Figure(int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	
	protected void printCenter() { 
		System.out.printf("중심좌표 : (%d, %d)\n", centerX, centerY); 
 	} 
	
	protected void moveFigure(int x, int y) { 
 		this.centerX += x; 
 		this.centerY += y; 
 	} 


}
