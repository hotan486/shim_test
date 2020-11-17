package race.dmain;

import race.dmain.motor.Motor;

public class Car {
	
	private static final int START_POSITION = 1;
	private static final int LIMIT_ENABLE_MOVE_POSITION = 4;
	
	private String name; 
	private Motor motor;
	private int position;
	
	public Car(String name, Motor motor) {
		
		this.name = name;
		this.motor = motor;
		
	}
	
	public void move() {
		
		int pos = motor.move();
		
		if(pos > LIMIT_ENABLE_MOVE_POSITION) {
			
			this.position = START_POSITION;
			return;
			
		}
		
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	
	
		
	
	
}
