package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

/* 

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Output extends MyView {

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>)request.get("list"); // �ٿ�ĳ����
		for(People p : list) {
			System.out.println(p);
		}
	}

}

*/

public class Output extends MyView{

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>)request.get("list"); // �ٿ� ĳ����
		for(People p : list) {
			System.out.println(p);
		}
		
	}
	
}
