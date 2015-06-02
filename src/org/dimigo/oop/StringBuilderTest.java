package org.dimigo.oop;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String str = "��̰�";
		str += "2�г� ";
		str += "4�� ";
		str += "10�� ";
		str += "�ڼ���";
		
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("��̰� ");
		sb.append("2�г� ");
		sb.append("4�� ");
		sb.append("10�� ");
		sb.append("�ڼ���");
		
		System.out.println(sb.toString());
		System.out.println(sb);
		
		String sb1 = new StringBuilder("��̰�")
			.append("2�г� ")
			.append("4��")
			.append("10��")
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
