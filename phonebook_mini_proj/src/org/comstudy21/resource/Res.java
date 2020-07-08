package org.comstudy21.resource;

import java.util.Hashtable;


import org.comstudy21.controller.MyController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.*;

// Res �������̽��� ��� or ��ü�� ����뵵
// �������� ������ �ϴ� �ϳ��� "Res" ������� ���� (     View �� Res �� controller, res �� Main ( ���ε� ��ü ))
public interface Res {
	// ����� ��ü�� ����뵵
	
	int MENU = 0,  INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5,  END = 6;
	
	
	Hashtable<String, Object> request =  new Hashtable<String, Object>(); // ������Ʈ Ÿ������ �ϸ� �� ���� �� ����.
	
	String appTitle = ":::: ��ȭ��ȣ�� ���α׷� ::::";
		
		MyView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End() };

		Dao dao = new Dao();
		
		MyController controller = new MyController();
}

