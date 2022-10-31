package ThreadPackage;

public class Thread6 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()); // 현재 쓰레드의 이름을 확인하는 코드(Runnable 상속 시)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
