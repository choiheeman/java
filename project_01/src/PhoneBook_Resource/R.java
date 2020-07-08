package PhoneBook_Resource;

import java.util.Hashtable;

import PhoneBook_View.Delete;
import PhoneBook_View.End;
import PhoneBook_View.Input;
import PhoneBook_View.Menu;
import PhoneBook_View.Modify;
import PhoneBook_View.Output;
import PhoneBook_View.Phonebook_View;
import PhoneBook_View.Search;

public interface R {
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5,END = 6;
	
	
	
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	// 문자열 (String )사용, 최고 Object 적용
	// request는... key(String)와 value(Object)를 저장할 수 있게 구조
	// key는 NO, value는 입력 받은 값.
	// Key = DTO.. 계속 추가할 수 있다.
	
	
	Phonebook_View[] views = { new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	
	
}
