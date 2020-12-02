package shim.java200.c26;

public class BioCalendar {

	public static final int PHYSICAL = 23;
	
	public void BioCalendar(){
	
		System.out.println(PHYSICAL);
		
		int index = PHYSICAL;
		
		double vals = 2 * Math.PI / index;
		
		System.out.println(vals + " 라디안");
		
	}
	
	public void BioCalendar2(){
		
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI /index;
		
		
		System.out.println(Math.toDegrees(vals) + " 도");
	}
	
	public void BioCalendar3(){
		
		int index = PHYSICAL;
		int days = 1200;
		double phyvals = 100 * Math.sin((days % index) * 2 * Math.PI /index);
		
		
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyvals);
	}
	
}
