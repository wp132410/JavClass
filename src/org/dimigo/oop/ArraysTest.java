package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
	
		public static void main(String[] args) {
				String[] src = {"�����", "���ٺ�", "���ν�", "�ڱ���"};
				
				// �迭 ����
				String[] dest = Arrays.copyOf(src,  src.length);
				
				// �迭 ���
				System.out.println(Arrays.toString(dest));
				
		}
	
}
