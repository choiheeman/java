package org.comstudy21.resource;

import java.util.Hashtable;


import org.comstudy21.controller.MyController;
import org.comstudy21.model.Dao;
import org.comstudy21.view.*;

// Res 인터페이스는 상수 or 객체의 저장용도
// 공통으로 쓰려고 하는 하나의 "Res" 연결고리를 만듬 (     View ↔ Res ↔ controller, res ↔ Main ( 바인딩 객체 ))
public interface Res {
	// 상수나 객체의 저장용도
	
	int MENU = 0,  INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5,  END = 6;
	
	
	Hashtable<String, Object> request =  new Hashtable<String, Object>(); // 오브젝트 타입으로 하면 다 넣을 수 있음.
	
	String appTitle = ":::: 전화번호부 프로그램 ::::";
		
		MyView[] views = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End() };

		Dao dao = new Dao();
		
		MyController controller = new MyController();
}

