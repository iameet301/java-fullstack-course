

public class College {
	String collegeName;
	String collegeAddress;
	static String university="sppu";
	
	public void printCollegeData() {
		
		
		collegeName="vtcbcsr";
		System.out.println(collegeName);
		
		
		collegeAddress="bardoli";
		System.out.println(collegeAddress);
		
		System.out.println(university);
		
	}
	public static String getCollegeAddress() {
		College c=new College();
		c.collegeAddress="Kharadi";
		
		return c.collegeAddress;
	}
	public College getCollegeData() {
		College c=new College();
		c.collegeName="hello";
		c.collegeAddress="surat";
		return c;
		
		
	}

}
