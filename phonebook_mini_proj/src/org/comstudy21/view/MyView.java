package org.comstudy21.view;


import java.util.Scanner;

import org.comstudy21.resource.Res;

//추상
public abstract class MyView implements Res {
	
	
	// 상수자 객체의 저장용도
		
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
		
	
		// 템플릿 메소드
		public void show(int index) {		// 동적 바인딩에 의해서 모든 메뉴가 나온다.
			System.out.println(viewTitles[index]);
			display(); 
		}
	
			public abstract void display();	//모든 View 는 디스플레이를 가지고 있어야 한다.(있다)
}
