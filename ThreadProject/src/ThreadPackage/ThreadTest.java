package ThreadPackage;

import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
		//���α׷� -> ���μ��� -> ������(��Ƽ������)
		//��� ���α׷��� �⺻������ �����尡 ���� (1�� �̻��� �����尡 �ִ�)
		//������ ����� ��� 
		// �� 1.ThreadŬ������ ���  
		//     - Ŭ������ ���� ����
		// �� 2.Rinnable�������̽��� ��� 
		//     - 2���� ���� ������ ��ģ��.
		//     - Ŭ������ ���� �� �ٽ� �ѹ� Thread Ŭ������ �����ڸ� ����ؼ� �ٽ� �ѹ� �����Ѵ�.
	
		//Thread ����
		//Thread.sleep(1000) -> �������� �Ͻ�����(1000 = 1��)
		//wait() -> �������� �Ͻ� ���� / notify() -> �����带 ���� ���
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int j = 0; j < 10; j++) {
//		System.out.println(j);
//		}
		
//   ==================================================================================	
		
//	 //Count = Thread Ŭ������ ��ӹ޴� ���
//		Count cnt = new Count();  
//		cnt.start();
		  //  �������� Ŭ���� �ȿ� �ִ� �޼ҵ�(������ ���� �� ���)
		
//	 //Count2 = Rinnable �������̽��� ��ӹ޴� ��� (��Ƽ����� ��� Ȱ��)
//		Runnable r = new Count2();   
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//		
//		
//		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է�");
//		System.out.println("�Է°���" + input + "�Դϴ�");
		
//   ==================================================================================	

		//		Threadex5 th = new Threadex5();  //���� ������ �������� �ʴ´�.
//		th.start();
//		
//		for(int i=10; i<500; i++) {
//			System.out.print("-");
//		}
		
//   ==================================================================================	

		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*"); //�������� �̸� �ο� ex) "*"
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); // ���� �ڽ��� ȣ���� �����带 sleep�Ѵ�.(�Ͻ�����)
			th1.suspend(); // ������ �Ͻ�����.
			Thread.sleep(2000); //2��
			th2.suspend();
			Thread.sleep(3000); //3��
			th1.resume(); //suspend�Ǿ� �ִ� �����带 ������ ���·� ����(��ý���X)
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop(); //th1,th2 �� ���� ���� �������� ����� �� ����.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}// main

}//class
