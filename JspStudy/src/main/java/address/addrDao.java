package address;

import java.util.ArrayList;

public class addrDao {
	ArrayList<addrBean> v = new ArrayList<>();
	
	public void insertAddr(addrBean abean) {
		//새로운 주소록 데이터 저장(빈즈 클래스 단위로)
		v.add(abean);
	}
	
	public ArrayList<addrBean> getAllAddr(){
		//전체 주소록 데이터의 주소 리턴
		return v;
	}
}

