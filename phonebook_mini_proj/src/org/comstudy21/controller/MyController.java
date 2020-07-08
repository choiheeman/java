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
			// request�� ����� dto ���� ���� -
			// Object Ÿ���� People Ÿ������ �ٿ� ĳ����
			
			People dto = (People) request.get("dto");	// ����
			dao.insert(dto);
			// System.out.println("Controller - " + dto);
		}else if(no == OUTPUT) {
			// dao���� list�� �޾� �ͼ� request�� ���ε� �Ѵ�.
			ArrayList<People> list = dao.selectAll();
			request.put("list", list);
			views[no].show(no);	// View ȣ��
		}else if(no == SEARCH) {
			views[no].show(no);
		}else if(no == MODIFY) {
			views[no].show(no);
		}else if(no == DELETE) {
			views[no].show(no);
		}else if(no == END) {
			views[no].show(no);
		}else {
			System.out.println("�ش� ���� �����ϴ�.");
		}
		System.out.println("-----------------------------------------------------");
		
		// ���ȣ��
		service();
	}
}

