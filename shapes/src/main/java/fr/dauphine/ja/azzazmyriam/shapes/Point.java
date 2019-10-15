package fr.dauphine.ja.azzazmyriam.shapes;

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
		return"("+x+","+y+")";
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
	
    public static void main( String[] args )
    {
        Point p = new Point();
        Point p1 = new Point();
        Point p2 = new Point(7,2);
        Point p3 = new Point(7,2);
        System.out.println(p2);
        System.out.println(p2.isSameAs(p3));
        System.out.println(getNbPointcree());
    }
}
