package ThreadPackage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private int balance = 1000; // �ܰ�
	
	         //   �� ����ȭ                              ����ݸ޼ҵ�          ��ã�±ݾ�     // ������ ������ �����ϱ� ������ ������ ���׹����̴�
	public /* synchronized */ void withdraw(int money) {  // ����ȭ : ������ ���Ѽ� ���ǰ� �Ѵ�.(����Ǵ� ������ ����)
//(����ȭ ù��°��� = �޼ҵ� ���� Ÿ�� �տ� synchronized ���̱�.����:�޼ҵ�) // (������ ��������� ����, ���� �����尡 �Ͻ����� �ϸ� ���� ������ ����)
									
		synchronized (this) { // <= ����ȭ �ι�° ��� (ù��° ������� ���� ������ �д�.����:Ŭ����)
			if (balance >= money) { 

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				balance -= money;
			}
		}
	}

}
