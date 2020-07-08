package org.comstudy21.view;

import java.util.ArrayList;

import org.comstudy21.model.People;

/* 

import java.util.ArrayList;

import org.comstudy21.model.People;

public class Output extends MyView {

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>)request.get("list"); // 다운캐스팅
		for(People p : list) {
			System.out.println(p);
		}
	}

}

*/

public class Output extends MyView{

	@Override
	public void display() {
		ArrayList<People> list = (ArrayList<People>)request.get("list"); // 다운 캐스팅
		for(People p : list) {
			System.out.println(p);
		}
		
	}
	
}
