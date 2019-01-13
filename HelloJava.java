package hijava.prac;

/**
 * 첫번째 자바 실습
 * @author 김형일
 * @version 1.4
 * @update say함수 추가 (2019-01-12)
 */

public class HelloJava {   // 로봇이라고 생각하기.

	public static void main(String[] args) {   //로봇을 실행시키면 메인먼저 뜸.
		
//		 HelloJava에게 say라는 명령을 내림.
		HelloJava.say("Hi~");  
		
//		 JVM이 스스로 화면에 출력.
		System.out.println("Hello Java!!");
		
	}
	
	public static void say(String msg) {
		System.out.println(msg);
	}

} 

