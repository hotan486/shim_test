package shim;

public class OOPMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chapter 13 Object-oriented programming 
		
		/*
		 * ==========================================
		 *  기본 특징 과 성질 변형 방법 
		 */
		
		
		// 객체를 생성한다. 
		Character character = new Character();		
		Character.hp = 30;
		
		
		// 같은 객체는 없다. 
		Character character2 = new Character();
		Character character3 = new Character();

	    System.out.println(character2 == character3); // false
	    System.out.println(character2.equals(character3)); // false
	    System.out.println(character3.hashCode() == character2.hashCode()); // true

	    // 앝은 복사 > 주소를 복사 같은 값을 공유 
	    // 깊은 복사 > 객체 자체를 복사해서 값은 같지만 서로 다른 개체를 만듬 
	    
	    // 객체는 대소를 비교 할수없다.
	    
		// 연산자 오버로딩은 없다.
		
		
		// 객체를 전송 할수 없다. jvm 에서 메모리 관리 > 멤버필드를 직렬화해서 데이터만 보내 빈 객체에서 전송 값만 대입 
		// https://woowabros.github.io/experience/2017/10/17/java-serialize.html
		
		// 상속나 인터페이스 쿠현은 계층구조르 만든다. 캐릭터  - 가렌
		//	 									 - 애쉬
		//                                       - 쉔

		
		
		/*
		 * ==========================================
		 *  객체지향의 특징 
		 */
		
		// 추상성 객체를 간단하게 설명, 구체적인 구현을 숨김 > 캐릭터 - 머리, 다리, 몸통, 팔 
		// 다형성 한부모의 타입으로 여러 종류의 자식을 생성, 부모ㄱ의 메서드가 자식에 따라 다양한 다양한 자식의 메서드를 호출
		// 상속성 -> 부모 것은 내것 , 부모의 멤버(필드, 메서드)는 자식 것이다. 단, 생성자와 private 멤버는 제외 
		// 은닉성 중요한 멤버필드를 숨긴다.
		
		
		
		
		/*
		 * ==========================================
		 *  메모리 특징 
		 */
		
		// 자식을 생성하면 부모도 생성된다. > 부모가 먼저 생성된다. 클래스를 의미 힙영역에 저장
		// 자식의 설계도를 선언하면 부모의 설계도도 선언된다. > 맴버 필드를 의미 스택 영역에 저장 
		// 생성된 주소는 부모의 주소다. > 배열도 선언시 가장 앞주소가 그 배열의 주소 
		// 설계도에 공개된 메소드만 사용할수 있다. > 부모에 선언된 메서드 다운 캐스팅 
	    //	
		
		
		
		
		/*
		 * ==========================================
		 *  다형성의 원리 
		 */
		
		// 부모타입으로 자식을 생성할 수 있다.
		// Character char = new Aeswi(); // 애쉬
		// Character char = new Galen(); // 가렌
		
		// 부모의 타입으로 자식을 받을 수 있다.
		// Character char = new Character(); // 애쉬
		// char = new Aeswi(); // 애쉬
		
		// 부모의 머세드로 자식의 메서드를 호출할 수잇다. //오버라이딩(업 케스팅)
		
		// class  Character{attack(//주먹다짐 공격);}
		// class  Aeswi{@Override attack(//칼로 공격);}
		// class  Galen{@Override attack(//활로 공격);}
		
		// Character char = new Galen(); 
		// char.attack(//칼로 공격);
	}

}
