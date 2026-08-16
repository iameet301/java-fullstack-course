package getter_setter;

public class Studentt {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentt(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
