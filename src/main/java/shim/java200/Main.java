package shim.java200;

import shim.java200.c25.InputConsolePrint;
import shim.java200.c26.BioCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//25
		//InputConsolePrint inputConsolePrint  = new InputConsolePrint();
		//inputConsolePrint.InputConsolePrint();
		
		//26
		//BioCalendar bioCalendar = new BioCalendar();
		//bioCalendar.BioCalendar();
		//27
		//bioCalendar.BioCalendar2();
		//28
		//bioCalendar.BioCalendar3();
		
		
		//41
		//boolean isS = isLeapYear(2020);
		//System.out.println(isS);
		
		//System.out.println("\n---------------------");
		
		//42
		//for(int i = 0 ; i < 101 ; i++) {		
		//	double fahrenheit = 9.0/5 * i + 32;			
		//	System.out.println(isTemperature(i, fahrenheit));
		//}
		
		//System.out.println("\n---------------------");
		
		//43
		//showOddnEvenw(122);
		
		//System.out.println("\n---------------------");
		
		//44
		//showOddnEven(122);
		
		
		System.out.println("\n---------------------");
		
		//45
		//showOddnEvenf(122);
		
		
		//66
		StringTest stringTest = new StringTest();
		stringTest.stringTest();
		
		
		
	}
	
	public static void showOddnEven(int num) {
			
		int temp = num ; 
		
		do {
		
			temp = isIfMainCondition(temp);
			
			System.out.println("[" + temp + "]");
			
		}while(isCondition(temp));
			
		System.out.println("\n---------------------");		
		
	}


	public static void showOddnEvenf(int num) {
		
		int temp = num ; 
		
		for(;isCondition(temp);) {
			
			temp = isIfMainCondition(temp);
			
			System.out.println("[" + temp + "]");
		}
		System.out.println("\n---------------------");
	}


	public static void showOddnEvenw(int num) {
		
		int temp = num ; 
		
		while(isCondition(temp)) {
			
			temp = isIfMainCondition(temp);
			
			System.out.println("[" + temp + "]");
		}
		System.out.println("\n---------------------");
	}
	
	
	public static int isIfMainCondition(int temp) {
		
		if(isIfCondition(temp)) 
			
			return temp = temp * 3 + 1;
		
		return temp/= 2;		
	}
	
	public static boolean isIfCondition(int temp) {
		return temp%2 ==1;
	}
	
	public static boolean isCondition(int temp) {
		return temp!=1;
	}
	
	
	public static String isTemperature(int i, double fahrenheit) {
		return "섭씨 " + i + "도 = 화씨 " + fahrenheit + "도"; 
	}
			
	public static boolean isLeapYear(int year) {
		
		boolean isS = false;
			
		// if문 사용
		//if((year%4==0)&&(year%100!=0)||(year%400==0)) {
		//	isS =true;
		//}
		
		// if문 없애기 
		isS = check(year);
		
		return isS;
	}

	private static boolean check(int year) {
		// TODO Auto-generated method stub
		return (year%4==0)&&(year%100!=0)||(year%400==0);
	}

}
