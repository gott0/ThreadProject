package ThreadPackage;

public class Count extends Thread{//Thread Ŭ������ ����ؼ� ����

	@Override
	public void run() {//Thread ���� �� �ݵ�� run�޼ҵ� �������̵�
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
