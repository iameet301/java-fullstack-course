package getter_setter;

public class Test {
    
    public void getData(Student... s) {
    	System.out.println("this method get called");
        
    }

    public static void main(String[] args) {
        Student s1 = new Student(2301, "Meet");
        Student s2 = new Student(2302, "Rahul");
        Student s3 = new Student(2303, "Amit");
        Test t = new Test();
        t.getData(s1,s2,s3);

    }
}
