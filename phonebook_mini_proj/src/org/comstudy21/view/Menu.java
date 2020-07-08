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
		
		// Res�� request�� no�� �����ϰ� �ٽ� Controller�� ���ư���.
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
		
		// Res�� request�� no�� �����ϰ� �ٽ� Controller�� ���ư���.
		request.put("no", no);
		
	}
	
	
}
