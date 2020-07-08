package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;

public abstract class PhonebookView implements R {
	
	protected static Scanner scan = MyUtil.scan;
	
	protected abstract void display();
	
	// 템플릿 메소드 (동적바인딩)
	public void show() {
		System.out.println("------------------------");
		display();
	}
}
