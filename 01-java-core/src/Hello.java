

public class Hello {
	public static void main(String[] args) {
		//first method
		College c=new College();
		c.printCollegeData();
		
		//second method
		System.out.println(College.getCollegeAddress());
		
		//third method
		College c1 =new College();
		
		College l=c1.getCollegeData();
		System.out.println(l.collegeAddress+l.collegeName);
	}
}