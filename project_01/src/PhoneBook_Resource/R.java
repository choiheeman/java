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
	// ���ڿ� (String )���, �ְ� Object ����
	// request��... key(String)�� value(Object)�� ������ �� �ְ� ����
	// key�� NO, value�� �Է� ���� ��.
	// Key = DTO.. ��� �߰��� �� �ִ�.
	
	
	Phonebook_View[] views = { new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete(), new End()};
	
	
	
}
