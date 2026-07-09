package javacom.example.finish;

public class Thread1 extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
