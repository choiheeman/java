package org.comstudy21.model;

import java.util.ArrayList;



public class Dao {
	
	private ArrayList<People> list = new ArrayList<People>();
	private static int sequence = 1;
	{
		list.add(new People(sequence++, "kim", "010-1111-1111" ," 청주시 상당구"));
		list.add(new People(sequence++, "Kang", "010-2222-2222" ," 청주시 흥덕구"));
		list.add(new People(sequence++, "goo", "010-3333-3333" ," 청주시 모충동"));
		list.add(new People(sequence++, "lee", "010-4444-4444" ," 청주시 명암동"));
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
