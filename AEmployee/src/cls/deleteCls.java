package cls;

import java.util.Scanner;

import dao.EmpDao;
import dto.EmpDto;

public class deleteCls {
	
	Scanner sc = new Scanner(System.in);
		
	public void delete() {
		System.out.print("삭제 ID : ");
		String id = sc.next();
		
		EmpDao dao = EmpDao.getInstance();
		boolean b = dao.delete(id);
		if(b) {
			System.out.println("삭제 되었습니다");
			return;
		}
		
		System.out.println("삭제되지 않았습니다");
	}


}
