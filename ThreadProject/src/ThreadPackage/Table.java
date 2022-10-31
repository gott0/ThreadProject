package ThreadPackage;

import java.util.ArrayList;

public class Table {
	String [] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<String>(); //접시용도의 객체
	
	public synchronized void add(String dish) { //접시에 음식을 추가하는 메소드
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting");
			
			try {
				wait(); // wait()는 항상 synchronized(동기화)가 된 메소드에서 쓸 수 있다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		dishes.add(dish);
		notify();
		System.out.println("Dishes: " + dishes.toString());
	}
	
	public synchronized void remove(String dishName) { //고객이 음식을 먹는 (음식을 빼는)메소드
		String name = Thread.currentThread().getName();
		
		while(dishes.size() == 0) {
			System.out.println(name + " is waiting");
			
			try {
				wait(); 
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			for(int i=0; i<dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
			
			try {
				System.out.println(name + " is waiting");
				wait(); 
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
	public int dishName() {
		return dishNames.length;
	}
	
	/* 1.length
	    - arrays(int[], double[], String[])
	    - length는 배열의 길이를 알고자 할때 사용된다.
	   
	   2. length()
	    - String related Object(String, StringBuilder etc)
	    - length()는 문자열의 길이를 알고자 할때 사용된다.
	 	
	   3. size()
	    - Collection Object(ArrayList, Set etc)
	    - size()는 컬렉션프레임워크 타입의 길이를 알고자 할때 사용된다.*/

}