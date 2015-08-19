package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(5); 
 		Triangle t = new Triangle(10, 10, 5, 8); 
		Rectangle r = new Rectangle(20, 20, 5, 8); 
 		 
		System.out.println("원의 넓이 : "); 
 		System.out.printf("%.1f\n", c.calcArea()); 
 		System.out.println("삼각형의 넓이 : "); 
 		System.out.printf("%.1f\n", t.calcArea()); 
 		System.out.println("사각형의 넓이 : "); 
 		System.out.printf("%.1f\n", r.calcArea()); 
 		System.out.println(); 
 		c.printCenter(); 
 		t.printCenter(); 
  		r.printCenter(); 
  		System.out.println("\n-- 중심좌표 이동 (x, y축 5씩)\n"); 
 		c.moveFigure(5, 5); 
 		t.moveFigure(5, 5); 
  		r.moveFigure(5, 5); 	 
 		c.printCenter(); 
  		t.printCenter(); 
 		r.printCenter(); 
	}

}
