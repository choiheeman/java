package org.comstudy21.controller;

import java.util.ArrayList;

import org.comstudy21.model.People;
import org.comstudy21.resource.Res;


public class MyController implements Res {
	public void service() {
		views[MENU].show(MENU);
		// System.out.println("no => " request.get("no"));
		int no = (int) request.get("no");
		if(no == INPUT) {
			views[no].show(no);
			// request에 저장된 dto 꺼내 오기 -
			// Object 타입을 People 타입으로 다운 캐스팅
			
			People dto = (People) request.get("dto");	// 수정
			dao.insert(dto);
			// System.out.println("Controller - " + dto);
		}else if(no == OUTPUT) {
			// dao에서 list를 받아 와서 request에 바인딩 한다.
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no);	// View 호출
		}else if(no == SEARCH) {
			views[no].show(no);
		}else if(no == MODIFY) {
			views[no].show(no);
		}else if(no == DELETE) {
			views[no].show(no);
		}else if(no == END) {
			views[no].show(no);
		}else {
			System.out.println("해당 사항 없습니다.");
		}
		System.out.println("-----------------------------------------------------");
		
		// 재귀호출
		service();
	}
}

