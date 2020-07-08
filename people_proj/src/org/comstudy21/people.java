package org.comstudy21;

// �ٸ� ��Ű���� Ŭ������ import �Ѵ�.
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

	// �ڵ� ȣ��ȴ�.
		@Override
		public String toString() {
			return "(number=" + number + ", name" + name + ")";
		}

	}

	public class day13Ex03 {

		public static void main(String[] args) {
			// import Ŭ������ Ŭ���� �̸������� ��� ����
		
			People p1 = new People("ȫ�浿");
			People p2 = new People("��浿");
			People p3 = new People("�̼���");
			// �̸� �޴� �����ڰ� �ʿ��ϴ�

			System.out.println(p1); // (number = 1, name = ȫ�浿)
			System.out.println(p2); // (number = 2, name = ��浿)
			System.out.println(p3); // (number = 3, name = �̼���)
			People.showSequence(); // sequence=> 4
			// " showSequence "static
		}

	}

}
