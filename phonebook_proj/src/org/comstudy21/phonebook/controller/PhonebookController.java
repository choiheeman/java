package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhonebookController implements R {
	public void service() {
		views[MENU].show();

		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			// 입력이 끝나면 request에 정보가 있을 것이다.
			// 입력 받은 정보를 Dao로 넘겨준다.
			//System.out.println(request.get("dto"));
			dao.insert((PhonebookDto)request.get("dto"));
			break;
		case OUTPUT:
			ArrayList<PhonebookDto> list = dao.selectAll();
			request.put("list", list);
			views[OUTPUT].show();
			break;
		case SEARCH:
			views[SEARCH].show();
			// request에서 dto를 가져온다.
			PhonebookDto dto = (PhonebookDto)request.get("dto");
			System.out.println(dto);
			ArrayList<PhonebookDto> searchList = dao.select(dto);
			request.put("list", searchList);
			views[OUTPUT].show();
			break;
		case MODIFY:
			views[MODIFY].show();
			break;
		case DELETE:
			views[DELETE].show();
			break;
		case END:
			views[END].show();
			break;
		default:
			System.out.println("해당 사항 없습니다!");
		}
		
		// 재귀호출
		service();
	}
}
