package org.comstudy21.view;

/*

import static org.comstudy21.util.MyUtil.*;

public class Menu extends MyView {

	@Override
	public void display() {
		for (int i = 0; i <= END; i++) {
			System.out.println(i+ "." + items[i] + " ");
		}

		int no = 0;
		do {

			System.out.println("\nChoice>>> ");
			no = getNum();

		} while (no < INPUT || no > END);
		
		// Res의 request에 no를 저장하고 다시 Controller로 돌아간다.
		request.put("no", no);
	}
}

*/

import static org.comstudy21.util.MyUtil.*;

public class Menu extends MyView {

	@Override
	public void display() {
		for(int i =0; i< END; i++) {
			System.out.println(i+ "." + items[i] + " ");
		}
		
		int no = 0;
		
		do {
			
			System.out.println("\nChoice >>> ");
			no = getNum();
			
		}while (no < INPUT || no > END);
		
		// Res의 request에 no를 저장하고 다시 Controller로 돌아간다.
		request.put("no", no);
		
	}
	
	
}
