package org.comstudy21;

// 다른 팩키지의 클래스를 import 한다.
import org.comstudy21.day13_2.People;

public class people {
	class People {
		private int sequence = 1;
		private int number;
		private String name;

		public People(String name) {
			this.name = name;
			number = sequence++; // static

		}

		public static void showSequence() {
			System.out.println("sequence => " + sequence);
		}

	// 자동 호출된다.
		@Override
		public String toString() {
			return "(number=" + number + ", name" + name + ")";
		}

	}

	public class day13Ex03 {

		public static void main(String[] args) {
			// import 클래스는 클래스 이름만으로 사용 가능
		
			People p1 = new People("홍길동");
			People p2 = new People("김길동");
			People p3 = new People("이순신");
			// 이름 받는 생성자가 필요하다

			System.out.println(p1); // (number = 1, name = 홍길동)
			System.out.println(p2); // (number = 2, name = 김길동)
			System.out.println(p3); // (number = 3, name = 이순신)
			People.showSequence(); // sequence=> 4
			// " showSequence "static
		}

	}

}
