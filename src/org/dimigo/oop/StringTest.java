package org.dimigo.oop;

public class StringTest {
		
		public static void main(String[] args) {
				//1. ���ڿ� Literal pool�� ����, ���� ���ڿ��� ��� ����//
				String dog1 = "�۸���";
				String dog2 = "�۸���";
				
				//2. new ��ü ���� ���, �Ź� �ٸ� ���ڿ� ��ü�� ������
				String cat1 = new String("�߿���");
				String cat2 = new String("�߿���");
				
				System.out.println(dog1 == dog2); // T
				System.out.println(cat1 == cat2); // F
				System.out.println(dog1 == "�۸���"); // T
				
				System.out.println(cat1.equals(cat2)); // T
				System.out.println(cat2.equals(cat1)); // T
				
				// ���ڿ� �񱳽� ���ǻ���
				String id = null;
				
				if("admin".equals(id)) {
					System.out.println("�������Դϴ�.");
				} else {
					System.out.println("�����ڰ� �ƴմϴ�.");
				}
				
				if("admin".equalsIgnoreCase(id)) {
					System.out.println("�������Դϴ�.");
				} else {
					System.out.println("�����ڰ� �ƴմϴ�.");
				}
		}
}
