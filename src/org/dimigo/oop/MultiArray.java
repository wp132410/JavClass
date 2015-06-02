package org.dimigo.oop;

public class MultiArray {
	
		public static void main(String[] args) {
				int[][] intArr = new int[2][3];
				
				Print(intArr);

				intArr[0][0] = 100;
				intArr[1][2] = 90;
				
				Print(intArr);
				
				intArr[1][0]  = 80;
				Print_for_each(intArr);	
				
				
				
				
				String[][] strArr = new String[2][];
				strArr[0] = new String[3];
				strArr[1] = new String[5];
				
				strArr[0][0] = "C";
				strArr[0][1]	 = "Java";
				strArr[0][2] = "C++";
				
				strArr[1][0] = "PHP";
				strArr[1][1] = "JSP";
				
				System.out.println();
				Print(strArr);
				
		}
		
		public static void Print(int intArr[][]) {
			for(int i = 0; i<intArr.length; i++) {
				for(int j = 0; j<intArr[i].length; j++) {
					System.out.print(intArr[i][j] + " | ");
				}
				System.out.println("");
			}
			System.out.println();
		}
		
		public static void Print(String strArr[][]) {
			for(int i = 0; i<strArr.length; i++) {
				for(int j = 0; j<strArr[i].length; j++) {
					System.out.print(strArr[i][j] + " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		public static void Print_for_each(String strArr[][]) {
			for(String[] arr : strArr) {
				for(String value : arr) {
					System.out.print(value + " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		public static void Print_for_each(int intArr[][]) {
			for(int[] arr : intArr) {
				for(int value : arr) {
					System.out.print(value + " | ");
				}
			}
		}
	
}
