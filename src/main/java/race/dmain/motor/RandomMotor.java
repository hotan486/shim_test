package race.dmain.motor;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMotor implements Motor {

	private static final int BOUND = 10;
	private static final Random random = ThreadLocalRandom.current();
	
	@Override
	public int move() {
		// TODO Auto-generated method stub
		return random.nextInt(BOUND);
	}

	
}
