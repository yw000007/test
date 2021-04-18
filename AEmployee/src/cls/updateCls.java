package cls;

import java.util.Scanner;
import dao.EmpDao;


public class updateCls {
Scanner sc = new Scanner(System.in);
	
	public void update() {
		System.out.print("수정 ID 입력 :");
		String id = sc.next();
		
		System.out.print("수정 DEPT 입력 :");
		String dept = sc.next();
		
		EmpDao dao = EmpDao.getInstance();
		boolean b = dao.update(id, dept);
		if(b) {
			System.out.println("수정 되었습니다");
			
			return;
		}
		
		System.out.println("수정되지 않았습니다");
	}
}
