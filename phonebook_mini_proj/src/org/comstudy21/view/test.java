package org.comstudy21.view;


// abstract �߻� Ŭ����
abstract class Person{
	abstract void eatRice();
	abstract void sleep();
	abstract void breathe();
	
}

class Woman extends Person {

	@Override
	void eatRice() {
		
		System.out.println("������ ���� �Դ´�");
	}

	@Override
	void sleep() {
		
		System.out.println("������ �����ܴ�");
	}

	@Override
	void breathe() {
		System.out.println("������ �Ѽ��� ����");
		
	}
}
	
	class Man extends Person{

		@Override
		void eatRice() {
			System.out.println("��ȣ�� ���� �Դ´�");
			
		}

		@Override
		void sleep() {
			System.out.println("��ȣ�� ���� �ܴ�");
			
		}

		@Override
		void breathe() {
			System.out.println("��ȣ�� ���� ����.");
			
		}
		
	}
	


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Woman minji = new Woman();
		Man youngho = new Man();
		
		minji.eatRice();
		minji.sleep();
		minji.breathe();
		
		youngho.eatRice();
		youngho.sleep();
		youngho.breathe();
	}

}

