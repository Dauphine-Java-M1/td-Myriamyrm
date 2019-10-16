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
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public static int getNbPointcree() {
		return nbPointcree;
	}
	
	boolean isSameAs(Point p) {
		boolean i = false;
		if(this.x == p.x & this.y == p.y) {
			i = true;
		}
		return i;
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
	
    public static void main( String[] args )
    {
        Point p1 = new Point();
        Point p2 = new Point(7,2);
        Point p3 = new Point(7,2);
        Point p4 = p2;
        Point p5 = new Point();
        ArrayList<Point> list = new ArrayList<Point>();
        list.add(p2);
        list.add(p1);
        System.out.println(p2.indexOf(list));  //0
        System.out.println(p1.indexOf(list));  //1
        System.out.println(p4.indexOf(list));  //0
        System.out.println(p5.indexOf(list)); //-1
        System.out.println(p2);
        System.out.println(p2.isSameAs(p3));
        System.out.println(getNbPointcree());
    }
}
