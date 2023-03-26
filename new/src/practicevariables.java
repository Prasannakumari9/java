
public class practicevariables {
	static int c=30;//static variables
	int a = 10;//local variables
	public static void main(String[] args) {
		int b = 40;//instance variables
		System.out.println("static variable:"+c);
		System.out.println("loacl variable:"+b);
		practicevariables obj = new practicevariables();//object creation
		System.out.println("instance variable:"+obj.a);
	}
}
