package JavaBasics;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		String c= "100";
		System.out.println(c+20);
		
		
		//data conversion: String to int;
		int i = Integer.parseInt(c);
		System.out.println(i+20);
		
		//Integer,double,Character, Boolean
		//String to double conversion:
		
		String y="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean;
		String k= "true";
		Boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string conversion
		
		int j= 200;
		System.out.println(j+20);
		String s = String.valueOf(j);  //200
		System.out.println(s+20);
		
		String u = "100A";
		Integer.parseInt(u);   //numberformatexception
		

	}

}
