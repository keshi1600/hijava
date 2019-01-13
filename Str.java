package hijava.prac;

public class Str {

	public static void main(String[] args) {
		char c = 'ÇÑ';
		byte b = 'B';
		
		System.out.println(c);
		System.out.println( (int)c );
		System.out.println(b);
		
		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("ABÇÑ".getBytes().length);

	}

}
