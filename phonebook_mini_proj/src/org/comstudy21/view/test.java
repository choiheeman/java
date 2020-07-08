package org.comstudy21.view;


// abstract Ãß»ó Å¬·¡½º
abstract class Person{
	abstract void eatRice();
	abstract void sleep();
	abstract void breathe();
	
}

class Woman extends Person {

	@Override
	void eatRice() {
		
		System.out.println("¹ÎÁö°¡ ¹äÀ» ¸Ô´Â´Ù");
	}

	@Override
	void sleep() {
		
		System.out.println("¹ÎÁö°¡ ÀáÀ»ÀÜ´Ù");
	}

	@Override
	void breathe() {
		System.out.println("¹ÎÁö°¡ ÇÑ¼ûÀ» ½®´Ù");
		
	}
}
	
	class Man extends Person{

		@Override
		void eatRice() {
			System.out.println("¿µÈ£°¡ ¹äÀ» ¸Ô´Â´Ù");
			
		}

		@Override
		void sleep() {
			System.out.println("¿µÈ£°¡ ÀáÀ» ÀÜ´Ù");
			
		}

		@Override
		void breathe() {
			System.out.println("¿µÈ£°¡ ¼ûÀ» ½®´Ù.");
			
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

