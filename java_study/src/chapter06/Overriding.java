package chapter06;

// =====  오버라이딩 =====
// : 자식 클래스가 부모 클래스에서 정의된 메서드를 자신의 상황에 맟게 재정의
// >> 상속 관계에 있는 클래스들 사이에서 사용

// 1. 오버라이딩 특징
// - 메서드의 시그니처(선언부)가 일치
// >> 부모 클래스에서 정의된 메서드와 동일한 이름, 매개변수 구성을 가져야 함
// - 반환 타입은 같거나 자동 형 변환이 가능한 것이어야 함 
// - @Overtide(어노테이션, 주석)
// : 오버라이딩 된 메서드임을 명시적으로 표시

// cf) 선언부
// : 반환타입 메서드명(매개변수)

// 2. 오버라이딩 구현 방법
// - 부모 쿨래스의 상속받은 메서드를 자식 클래스에 다시 정의
// - 메서드의 이름, 매개변수를 일치, 반환타입은 같거나 자동 형 변환 가능하게 작성
// - 메서드 위에 @Override 어노테이션을 작성

// 3. 오버라이딩을 사용하는 이유
// - 다형성 구현
// : 하나의 이름으로 여러 기능을 수행하는 코드 작성
// - 재사용성 확장성 향상
// : 기존 코드 변경 없이, 새로운 기능을 추가하거나 변경가능

class AnimalClass {
	void sound() {
		System.out.println("동물이 소리를 냅니다");
	}
}

class DogClass extends AnimalClass {
	// sound 메서드가 생략
	// 어노테이션
	// : 코드에 메타데이터 제공하는 방법
	
	// @Override
	// : 현재 메서드가 부모 클래스의 메서드를 오버라이딩 한다는 것을 명시
	@Override
	void sound() {
		System.out.println("개가 멍멍하고 짖습니다");
		
	}	
}

class CatClass extends AnimalClass {
	@Override
	void sound() {
		System.out.println("고양이가 야옹하고 웁니다");
	}
}

class DongClass extends AnimalClass {
	@Override
	void sound() {
		
	}
}

public class Overriding {
	public static void main(String[] args) {
		
		DongClass dong = new DongClass();
		dong.sound();
		
		AnimalClass dongmul = new AnimalClass();
		dongmul.sound();
		
		
		DogClass dog1 = new DogClass();
		dog1.sound();
		
		CatClass cat1 = new CatClass();
		cat1.sound();
		
		// 부모로 부터 상속받은 속성이나 메서드를 확장하는 개념
				// : 해당 상태나 동작을 반드시 가지지만 상속받는 클래스 마다 차이를 두고 싶을 때
				
				// == 오버로딩 VS 오버라이딩 ==
				// : 모두 메서드의 이름을 재사용하는 방법 (다형성)
				
				// 1) 오버로딩
				// - 같은 클래스 내에서 같은 이름을 가진 메서드를 여러 개 정의
				// - 메서드명이 동일, 매개변수의 타입, 개수, 순서 중 적어도 하나 이상은 달라야 함 
				// - 메서드의 동작을 다양한 상황에 맞게 조정
				
				// 2) 오버라이딩
				// - 상속 관계에 있는 클래스에서 사용
				// - 메서드의 시그니처(이름, 매개변수, 반환타입)가 같아야 함
				// - 메서드의 동작을 변경하거나 확장
				// + @Override 어노테이션을 사용 >> 컴파일러에게 전달
			}
		}