package hijava.prac;

public class N {
	int x = 10;
	int y = 20;
	
	public static void swap() {
		int t = x;
		x = y;
		y = t;
	}
	
	/*public static void swap2() {
		int x1 = x;
		int y1 = y;
		x = y1;
		y = x1; 
	} */
	
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		
	}

}
