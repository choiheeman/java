package PhoneBook_MyUtil;

import java.io.IOException;
import java.util.Scanner;

public class MyUtil {	// 자주 사용하는 객체 반영.

	public static final Scanner scan = new Scanner(System.in);
	
	
	public static int getNum() {
		int num = 0;
		int ch = 0;
		
		try {
			while((ch = System.in.read())!='\n') {
				if(ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';	// 공식
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return num;
	}
	
}
