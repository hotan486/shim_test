package shim.java200.c25;
import java.util.Scanner;
import shim.java200.view.View;

public class InputConsolePrint {

	private static final Scanner scanner = new Scanner(System.in);
	
	public void InputConsolePrint() {
		
		System.out.println("정수를 입력하세요.");
		int choice = scanner.nextInt();
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = scanner.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열를 입력하세요.");
		String schoice = scanner.next();
		System.out.println(schoice);
		
	}
	
	
	
	
}
