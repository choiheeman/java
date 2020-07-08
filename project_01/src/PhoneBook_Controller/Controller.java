package PhoneBook_Controller;

import PhoneBook_Resource.R;
import PhoneBook_View.Menu;

public class Controller implements R {

	public void service() { // service��� �޼ҵ� 1�� ����
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
			System.out.println("�ش� ���� �����ϴ�!!");

		}
		
		// ���ȣ��
		service();
	}

}
