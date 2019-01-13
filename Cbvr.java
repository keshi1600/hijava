package hijava.prac;

public class Cbvr {

	int m = 2;
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i1=" + i );
		
		change1(i);
		System.out.println("i2=" + i);
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m);
		
		change2(cb1);
		System.out.println("cb2=" + cb1.m);	
		
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}
	
	public static void change1(int x) {
		System.out.println("x=" + x);
		
		x=100;
}
}
