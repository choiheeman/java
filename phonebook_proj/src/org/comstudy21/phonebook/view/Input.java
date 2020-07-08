package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Input extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: input ::::");
		
		puts("�̸� �Է� >>> ");
		String name = scan.next();
		puts("�ڵ��� ��ȣ �Է�>>>");
		String phone = scan.next();
		puts("�̸��� �Է� >>>");
		String email = scan.next();
		
		
		PhonebookDto dto = new PhonebookDto(0, name, phone, email);
		request.put("dto", dto);
		
	}

}
