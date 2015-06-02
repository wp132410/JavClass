package org.dimigo.oop;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String str = "디미고";
		str += "2학년 ";
		str += "4반 ";
		str += "10번 ";
		str += "박세현";
		
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("디미고 ");
		sb.append("2학년 ");
		sb.append("4반 ");
		sb.append("10번 ");
		sb.append("박세현");
		
		System.out.println(sb.toString());
		System.out.println(sb);
		
		String sb1 = new StringBuilder("디미고")
			.append("2학년 ")
			.append("4반")
			.append("10번")
			.toString();
		
		long start = System.currentTimeMillis();
		
		String test = "abc";
		StringBuffer test1 = new StringBuffer("abc");
		StringBuilder test2 = new StringBuilder("abc");
		
		for(int i = 0; i<100000; i++) {
		//	test += "def"; 24161
		//	test1.append("def"); // 14
			test2.append("def"); // 16
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end - start));
		
		
		
		
	}

}
