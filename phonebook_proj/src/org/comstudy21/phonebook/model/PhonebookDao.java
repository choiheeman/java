package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	private ArrayList<PhonebookDto> dtoList;
	private int seq = 1;
	public PhonebookDao(ArrayList<PhonebookDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PhonebookDto(seq++, "kim", "010-1111-1111", "kim@a.com"));
		this.dtoList.add(new PhonebookDto(seq++, "lee", "010-2222-2222", "lee@a.com"));
		this.dtoList.add(new PhonebookDto(seq++, "park", "010-3333-3333", "park@a.com"));
	}

	public void insert(PhonebookDto dto) {
		System.out.println(">>>> DAO");
		System.out.println(dto);
		dtoList.add(dto);
	}

	public ArrayList<PhonebookDto> selectAll() {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i=0; i<dtoList.size(); i++) {
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
			list.add(newDto);
		}
		return list;
	}

	public ArrayList<PhonebookDto> select(PhonebookDto origialDto) {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i=0; i<dtoList.size(); i++) {
			String sName = origialDto.getName();
			if(sName.equals(dtoList.get(i).getName())) {
				PhonebookDto dto = dtoList.get(i);
				int idx = dto.getIdx();
				String name = dto.getName();
				String phone = dto.getPhone();
				String email = dto.getEmail();
				PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
				list.add(newDto);
			}
		}
		return list;
	}

	public void update(PhonebookDto dto) {
		// idx가 같은 요소를 dto로 교체한다.
		for(int i = 0; i<dtoList.size(); i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.set(i, dto);
				return;
			}
		}
		
	}
	
	

}





//�떛湲��넠 - �씠 �겢�옒�뒪�쓽 媛앹껜�뒗 �삤吏� �븯�굹肉먯씠�떎.
//	private PhonebookDao() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	private static PhonebookDao instance = null;
//	
//	public static PhonebookDao getInstance() {
//		if(instance == null) {
//			instance = new PhonebookDao();
//		}
//		return instance;
//	}
//	
//	public void setDtoList(ArrayList<PhonebookDto> dtoList) {
//		this.dtoList = dtoList;
//	}
