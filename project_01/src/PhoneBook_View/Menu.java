package PhoneBook_View;

import static PhoneBook_MyUtil.MyUtil.*;


public class Menu extends Phonebook_View {

	protected void display() {
		System.out.println("====================== MENU ======================");
		System.out.println("1.INPUT 2.OUTPUT 3.SEARCH 4.MODIFY 5.DELETE 6.END");
		System.out.print("Choice >>> ");
		int no = getNum();
		// ��ȣ ��������  1 ~ 6���� �¾ƾ� ��.
		
	// R�� ���ε� �ϰ� Controller�� �̵��Ѵ�.
	// HashTable ����
		
		request.put("no", no); // �Է� ���� NO �־��ָ� �ȴ�.
	}
	
}
