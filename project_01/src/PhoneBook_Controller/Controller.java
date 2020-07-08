package PhoneBook_Controller;

import PhoneBook_Resource.R;
import PhoneBook_View.Menu;

public class Controller implements R {

	public void service() { // service라는 메소드 1개 생성
		views[MENU].show();

		int no = (int) request.get("no");

		switch (no) {
		case INPUT:
			views[INPUT].show();
			break;
		case OUTPUT:
			views[OUTPUT].show();
			break;
		case SEARCH:
			views[SEARCH].show();
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
			System.out.println("해당 사항 없습니다!!");

		}
		
		// 재귀호출
		service();
	}

}
