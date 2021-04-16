package cls;

import java.util.List;
import java.util.Scanner;

import dao.EmpDao;

import dto.EmpDto;


public class searchCls {
	Scanner sc = new Scanner(System.in);
	
	public void search() {
		System.out.print("검색 ID : ");
		String id = sc.next();
		
		
		EmpDao dao = EmpDao.getInstance();
		
		  List<EmpDto> list = dao.getList(id);
		
	        if (list != null) {

		        for (int i = 0; i < list.size(); i++) {
		        	EmpDto dto = list.get(i);
		            System.out.println(dto.toString());
		        }
	        } else {
	            System.out.println("정보를 찾을 수 없습니다.");
	        }
	 
	      
	 
	}
}
