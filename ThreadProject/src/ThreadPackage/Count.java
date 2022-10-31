package ThreadPackage;

public class Count extends Thread{//Thread 클래스를 상속해서 형성

	@Override
	public void run() {//Thread 실행 시 반드시 run메소드 오버라이딩
		
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
