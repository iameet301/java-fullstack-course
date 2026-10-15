package multithreading;

public class MainThread {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		try {
			t.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("byes");
	}

}
