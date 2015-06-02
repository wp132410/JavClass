package org.dimigo.oop;

public class MultiArray2 {
		
		public static void main(String[] args){
				
				int intArr[][] = {
						{1, 2, 3},
						{4, 5, 6}
				};
				
				Print_for_each(intArr);
				System.out.println();
				System.out.println();
				
				int intArr2[][] = {
						new int[] {1, 2, 3, 4, 5, 6} ,
						new int[] {12, 234, 5, 6	}
				};
				
				Print_for_each(intArr2);
				System.out.println();
				System.out.println();
				
				int intArr3[][]	= new int[][] {
						new int[] {1, 2, 3, 4, 5},
						new int[] {6, 7, 8, 9}
				};
				
				Print_for_each(intArr3);
				
		}
		public static void Print_for_each(int intArr[][]) {
			for(int[] arr : intArr) {
				for(int value : arr) {
					System.out.print(value + " | ");
				}
				System.out.println();
			}
		}
}
