package PhoneBook_View;

import java.util.Scanner;

import PhoneBook_MyUtil.MyUtil;
import PhoneBook_Resource.R;

//추상 클래스 적용 ( abstract )
public abstract class Phonebook_View implements R {
	
	protected static Scanner scan = MyUtil.scan;
	// 자손들만 사용할 수 있도록 ( protected ) 사용
	
	protected abstract void display() ;
	
	
	// 템플릿 메서드(동적바인딩)
		public void show() {
			System.out.println("---------------");
			display();
		}
		
	}

