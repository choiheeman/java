package PhoneBook_View;

import java.util.Scanner;

import PhoneBook_MyUtil.MyUtil;
import PhoneBook_Resource.R;

//�߻� Ŭ���� ���� ( abstract )
public abstract class Phonebook_View implements R {
	
	protected static Scanner scan = MyUtil.scan;
	// �ڼյ鸸 ����� �� �ֵ��� ( protected ) ���
	
	protected abstract void display() ;
	
	
	// ���ø� �޼���(�������ε�)
		public void show() {
			System.out.println("---------------");
			display();
		}
		
	}

