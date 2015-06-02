package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
	
		public static void main(String[] args) {
				String[] src = {"양기현", "차다빈", "성인실", "박근정"};
				
				// 배열 복사
				String[] dest = Arrays.copyOf(src,  src.length);
				
				// 배열 출력
				System.out.println(Arrays.toString(dest));
				
		}
	
}
