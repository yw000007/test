package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.EmpDto;

public class EmpDao {	

	private static EmpDao dao = null;
	
	private EmpDao() {
		DBConnection.initConnection();
	}
	
	public static EmpDao getInstance() {
		if(dao == null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	public boolean insert(EmpDto dto) {
		String sql = " INSERT INTO TB_EMPP(ID, NAME, PHONE, DEPT) "
				+ " VALUES( ?, ?, ?, ? ) ";
//		System.out.println(sql);
				
		Connection conn = DBConnection.getConnection();	
		PreparedStatement psmt = null;
		System.out.println(dto.getId());
		
		int count = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getPhone());
			psmt.setString(4, dto.getDept());
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return count>0?true:false;		
	}	

	
	 public boolean delete(String id) {
		 
	        String sql = " DELETE FROM TB_EMPP WHERE ID = '" + id + "' ";
	 
	        System.out.println(sql);
	 
	        Connection conn = DBConnection.getConnection();
	        Statement stmt = null;
	 
	        int count = 0;
	 
	        try {
	            stmt = conn.createStatement();
	            count = stmt.executeUpdate(sql);
	 
	            System.out.println("삭제되었습니다.");
	 
	        } catch (SQLException e) {
	            e.printStackTrace();
	 
	        } finally {
	 
	            try {
	                DBClose.close(conn, stmt, null);
	 
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	 
	        }
	        return count > 0 ? true : false;
	    }
	 
	 public boolean Update(String id, String dept) {
	        
	        String sql = " UPDATE TB_EMPP " + "SET DEPT = " + dept + " " + "WHERE ID = '" + id + "'";
	 
	        System.out.println(sql);
	 
	        Connection conn = DBConnection.getConnection();
	        Statement stmt = null;
	 
	        int count = 0;
	 
	        // connect
	        try {
	            stmt = conn.createStatement();
	 
	            // process
	            count = stmt.executeUpdate(sql);
	 
	            System.out.println("수정 완료입니다.");
	 
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	 
	            try {
	                DBClose.close(conn, stmt, null);
	 
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	 
	        }
	        return count > 0 ? true : false;
	    }
	 
	 public List<EmpDto> getList(String id) {
		 
	        String sql = " SELECT * " + " FROM TB_EMPP WHERE ID = ?";
	 
	        System.out.println(sql);
	 
	        Connection conn = DBConnection.getConnection();
	        PreparedStatement psmt = null;
	        ResultSet rs = null; 
	 
	        List<EmpDto> list = new ArrayList<EmpDto>();
	 
	        try {
	            psmt = conn.prepareStatement(sql);
	            psmt.setString(1, id);
	            rs = psmt.executeQuery();
	 
	            while (rs.next()) {
	                String userid = rs.getString("id");
	                String name = rs.getString("name");
	                String phone = rs.getString("phone");
	                String dept = rs.getString("dept");
	 
	                EmpDto dto = new EmpDto(userid, name, phone, dept);
	 
	                list.add(dto);
	 
	            }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            DBClose.close(conn, psmt, rs);
	        }
	        return list;
	    }
	 
	 
	 public List<EmpDto> print() {
		  String sql = " SELECT * " + " FROM TB_EMPP ";
		  
	        System.out.println(sql);
	 
	        Connection conn = DBConnection.getConnection();
	        PreparedStatement psmt = null;
	        ResultSet rs = null; // DB로부터 결과를 리턴받는 값
	 
	        List<EmpDto> list = new ArrayList<EmpDto>();
	 
	        try {
	            psmt = conn.prepareStatement(sql);
	            rs = psmt.executeQuery();
	 
	            while (rs.next()) {
	                String userid = rs.getString("id");
	                String name = rs.getString("name");
	                String phone = rs.getString("phone");
	                String dept = rs.getString("dept");
	 
	                EmpDto dto = new EmpDto(userid, name, phone, dept);
	 
	                list.add(dto);
	 
	            }
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            DBClose.close(conn, psmt, rs);
	        }
	        return list;
	 
	}

	
	
}





