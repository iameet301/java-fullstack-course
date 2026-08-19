
public class Studentpf {
	int id;
	int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studentpf [id=" + id + ", marks=" + marks + "]";
	}
	public Studentpf(int id, int marks) {
		super();
		this.id = id;
		this.marks = marks;
	}
	public Studentpf() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
