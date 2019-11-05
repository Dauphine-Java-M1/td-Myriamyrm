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
		if(Math.sqrt((p.getX() - this.centre.getX())*(p.getX() - this.centre.getX()) 
				+ (p.getY() - this.centre.getY())*p.getY() - this.centre.getY()) <= this.rayon) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, ArrayList<Circle> c) {
		for(Circle circle : c) {
			if(circle.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		Point p = new Point(0,0);
		Point p1 = new Point(0,1);
		Circle c = new Circle(p,2);
		
		Circle c2 = new Circle(p,2);
		c2.translate(1,1);	
		
		System.out.println(c + "\n" + c2);
		System.out.println(c.surface());
		
		Circle c3 = new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c.contains(p1));
	}
	
}
