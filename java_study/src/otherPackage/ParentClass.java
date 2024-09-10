package otherPackage;

public class ParentClass {
	public String publicField;
	
	protected String protectedField;
	
	// == default == 
	public ParentClass() {
	// 생성자 메서드
		this.protectedField = "안녕하세요";
	}
	
	public void exampleMethod() {
		System.out.println("상속받은 클래스에서 호출 가능");
	}
}
