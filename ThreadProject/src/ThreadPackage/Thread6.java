package ThreadPackage;

public class Thread6 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()); // ���� �������� �̸��� Ȯ���ϴ� �ڵ�(Runnable ��� ��)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
