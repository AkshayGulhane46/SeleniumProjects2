package InterFaceDemo;


public class InterfaceDemo implements DemoInterface {

	public void carBrand() {
		// TODO Auto-generated method stub
		System.out.println("This is default car brand");
	}

	public void carname() {
		// TODO Auto-generated method stub
		System.out.println("This is default car name");		
	}
	
	public static void main(String args[]) {
		InterfaceDemo inter = new InterfaceDemo();
		inter.carBrand();
		inter.carname();
	}
	

}
