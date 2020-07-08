package org.comstudy21.phonebook.resource;

import java.util.ArrayList;
import java.util.Hashtable;

import org.comstudy21.phonebook.model.PhonebookDao;
import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.view.Delete;
import org.comstudy21.phonebook.view.End;
import org.comstudy21.phonebook.view.Input;
import org.comstudy21.phonebook.view.Menu;
import org.comstudy21.phonebook.view.Modify;
import org.comstudy21.phonebook.view.Output;
import org.comstudy21.phonebook.view.PhonebookView;
import org.comstudy21.phonebook.view.Search;

public interface R {
	int MENU=0, INPUT=1, OUTPUT=2, SEARCH=3, MODIFY=4, DELETE=5, END=6;
	
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	//Menu menu = new Menu();
	PhonebookView[] views = {new Menu(),new Input(),new Output(),new Search(),new Modify(),new Delete(),new End()};
	
	
	ArrayList<PhonebookDto> dtoList = new ArrayList<PhonebookDto>();
	PhonebookDao dao = new PhonebookDao(dtoList);
}





