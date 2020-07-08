package PhoneBook_App;

import PhoneBook_Controller.Controller;
import PhoneBook_View.Menu;

public class AppMain {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.service();
	}

}
