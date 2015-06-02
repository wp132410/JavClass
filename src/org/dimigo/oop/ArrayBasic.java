package org.dimigo.oop;

public class ArrayBasic {
	
	public static void main(String[] args) {
		int[] intArr = null;
		
		intArr = new int[5];
		
		intArr[3] = 10;
		
		for(int i : intArr) {
			System.out.print(i + " | ");
		}
		System.out.println();
		
		String[] strArr = new String[3];
		
		strArr[0] = "EXO";
		strArr[1] = "EXID";
		
		for(String i : strArr) {
			System.out.print(i + " | ");
		}
		System.out.println();
		Book[] book = new Book[3];
		
		book[0] = new Book("rr", "ee", 1000);
		book[1] = new Book("¹Ì»ý", "À±ÅÂÈ£", 1000);
		book[2] = new Book("df", "fgf", 1000);
		
		for(Book i : book) {
			System.out.print(i.getTitle() + " | ");
		}
		System.out.println();
	}
}
