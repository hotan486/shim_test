package shim;

public class java {

	public static void main(String[] args) {

		//type();
		
		
		java_basic();
	}
	
	public static void java_basic() {
		
		//순차실행
		//순서제어 
		//반복제어
		//위를 이용하여 문제를 해결하는것 -> 알고리즘 
		
		//주석 
		
		// 한줄 일 경우
		
		/* 여러줄 일 경우
		 * 
		 * 
		 * 
		 * */
		
		// 조건문 
		
		
	}
	
	
	public static void type() {
		
		// 1. 데이터의 특징에 맞추어 타입을 선택하여 사용한다.
		// 2. 자바는 왼쪽에서 오른쪽, 위에서 아래로 실행된다.(순차실행)
		// 3. 실행의 흐름을 나누거나(분기 조건) 합치거나 반복하여 적은 코트로  
		// 원하는 데이터를 가공하는 프로그램 
		
		
		int attack = 20;
		int weaponattack = 20;
		int defense = 10;
		
		int monsterHp = 20;
		int monsterDefense = 10;
		
		System.out.println("공격력 : "+attack);
		System.out.println("방어력 : "+defense);
		
		System.out.println("몬스터 체력 : "+monsterHp);
		System.out.println("몬스터 방어력 : "+monsterDefense);
		
		boolean weaponMountingYn = true;
		
		String weaponMounting = (weaponMountingYn == false)?"미착용":"착용";
		
		System.out.println("무기 착용 여부 : " + weaponMountingYn);
		System.out.println("무기 착용 여부 : " + weaponMounting);
				
		char grade = 'S';
		
		System.out.println("무기 등급 : " + grade + "급");
		
		double ERA = 100/(100 + (double)monsterDefense);
		double damages = ((double)attack + (double)weaponattack) * ERA;
		
		System.out.println("방어율 : " + String.format("%.2f", ERA));
		System.out.println("데미지 : " + String.format("%.2f", damages));
		
		String monsterName = "슬라임";
		
		System.out.println("몬스터 이름 : " + monsterName);
		
		//변수에 알맞은 타입을 생성해야 한다. (공간에 크기를 알맞게 정해야 한다)
		//기본타입 
		

		System.out.println("---=== 기본 타입 ===---");
		
		System.out.println("=== Byte ===");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("=== Short ===");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println("=== Integer ===");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("=== Long ===");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println("=== Float ===");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("=== Double ===");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println("=== Boolean ===");
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("=== Character ===");
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		//참조타입
		Weapon weapon = new Weapon();
		
		System.out.println("---=== 참조 타입 ===---");
		
		weapon.setWeaponattack(50);
		System.out.println("무기 공격력 : " + weapon.getWeaponattack());
		
	}
}
