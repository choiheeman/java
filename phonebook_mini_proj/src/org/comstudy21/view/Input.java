package org.comstudy21.view;

import java.util.Scanner;

import org.comstudy21.model.People;

/*
import org.comstudy21.model.People;

public class Input extends MyView {

	@Override
	public void display() {
		System.out.print("성명 입력 >>> ");
		String name = scan.next();
		
		System.out.print("전화번호 입력 >>> ");
		String phone = scan.next();
		
		System.out.print("주소 입력 >>> ");
		String address = scan2.nextLine();
		
		// 바인딩 시키고 Controller로 돌아간다.
		request.put("dto",  new People(0, name, phone, address));
	}

}

*/

public class Input extends MyView{

	Scanner scan = new Scanner(System.in); 

	
	@Override
	public void display() {
		System.out.println("성명 입력 >>> ");
		String name = scan.next();
		
		System.out.println("전화번호 입력 >>> ");
		String phone = scan.next();
		
		System.out.println("주소 입력 >>> ");
		String address = scan.next();
		
		request.put("dto", new People(0, name, phone, address));
		
	}
	
	
}