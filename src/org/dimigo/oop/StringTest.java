package org.dimigo.oop;

public class StringTest {
		
		public static void main(String[] args) {
				//1. 문자열 Literal pool에 생성, 동일 문자열일 경우 공유//
				String dog1 = "멍멍이";
				String dog2 = "멍멍이";
				
				//2. new 객체 생성 방식, 매번 다른 문자열 객체를 생성함
				String cat1 = new String("야옹이");
				String cat2 = new String("야옹이");
				
				System.out.println(dog1 == dog2); // T
				System.out.println(cat1 == cat2); // F
				System.out.println(dog1 == "멍멍이"); // T
				
				System.out.println(cat1.equals(cat2)); // T
				System.out.println(cat2.equals(cat1)); // T
				
				// 문자열 비교시 주의사항
				String id = null;
				
				if("admin".equals(id)) {
					System.out.println("관리자입니다.");
				} else {
					System.out.println("관리자가 아닙니다.");
				}
				
				if("admin".equalsIgnoreCase(id)) {
					System.out.println("관리자입니다.");
				} else {
					System.out.println("관리자가 아닙니다.");
				}
		}
}
