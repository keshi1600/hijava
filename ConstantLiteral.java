package hijava.prac;

public class ConstantLiteral {

	public static final int STU_NUM =10;
	
	public static void main(String[] args) {
		final String s = "abc";
		add1(s);
		System.out.println(s);
	}
	
	public static String add1(String s) {
		s = s + "1";
		System.out.println(s);
		return s;
	}

}
