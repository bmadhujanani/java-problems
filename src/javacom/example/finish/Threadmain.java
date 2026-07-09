package javacom.example.finish;

//public class Threadmain {
//	public static void main(String[] args) {
//		MyThreads t=new MyThreads();
//		t.start();
//	}
//
//		
//}


public class Threadmain {
	public static void main(String[] args) {
		MyThreads t=new MyThreads();
		Thread obj=new Thread(t); 
		obj.start();
	}

		
}