package race;

import java.util.Scanner;

import race.engine.RacingGame;
import race.view.InputView;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);
	
	private static void main(String[] args) {
		
		InputView inputView = input();
		
	}
	
	private static RacingGame startgame() {
		
		RacingGame racingGame = RacingGame.;
		
		return racingGame;
	}
	
	
	private static InputView input() {
		
		InputView inputView = new InputView();
		
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		inputView.inputRacer(scanner.nextLine());
		
		System.out.println("시도할 횟수는 몇 회 인가요?");
		inputView.inputTime(scanner.nextInt());
		
		return inputView;
		
	}
	
	
}
