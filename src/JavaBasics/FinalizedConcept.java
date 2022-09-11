package JavaBasics;

public class FinalizedConcept {
	
	//finalized key word is used to cleanup processing of the object before the garbage collector
	//finallzie is a method
	
	public void finalize()
	{
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		FinalizedConcept f1 = new FinalizedConcept();
		FinalizedConcept f2 = new FinalizedConcept();
		
		f1=null;
		f2=null;
		
		System.gc();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
