package ThreadPackage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private int balance = 1000; // 잔고
	
	         //   ┌ 동기화                              ┌출금메소드          ┌찾는금액     // 쓰레드 끼리는 경합하기 때문에 순서가 뒤죽박죽이다
	public /* synchronized */ void withdraw(int money) {  // 동기화 : 순서를 지켜서 사용되게 한다.(선행되는 순서는 랜덤)
//(동기화 첫번째방법 = 메소드 리컨 타입 앞에 synchronized 붙이기.범위:메소드) // (선점된 쓰레드부터 실행, 실행 쓰레드가 일시정지 하면 다음 쓰레드 실행)
									
		synchronized (this) { // <= 동기화 두번째 방법 (첫번째 방법보다 적용 범위가 넓다.범위:클래스)
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
