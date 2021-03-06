package fr.dauphine.ja.azzazmyriam.shapes;

import java.util.ArrayList;

public class Point 
{
	private int x;
	private int y;
	
	public static int nbPointcree = 0;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		nbPointcree++;
	}

	Point() {
		nbPointcree++;
	}
	
	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
	public static int getNbPointcree() {
		return nbPointcree;
	}
	
	boolean isSameAs(Point p) {
		return this.x == p.x & this.y == p.y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Point)) {
			return false;
		}
		Point p = (Point) o;
		return this.isSameAs(p);
	}
	
	int indexOf(ArrayList<Point> list) {
		int k = 0;
		
		for(Point p : list) {
			if(p.isSameAs(this)) {
			return k;
			}
		k++;
		}
		
		
		return k;
	}
	
	public Point translate (int dx, int dy) {
		//return new Point(dx,dy);
		this.x = this.x + dx;
		this.y = this.y + dy;
		return new Point(this.x, this.y);
	}
	
    public static void main( String[] args )
    {
//        Point p1 = new Point();
          Point p2 = new Point(1,1);
          Point p3 = new Point(1,1);
//        Point p4 = p2;
//        Point p5 = new Point();
//        ArrayList<Point> list = new ArrayList<Point>();
//        list.add(p2);
//        list.add(p1);
//        System.out.println(p2.indexOf(list));  //0
//        System.out.println(p1.indexOf(list));  //1
//        System.out.println(p4.indexOf(list));  //0
//        System.out.println(p5.indexOf(list)); //-1
//        System.out.println(p2);
//        System.out.println(p2.isSameAs(p3));
//        System.out.println(getNbPointcree());
         // p2.translate(1,-1);
          System.out.println(p3.equals(p2));
    }
}
