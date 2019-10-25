package fr.dauphine.ja.azzazmyriam.shapes;

import java.util.LinkedList;

public class LigneBrisee {

	//LinkedList<Point> list;
	Point[] list;
	
	LigneBrisee(){
		//list = new LinkedList<Point>();
		this.list = new Point[3];
	}
	
	public void add(Point p){
		int k = 0;
		while(list[k] != null) {
			k++;
		}
		list[k] = p;
	}
	
	public int pointCapacity() {
		return list.length;
	}
	
	public int nbPoints() {
		int k = 0;
		while(list[k] != null) {
			k++;
		}
		return k;
	}
	
	public boolean contains(Point p) {
		for(Point o : list) {
			if(o == p) {
				return true;
			}
		}
		return false;
	}
	
	public Point[] getList()	{
		return this.list;
	}
	
	public static void main( String[] args ) {
		LigneBrisee line = new LigneBrisee();
		Point p = new Point(1,2);
		Point o = new Point(2,3);
		Point i = new Point(2,7);
		line.add(p);
		line.add(o);
		//line.add(null);
		System.out.println(line.nbPoints());
		System.out.println(line.contains(null));
		
	}
}
