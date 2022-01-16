package Practise_Assginments_Phase1;

public class innerclass {

	public static void main(String[] args) {
		Other other =new Other();
		other.dowork(new some() {
			@Override
			public void work() {
				System.out.println("Inner classess");
			}
		});

	}

}
interface some{   //interface method 
	void work();
}
class Other {
	void dowork(some ref) {
		ref.work();
	}
}
