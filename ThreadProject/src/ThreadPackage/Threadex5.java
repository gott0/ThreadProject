package ThreadPackage;

public class Threadex5 extends Thread {

	@Override
	public void run() {
		for(int i=10; i<500; i++) {
			System.out.print("|");
		}
	}

}
