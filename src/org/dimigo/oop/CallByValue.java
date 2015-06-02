package org.dimigo.oop;

public class CallByValue {
	
	private void methodA(int num) {
		num += 10;
		System.out.println("methodA : " + num);
	}
	
	private void methodB(Book book) {
		System.out.println(book.getTitle());
		book = new Book("ħ���Ǻ�", "���ڹ̻�", 2000); 		// �Ű����� �κ��� �޼ҵ尡 ������ �ٷ� ��
		System.out.println(book.getTitle());
	}
	
	private void methodC(Book book) {
		book.setTitle("���帶����");		// �Ű������� ������� ��ü�� �״�� ��Ÿ����.
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		CallByValue ref = new CallByValue();
		ref.methodA(num);
		
		System.out.println("main : " + num);
		
		Book book = new Book("�ڹ�������", "���ü�", 1000);
		ref.methodB(book);
		System.out.println(book.getTitle());
		
		ref.methodC(book);
		System.out.println(book.getTitle());
	}
}
