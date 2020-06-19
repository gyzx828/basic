package efast.proxy;

public class NoodelImplProxy implements Noodel {
	private static NoodelImplProxy subjectImplProxy;

	
	public static Noodel newInstance(){
			if(subjectImplProxy==null){
				return new NoodelImplProxy();
			}
			return subjectImplProxy;
	}

	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("add en egg");
		
		Noodel subject = new NoodelImpl();
		subject.taste();
		
		System.out.println("have some fruits");
	}

}
