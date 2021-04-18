package cls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dao.EmpDao;
import dto.EmpDto;

public class printCls {

	public void print() {
	
		
		EmpDao dao = EmpDao.getInstance();
		
		  List<EmpDto> list = dao.print();
		
	        if (list != null) {

		        for (int i = 0; i < list.size(); i++) {
		        	EmpDto dto = list.get(i);
		            System.out.println(dto.toString());
		        }
	        } else {
	            System.out.println("정보를 찾을 수 없습니다");
	        }

	}
}
