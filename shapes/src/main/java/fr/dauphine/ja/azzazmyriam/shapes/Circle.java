package fr.dauphine.ja.azzazmyriam.shapes;

import java.lang.Math;
import java.util.ArrayList;

public class Circle {

	public Point centre;
	public int rayon;
	
	Circle(Point p, int r){
		this.centre = new Point(p.getX(), p.getY());
		this.rayon = r;
	}
	
	Circle(){
		this.centre = new Point();
		this.rayon = 0;
	}
	
	@Override
	public String toString() {
		return "cercle de rayon : " + rayon + " et de centre : " + centre.toString() + 
				". Sa surface est de : " + this.surface(); 
	}
	
	public void translate(int dx, int dy) {
		this.centre.translate(dx, dy);
	}
	
	public Point getCenter() {
		return this.centre;
	}
	
	public double surface() {
		return this.rayon*this.rayon*Math.PI;
	}
	
	public boolean contains(Point p) {
		int x = p.getX() - this.centre.getX();
		int y = p.getY() - this.centre.getY();
		return Math.sqrt(x*x + y*y) <= this.rayon; 
	}
	
	public boolean contains(Point p, ArrayList<Circle> c) {
		for(Circle circle : c) {
			if(circle.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	public int getRayon() {
		return this.rayon;
	}
	
	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Circle)) {
			return false;
		}
		Circle c = (Circle) o;
		return this.centre.equals(c.getCenter()) && this.rayon == c.getRayon();
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Circle c = new Circle(new Point(0,0),2);
		
		Circle c2 = new Circle(new Point(0,0),2);
//		c2.translate(1,1);	
//		
//		System.out.println(c + "\n" + c2);
//		System.out.println(c.surface());
//		
//		Circle c3 = new Circle(new Point(1,2), 1);
//		c.getCenter().translate(1,1);
		System.out.println(c.contains(p1));
		System.out.println(c2.equals(c));
	}
	
}
