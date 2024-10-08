package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

// 배열: 배열의 주소값이 담겨있다
public class B_List {
	public static void main(String[] args) {
		// == List 인터페이스의 주요 메서드 == 
		
		// 1. ArrayList 사용 예시
		System.out.println("=== ArrayList ===");
		
		// - new 생성잘르 사용하여 ArrayList 객체를 생성
		// >> 일반 데이터 타입X, "클래스 객체 데이터" 타입
		// EX) String, Number, Boolean 등
		
		// 컬렉션명<객체데이터> 변수명 = new 컬렉션명<객체데이터>();
		ArrayList<String> strArray = new ArrayList<String>();
		
		System.out.println(strArray.size());  // 0
		
		strArray.add("JAVA");
		strArray.add("PYTHON");
		strArray.add("JS");
		strArray.add("TS");
		
		System.out.println(strArray.size()); // 4
		System.out.println(strArray);  // [JAVA, PYTHON, JS, TS]
		
		strArray.add(1, "REACT");
		System.out.println(strArray); // [JAVA, REACT, PYTHON, JS, TS]

		String element = strArray.get(1);
		System.out.println(element); // REACT
		
		System.out.println(strArray.remove(1)); // REACT
		System.out.println(strArray); // [JAVA, PYTHON, JS, TS]
		
		System.out.println(strArray.set(1, "C++")); // PYTHON
		System.out.println(strArray); // [JAVA, C++, JS, TS]
		
		// == 2. LinkedList 사용 예시 ==
		System.out.println("=== LinkedList ===");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		
		System.out.println(linkedList); // [Apple, Banana, Orange]
		
		linkedList.add(1, "Mango");
		System.out.println(linkedList); // [Apple, Mango, Banana, Orange]
		
		String fruitElement = linkedList.get(2);
		System.out.println(fruitElement); // Banana
		
		String isFruit1 = "Orange";
		String isFruit2 = "Strawberry";
		
		System.out.println(linkedList.contains(isFruit1)); // true
		System.out.println(linkedList.contains(isFruit2)); // false
		
		linkedList.clear();
		System.out.println(linkedList); // []
		
		// cf) List 컬렉션 프레임워크 사용 시 유의사항
		
		// 1. get, remove, set 메서드 사용 시
		// : 인덱스 번호를 사용하는 메서드
		// >> 인덱스 번호가 유효한지 검사 (유효하지 않은 경우 IndexOutofBounds 예외)
		
	}
}
