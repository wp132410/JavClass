package org.dimigo.oop;

public class ArrayBasic2 {
	
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		int[] intArr1 = new int[] {1, 2, 3, 4, 5};
		
		for(int i : intArr) {
			System.out.print(i + " | ");
		}
		System.out.println();
		for(int i : intArr1) {
			System.out.print(i + " | ");
		}
		System.out.println();
		
		String[] strArr = {"hello", "world", "java"};
		String[] strArr1 = new String[] {"hello", "world", "java"};
		
		for(String str : strArr) {
			System.out.print(str + " | ");
		}
		System.out.println();
		
		Book[] book = {
				new Book("�̻�", "����ȣ", 1000),
				new Book("�ڹ��ǽ�", "���ڹ�", 2000),
				new Book("������ ����", "ȫ����", 3000)
		};
		
		for(Book value : book) {
			System.out.print(value.getTitle() + " | ");
		}
		System.out.println();
		
		String cities[] = null;
//		cities = {"����", "����", "�ĸ�"};
		
		cities = new String[] {"����", "����", "�ĸ�"};
		
	}
	
}
