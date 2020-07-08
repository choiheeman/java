package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Input extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::: input ::::");
		
		puts("이름 입력 >>> ");
		String name = scan.next();
		puts("핸드폰 번호 입력>>>");
		String phone = scan.next();
		puts("이메일 입력 >>>");
		String email = scan.next();
		
		
		PhonebookDto dto = new PhonebookDto(0, name, phone, email);
		request.put("dto", dto);
		
	}

}
