package chapter04;

// 클래스 생성 (Book, Person, ...)
class Player {
	String user;
	String job; // 직업
	int level; // 레벨
	
	void displayInfo() {
		System.out.println( user + "의 직업은 " + job + " 레벨은 " + level);
	}

	Player(String playName, String job, int level) {
		user = playName;
		this.job = job;
		
		this.level = level;
	}
}

public class Object04_1 {
	public static void main(String[] args) {
		// 위에서 정의한 클래스를 사용하여 객체 인스턴스화
	Player play1 = new Player("player1","전사", 55);
	Player play2 = new Player("player2","마법사", 45);
	Player play3 = new Player("player3","궁수", 50);
	
		// 속성 출력
	System.out.print(play1.user);	
	System.out.print(play1.job);	
	System.out.print(play1.level);
	System.out.println();
	System.out.print(play2.user);	
	System.out.print(play2.job);	
	System.out.print(play2.level);
	System.out.println();
	System.out.print(play3.user);	
	System.out.print(play3.job);	
	System.out.print(play3.level);
	System.out.println();
		// 메서드 호출
	
	
	play1.displayInfo();
	play2.displayInfo();
	play3.displayInfo();
	System.out.println(play1.user+ "레벨이 올랐다");
	
	play1.level = 100;
	System.out.println(play1.level + "이 되었다");
	}
}	
