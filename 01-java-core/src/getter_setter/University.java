package getter_setter;

public class University {
	int universityId;
	String universityname;
	
	College College;
	public University(int universityId, String universityname, getter_setter.College college) {
		super();
		this.universityId = universityId;
		this.universityname = universityname;
		College = college;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public College getCollege() {
		return College;
	}

	public void setCollege(College college) {
		College = college;
	}

	

	
	
}
