package ThreadPackage;

import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
		//프로그램 -> 프로세스 -> 쓰레드(멀티쓰레드)
		//모든 프로그램은 기본적으로 쓰레드가 동작 (1개 이상의 쓰레드가 있다)
		//쓰레드 만드는 방법 
		// └ 1.Thread클래스를 상속  
		//     - 클래스를 직접 생성
		// └ 2.Rinnable인터페이스를 상속 
		//     - 2번의 생성 과정을 거친다.
		//     - 클래스를 생성 후 다시 한번 Thread 클래스의 생성자를 사용해서 다시 한번 생성한다.
	
		//Thread 제어
		//Thread.sleep(1000) -> 쓰레드의 일시정지(1000 = 1초)
		//wait() -> 쓰레드의 일시 정지 / notify() -> 쓰레드를 실행 대기
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int j = 0; j < 10; j++) {
//		System.out.println(j);
//		}
		
//   ==================================================================================	
		
//	 //Count = Thread 클래스를 상속받는 경우
//		Count cnt = new Count();  
//		cnt.start();
		  //  └쓰레드 클래스 안에 있는 메소드(쓰레드 실행 시 사용)
		
//	 //Count2 = Rinnable 인터페이스를 상속받는 경우 (멀티상속의 경우 활용)
//		Runnable r = new Count2();   
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//		
//		
//		String input = JOptionPane.showInputDialog("아무값이나 입력");
//		System.out.println("입력값은" + input + "입니다");
		
//   ==================================================================================	

		//		Threadex5 th = new Threadex5();  //실행 순서를 독점하지 않는다.
//		th.start();
//		
//		for(int i=10; i<500; i++) {
//			System.out.print("-");
//		}
		
//   ==================================================================================	

		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*"); //쓰레드의 이름 부여 ex) "*"
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); // 현재 자신을 호출한 쓰레드를 sleep한다.(일시정지)
			th1.suspend(); // 쓰레드 일시정지.
			Thread.sleep(2000); //2초
			th2.suspend();
			Thread.sleep(3000); //3초
			th1.resume(); //suspend되어 있는 쓰레드를 실행대기 상태로 만듦(즉시실행X)
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop(); //th1,th2 중 누가 먼저 멈출지는 장담할 수 없다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}// main

}//class