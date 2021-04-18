package cls;

import java.util.Scanner;
import dao.EmpDao;
import dto.EmpDto;


public class insertCls {

	Scanner sc = new Scanner(System.in);
	
	public void insert() {
		System.out.print("ID :");
		String id = sc.next();
		
		System.out.print("NAME :");
		String name = sc.next();
		
		System.out.print("PHONE :");
		String phone = sc.next();
		
		System.out.print("DEPT :");
		String dept = sc.next();
		
		EmpDao dao = EmpDao.getInstance();
		boolean b = dao.insert(new EmpDto(id, name, phone, dept));
		if(b) {
			System.out.println("추가 되었습니다");
			return;
		}
		
		System.out.println("추가되지 않았습니다");
	}
}

