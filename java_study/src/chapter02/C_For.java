package chapter02;

// 반복문
// : 어떤 작업을 반복적으로 실행하고 싶을 때 사용

// 종류
// for, while, do-while문
public class C_For {
	public static void main(String[] args) {
		// for문
		// : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
		// >> 횟수가 정해져 있을 때
		
		/*
		 	for(초기화; 조건; 증감) {조건이 만족될 대 실행할 코드}
 		 */
		for(int num = 1; num <= 5; num++) {
			System.out.print(num);
		}
		// 12345
		System.out.println(); // 한줄 띄우기 용
//		== 예제 ==
		System.out.print("짝수: ");
		
		for(int i = 1; i<= 10 ; i++) {
			if(i%2 == 0) {
				System.out.print( i+ " ");
			}
		}
		
		System.out.println();
//		== for 반복문을 사용하여 구구단을 일부를 출력하는 코드 ==
//		EX) 3단
		int num = 3;
		
		for(int i = 1 ; i < 10 ; i++) {
//			3 X 1 = 3
			System.out.println(num + "X" + i + "=" + num * i);
		}

//		== 중첩 반복문을 사용하여 구구단 전체를 출력하는 코드 == 
		System.out.println("==구구단==");
		for(int i = 0; i < 8;  i++) {
			int dan = i + 2; // dan: 2 ~ 9
			System.out.println("[" + dan + "단]"); // [2단]
			
			for(int j = 0; j < 9; j++) {
				int number = j + 1; // number: 1 ~ 9
				System.out.println(dan + "X" + number + "=" + dan * number);
			}
		}
	}
}
