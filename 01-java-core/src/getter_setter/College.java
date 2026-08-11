package getter_setter;

public class College{
	int collegeId;
	String collegeName;
	Student Student;
	public College(int collegeId, String collegeName, getter_setter.Student student) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		Student = student;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	
	
}