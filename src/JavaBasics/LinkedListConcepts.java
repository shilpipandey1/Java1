package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
				
               //add
				l1.add("test");
		        l1.add("qtp");
		        l1.add("selenium");
		        l1.add("rpa");
		        l1.add("RFT");
		        
		        //print
		        System.out.println("content of linkedlist"+l1);
		        l1.addFirst("shilpi");
		        l1.addLast("Automation");
		        System.out.println("content of linkedlist"+l1);
		        
		        System.out.println(l1.getFirst());
		        System.out.println(l1.get(1));
		        System.out.println(l1.getLast());
		        l1.set(0, "link");
		        System.out.println(l1.get(0));
		        System.out.println("content of linkedlist"+l1);
		        
		        l1.remove(2);
		        
		        System.out.println("content of linkedlist"+l1);
		        
		        //for loop
		        
		        System.out.println("using for loop");
		        
		        for (int n=0;n<l1.size();n++)
		        {
		        	System.out.println(l1.get(n));
		        }
		        
		        // for loop
		        
		        
		        System.out.println("using advance for loop");
		        for (String str : l1)
		        {
		        	System.out.println(str);
		        }
		       // iterator
		        
		        System.out.println("using Iterator");
		        
		        Iterator<String> it = l1.iterator();
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
		        
		        //while
		        System.out.println("using while loop");
		        int num =0;
		        while(l1.size()>num)
		        {
		        	System.out.println(l1.get(num));
		        	num++;
		        }
		        
	}

}
