package org.comstudy21.model;

import java.util.ArrayList;



public class Dao {
	
	private ArrayList<People> list = new ArrayList<People>();
	private static int sequence = 1;
	{
		list.add(new People(sequence++, "kim", "010-1111-1111" ," û�ֽ� ��籸"));
		list.add(new People(sequence++, "Kang", "010-2222-2222" ," û�ֽ� �����"));
		list.add(new People(sequence++, "goo", "010-3333-3333" ," û�ֽ� ���浿"));
		list.add(new People(sequence++, "lee", "010-4444-4444" ," û�ֽ� ��ϵ�"));
	}

	public void insert(People dto) {
		dto.setIdx(sequence++);
		list.add(dto);
		
	}
	public ArrayList<People> selectAll(){
		// ArrayList<People> list = new ArrayList<People>();
		return list;
	}
}
