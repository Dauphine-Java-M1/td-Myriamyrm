package fr.dauphine.ja.azzazmyriam.shapes;

import java.util.ArrayList;

public class Ring extends Circle {

	Circle c;
	int rayonInterne;
	
	public Ring(){
		c = new Circle();
		rayonInterne = 0;
	}
	
	public Ring(Point center, int r, int rayonI){
		c = new Circle(center, r);
		rayonInterne = rayonI;
	}
	
	public Circle getCircle() {
		return this.c;
	}
	
	public int getRayonInterne() {
		return this.rayonInterne;
	}
	
	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Ring)) {
			return false;
		}
		Ring r = (Ring) o;
		return this.getCircle().equals(r.getCircle()) && this.getRayonInterne() == r.getRayonInterne();
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Rayon interne : " + rayonInterne;
	}
	
	public boolean contains(Point p) {
		int x = p.getX() - this.c.getCenter().getX();
		int y = p.getY() - this.c.getCenter().getY();
		return (Math.sqrt(x*x + y*y) <= this.c.rayon) && !(Math.sqrt(x*x + y*y) <= this.rayonInterne); 
	}
	
//	public boolean contains(Point p, ArrayList<Ring> r) {
//		for(Ring ri : r) {
//			if(ri.contains(p)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public static void main( String[] args ){
		Ring ri = new Ring(new Point(0,0), 1, 1);
		Ring rin = new Ring(new Point(0,0), 1, 1);
		Point pi = new Point(1,1); 
		System.out.println(ri.equals(rin));
		System.out.println(ri.contains(pi));
	}
	
}
