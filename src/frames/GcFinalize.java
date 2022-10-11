package frames;

public class GcFinalize {
	
	protected void finalize() {
		System.out.println("Cleaned Up");
		
	} 
	public void m1() {
		System.out.println("m1");
		
	}
	public static void main(String[] args) {
		GcFinalize a=new GcFinalize();
		a.m1();
		a=null;
		System.gc();
		
	}	
	

}
