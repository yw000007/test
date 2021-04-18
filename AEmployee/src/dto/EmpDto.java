package dto;

/*
CREATE TABLE TB_EMPP(
    ID VARCHAR2(15) NOT NULL, --아이디
    NAME VARCHAR2(20) NOT NULL, -- 이름
    PHONE VARCHAR2(20) NOT NULL, -- 전화번호
    DEPT VARCHAR2(200) NOT NULL, -- 부서
    CONSTRAINT pk_member PRIMARY KEY(id)  
)
*/
public class EmpDto {
	private String id;
	private String name;
	private String phone;
	private String dept;
	
	public EmpDto() {
	}

	public EmpDto(String id, String name, String phone, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpDto [id=" + id + ", name=" + name + ", phone=" + phone + ", dept=" + dept + "]";
	}

	
}
