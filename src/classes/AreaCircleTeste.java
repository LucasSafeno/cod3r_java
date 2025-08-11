package classes;

public class AreaCircleTeste {

	public static void main(String[] args) {
		AreaCircle a1 =  new AreaCircle(10);
		
		AreaCircle a2 =  new AreaCircle(5);

		AreaCircle.pi = 5;
		
		System.out.println(a1.area());
		
		System.out.println(a2.area());
	}
}
