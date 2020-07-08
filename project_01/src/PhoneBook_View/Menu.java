package PhoneBook_View;

import static PhoneBook_MyUtil.MyUtil.*;


public class Menu extends Phonebook_View {

	protected void display() {
		System.out.println("====================== MENU ======================");
		System.out.println("1.INPUT 2.OUTPUT 3.SEARCH 4.MODIFY 5.DELETE 6.END");
		System.out.print("Choice >>> ");
		int no = getNum();
		// 번호 받은것이  1 ~ 6번이 맞아야 함.
		
	// R에 바인딩 하고 Controller로 이동한다.
	// HashTable 선언
		
		request.put("no", no); // 입력 받은 NO 넣어주면 된다.
	}
	
}
