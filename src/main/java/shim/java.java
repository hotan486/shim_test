package shim;

import java.util.Random;

public class java {

	public static void main(String[] args) {

		//type();
		
		
		//java_basic(); //호출
		
		character();
		
		
	}
	
	
	
	//선언
	@SuppressWarnings("unused")
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
		
		boolean weaponMountingYn = true;
		
		String weaponMounting = (weaponMountingYn == false)?"미착용":"착용";
		
		if(!weaponMountingYn)
			weaponMounting = "미착용";
		else
			weaponMounting = "착용";
		
		System.out.println("무기 착용 여부 : " + weaponMountingYn);
		System.out.println("무기 착용 여부 : " + weaponMounting);

		
		Random random = new Random();
		
		float gradeNumber = random.nextInt(6) + 1;
		
		String grade = null;
		
//		
//		if(gradeNumber >= 6.0) {			
//			grade = "S";
//		}else if(gradeNumber >= 5.0) {
//			grade = "A";
//		}else if(gradeNumber >= 4.0) {
//			grade = "B";
//		}else if(gradeNumber >= 3.0) {
//			grade = "C";
//		}else if(gradeNumber >= 2.0) {
//			grade = "D";
//		}else if(gradeNumber >= 1.0) {
//			grade = "E";
//		}
		
		switch ((int)gradeNumber) {
		case 6:
			grade = "S";
			break;
		case 5:
			grade = "A";
			break;
		case 4:
			grade = "B";
			break;
		case 3:
			grade = "C";
			break;
		case 2:
			grade = "D";
			break;
		case 1:
			grade = "E";
			break;

		default:
			break;
		}
		
		System.out.println("무기 등급 : " + grade + "급");
		
		
		
		float criticalAttackPercent = 0;
		
//		for(int i= 0;i<10;i++) {
//			
//			criticalAttackPercent = random.nextInt(100) + 1;
//			
//			if(criticalAttackPercent <= 20) {
//				System.out.println(criticalAttackPercent+"%로 크리티컬 공격에 성공했습니다.");
//			}else {
//				System.out.println(criticalAttackPercent+"%로 크리티컬 공격에 실패했습니다.");
//			}
//		}
		
		int i = 0;
		
		while(i<10) {
			
			criticalAttackPercent = random.nextInt(100) + 1;
			
			if(criticalAttackPercent <= 20) {
				System.out.println(criticalAttackPercent+"%로 크리티컬 공격에 성공했습니다.");
			}else {
				System.out.println(criticalAttackPercent+"%로 크리티컬 공격에 실패했습니다.");
			}
			
			i++;
		}
		
		
		
		// 연산관용어구
		int a = 6009;
		
		if(a%3 == 0) { // 012 
			// 나누어 떨어진다
			// a는 3의 배수 
			// 3은 a의 약수			
		}
		
		if(a%2 == 0) { // 01
			// 모든 짝수			
		}
		
		if(a%2 == 1) { // 01
			// 홀수			
		}
		
		int b = a%10; //일의 자리
		
		System.out.println(b);
		
		b = a/10; //자릿수 줄이기
		
		System.out.println(b);
	
		
		
		
	}
	
	public static void character() {
		
		String city1 = "Asia";
		String city2 = "Europe";
		
		int number = 0;
		
		// 기본 타입은 메서드를 갖지 않지만 
		// String은 new를 사용하지않고 생성하는 참조 타입으로 메서드를 갖는다.
		
		
		
		//city2 = city1;
		
		
		System.out.println(city1.length());
		String city3 = String.format("%s-%s", city1,city2);
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		
		// 배열 
		int[] num2 = {1,2,3};
		//num2 = {1,2}; //초기화 불가
		//num2 = new int[6];
		//num2[0] = 2;
		
		for (int i : num2) {
			System.out.println(i);
		}
		
		int intSize = 8;
		
		int[] lotto = new int[intSize]; // 0,0,0,0,0,0 초기화
		
		
		lotto[0] = 2;
		lotto[1] = 2;
		lotto[2] = 2;
		lotto[3] = 2;
		lotto[4] = 2;
		lotto[5] = 2;
		lotto[6] = 2;
		
		for (int i : lotto) {
			System.out.println(i);
		}
		
		lotto = new int[9]; 
		
		for (int i : lotto) {
			System.out.println(i);
		}
		
		String[] myNum = new String[6];
		myNum[0] = "학교";
		myNum[2] = "학교";
		myNum[1] = "학교";
		myNum[3] = "학교";
		myNum[4] = "학교";
		myNum[5] = "학교";
		
		for (String i : myNum) {
			System.out.println(i);
		}
		
		
		// 문자열 메서드 
		
		String text = "hello";
		
		// 자리의 문자 
		char c = text.charAt(0);
		System.out.println(c);
		
		// 문자열 더하기 
		String text1 = text.concat(" world");
		System.out.println(text1);
		
		// 해당 문자열 포함 여부
		boolean text2 = text1.contains("world");
		System.out.println(text2);
		
		text2 = text1.equals(text);
		System.out.println(text2);
		
		
		text = "ABC";
		text1 = "abc";
		
		text2 = text1.equalsIgnoreCase(text);
		System.out.println(text2);
		
		int num = text.indexOf("D");
		System.out.println(num);
		
		text = " ABC ";
		
		String trimText = text.trim();
		System.out.println(text);
		System.out.println(trimText);
		int len = trimText.length();
		System.out.println(len);
		
		String substringText = trimText.substring(1);
		System.out.println(substringText);
		
		substringText = trimText.substring(1,2);
		System.out.println(substringText);
		
		//CharSequence target
		substringText = text.replace(" ","-");
		System.out.println(substringText);
		
		//String regex  정규식으로 표현이 가능하다 
		substringText = text.replaceAll(" ","=");
		System.out.println(substringText);
		
		text = text.toUpperCase();
		System.out.println(text);
		
		
		text = text.toLowerCase();
		System.out.println(text);
		
		String[] texts = text.split("");
		
		for (String string : texts) {
			System.out.println(string);
		}
		
		
		// 수학 메서드
		Double sin = Math.sin( 30 * Math.PI / 180); 
		Double cos = Math.cos( 30 * Math.PI / 180); 
		Double a = Math.toRadians(90);
		System.out.println(sin);
		System.out.println(cos);
		System.out.println(a);
		
		//Double a = Math.sq(90);
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
		//System.out.println((int)Character.MIN_VALUE);
		//System.out.println((int)Character.MAX_VALUE);
		
		//참조타입
		Weapon weapon = new Weapon();
		
		System.out.println("---=== 참조 타입 ===---");
		
		weapon.setWeaponattack(50);
		System.out.println("무기 공격력 : " + weapon.getWeaponattack());
		
	}
}
