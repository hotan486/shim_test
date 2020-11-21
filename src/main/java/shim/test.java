package shim;

public interface test {
	
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
		
	}
}
