package org.comstudy21.view;


import java.util.Scanner;

import org.comstudy21.resource.Res;

//�߻�
public abstract class MyView implements Res {
	
	
	// ����� ��ü�� ����뵵
		
		public static final String[] items = {"MENU","INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
		public static final	String[] viewTitles = {
					":::: MENU ::::",
					":::: INPUT ::::",
					":::: OUTPUT ::::",
					":::: SEARCH ::::",
					":::: MODIFY ::::",
					":::: DELETE ::::",
					":::: END ::::"
					
					
			};
		
		public static final Scanner scan = new Scanner(System.in);
		public static final Scanner scan2 = new Scanner(System.in);
		
	
		// ���ø� �޼ҵ�
		public void show(int index) {		// ���� ���ε��� ���ؼ� ��� �޴��� ���´�.
			System.out.println(viewTitles[index]);
			display(); 
		}
	
			public abstract void display();	//��� View �� ���÷��̸� ������ �־�� �Ѵ�.(�ִ�)
}
