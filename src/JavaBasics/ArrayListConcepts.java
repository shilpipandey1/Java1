package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static <E> void main(String[] args)
	{
		ArrayList ar = new ArrayList();
		
		ar.add(100); //0
		ar.add(200);  //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		System.out.println(ar.size());
		//ar.remove(8);
		
		
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(8));
		
		//to print all the array
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom");
		ArrayList<E> ar2= new ArrayList<E>();
		ar2.add(Cortana (E) "test");
		
	}

}
