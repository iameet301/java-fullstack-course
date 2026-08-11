package getter_setter;

public class Student {
	int StudentId;
	String StudentName;
	public Student(int studentId, String studentName) {
		super();
		StudentId = studentId;
		StudentName = studentName;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
