package shim;

public class MathMain {
	
	public static void main(String[] args){
		
		String slat = "37.52127220511242";
		//String slat = "hello";
		
		// trim 공백 제거 
		// Double.parseDouble 더블으로 변환
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
		
		/*
		 * 0 < random < 10 
		 * */
		
		int makeOne = (int)(Math.random()*10);
		// 0 ~ 9 사이 정수 
		System.out.println(makeOne);
	}	
	
}
