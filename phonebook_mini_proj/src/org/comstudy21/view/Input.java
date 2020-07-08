package org.comstudy21.view;

import java.util.Scanner;

import org.comstudy21.model.People;

/*
import org.comstudy21.model.People;

public class Input extends MyView {

	@Override
	public void display() {
		System.out.print("���� �Է� >>> ");
		String name = scan.next();
		
		System.out.print("��ȭ��ȣ �Է� >>> ");
		String phone = scan.next();
		
		System.out.print("�ּ� �Է� >>> ");
		String address = scan2.nextLine();
		
		// ���ε� ��Ű�� Controller�� ���ư���.
		request.put("dto",  new People(0, name, phone, address));
	}

}

*/

public class Input extends MyView{

	Scanner scan = new Scanner(System.in); 

	
	@Override
	public void display() {
		System.out.println("���� �Է� >>> ");
		String name = scan.next();
		
		System.out.println("��ȭ��ȣ �Է� >>> ");
		String phone = scan.next();
		
		System.out.println("�ּ� �Է� >>> ");
		String address = scan.next();
		
		request.put("dto", new People(0, name, phone, address));
		
	}
	
	
}