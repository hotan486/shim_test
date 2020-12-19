package shim.java200;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class StringTest {

	public void stringTest() {
				
		
		
		//chaper66();
		chaper67();
		//chaper68();
		//chaper69();
		//chaper70();
		
	}
	
	void chaper66() {
		
		// 66 
		String city1 = "Asia"; // city1 스택에 저장  "Asia" -> 힙 
		String city2 = "Europe";
		String city3 = new String("Asia");
		
		String city10 = new String("Asia");
		String city7 = "Asia";
		Car car = new Car();
		Car car1 = new Car();
		
		int sdf = 1;
		
		
		
		System.out.println(car.hashCode() == car1.hashCode()); //주소가 같은지 -> 
		System.out.println(car.hashCode());
		System.out.println(car1.hashCode());
		
		System.out.println(city3.hashCode() == city10.hashCode());
		
		System.out.println(city3.hashCode());
		System.out.println(city10.hashCode());
		
		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1 == city2);
		System.out.println(city1.equals(city2));
		
		
		System.out.println(city1 == city3);
		System.out.println(city1 == city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city7));
		
		String city4 = String.format("%s-%s", city1,city2);
		System.out.println(city4);
		
		String city5 = city1 + "-" + city2 + 1 + 2;
		System.out.println(city5);
		
		String city6 =  1 + 2  + city1 + "-" + city2;
		
		System.out.println(city6);
	}
	
	void chaper67() {
		String text=" Hello Java4Android";
		String com=" HEllo Java4Android";
		
		System.out.println(text.charAt(1));
		System.out.println(text.concat("s"));
		System.out.println(text.contains("And"));
		System.out.println(text.equals(com));
		System.out.println(text.equalsIgnoreCase(com));
		System.out.println(text.indexOf("a"));     //'a'
		System.out.println(text.lastIndexOf("a")); //'a'
		System.out.println(text.trim());
		System.out.println(text.length());
		System.out.println(text.substring(7));
		System.out.println(text.substring(7,11));
		System.out.println(text.replace(" ","-"));//replaceAll
		System.out.println(text.replaceAll(" ","-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		String[] sp=text.split(" ");
		for(int i=0; i<sp.length; i++){
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
		}
	}
	
	
	void chaper68() {
		
		Object obj1=new Object();
		try {
			//Class classes=obj1.getClass();
			Class classes=Class.forName("java.lang.String"); // ClassNotFoundException 
			System.out.println("--------------Method 李얘린----------------");
			Method[] mes =classes.getDeclaredMethods();
			for(Method me:mes){
				if(me.getModifiers()>4000){continue; }    //  4000珥덇낵硫�  �떎�쓬 �뒪�뀦
				System.out.printf("%s\t\t",toModi(me.getModifiers()));  // �젣�븳�옄 醫낅쪟
				System.out.printf("%-30s\t\t",toRe(me.getReturnType().toString())); // 由ы꽩 醫낅쪟
				System.out.printf("%s",me.getName()); // �겢�옒�뒪 �씠由�
				System.out.printf("(",""); // 2媛� �씠�긽�씪 �븣 ,濡� �몴�떆
				Class [] aa=me.getParameterTypes(); // �븘洹쒕㉫�듃(�씤�옄, �뙆�씪硫뷀꽣)
				for(int j=0; j<aa.length ; j++){
					System.out.printf("%s",toRe(aa[j].getName()));  // �븘洹쒕㉫�듃�쓽 �씠由�
					if(j!=aa.length-1){   // 2媛� �씠�긽�씠硫�
						System.out.print(",");
					}
				}
				System.out.printf(")", "");
				System.out.println();
			}
			System.out.println("--------------�깮�꽦�옄 李얘린----------------");
			Constructor [] constructor = classes.getDeclaredConstructors();
			for(Constructor con: constructor){
				System.out.print(con.getName());
				System.out.printf("(","");
				Class [] aa=con.getParameterTypes();
				for(int j=0; j<aa.length ; j++){
					System.out.printf("%s",toRe(aa[j].getName()));
					if(j!=aa.length-1){
						System.out.print(",");
					}
				}
				System.out.printf(")","");
				System.out.println();
			}
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		} 
		 
	}
	
	public static String toModi(int n){
		String s="";
		switch(n){
		    case 0 : s=" ";break;
		    case 1 : s="public ";break;
		    case 2 : s="private ";break;
		    case 4 : s="protected ";break;
		    case 8 : s="static ";break;
		    case 10 : s="private static ";break;
		    case 9 : 
		    case 137 : s="public static ";break;
		    case 17 : s="public final ";break;
		    case 257 : s="public  native ";break;
		    case 260 : s="protected native ";break;
		    case 273 : s="public final native ";break;
		    default : s="xxxx"; break;
		}
		return s;
	 }
	 public static String toRe(String msg){
		String s="";
		if(msg.indexOf("[")!=-1){
			if(msg.contains("[C")){ 
				s=msg.substring(msg.indexOf(" ")+1).trim();
				s=s.replace("[C", "char[] ");
			}else if(msg.contains("[L")){ 
				s=msg.substring(msg.indexOf(" ")+1).trim();
				s=s.replace("[L", "").replace(";", "");
				s=s.concat("[]");
			}else if(msg.contains("[B")){ 
				s=msg.substring(msg.indexOf(" ")+1).trim();
				s=s.replace("[B", "byte[] ");
			}
		}else if(msg.indexOf(" ")!=-1){
			s=msg.substring(msg.indexOf(" ")+1).trim();
		}else{
			s=msg.trim();
		}
		return s;
	 }
	 
	void chaper69() {
		// StringBuffer �깮�꽦
				StringBuffer sb1=new StringBuffer();
				//1 怨꾩냽 遺숈씠�뒗 �븿�닔 mutable 
				sb1.append("�븞�뀞�븯�꽭�슂.")
				  .append("�삉 留뚮굹�슂.")
				  .append("紐⑤몢瑜� �궗�옉�빐�슂. 湲곕떎�젮遊�.");
				System.out.println(sb1.toString()+sb1.hashCode());
				//2 replace
				sb1.replace(0,2,"�굹 蹂닿린媛� �뿭嫄곗썙");
				System.out.println(sb1.toString()+sb1.hashCode());
				//3 reverse
				sb1.reverse();
				System.out.println(sb1.toString());
				//4 delete
				sb1.delete(10,15);
				System.out.println(sb1.toString());
				//5 cal by reference, shallow copy
				replaces(sb1);
				System.out.println(sb1.toString());
	}

	public static void replaces(StringBuffer sb){
		sb.reverse();
		sb.replace(0,3,"GoGo");//0遺��꽣 2源뚯� 瑜� GoGo濡�
	}
	
	void chaper70() {
		//synchronized �븞�븳 StringBuffer
				StringBuilder sbu=new StringBuilder();
				sbu.append("I")
				.append(" go")
				.append(" to school.");
				System.out.println(sbu);
				sbu.replace(7,11,"");
				System.out.println(sbu);
				sbu.reverse();
				System.out.println(sbu);
				sbu.deleteCharAt(3);
				System.out.println(sbu);
				sbu.delete(1,3);
				System.out.println(sbu);
				String ss=sbu.substring(0);
				System.out.println(ss);
				System.out.println(sbu);
				String st=sbu.substring(0,4);
				System.out.println(st);
				System.out.println(sbu);
	}




}
