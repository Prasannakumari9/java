class Calculator{
	float a=20,b=100;//instance variables
	static float c=20,d=30;  //static variables
	void add(){
		int e,f;
		a=30;
		b=40;//local variables
	}
	void sub() {
		a=100;
	}
}
public class Program1{
	public static void main(String args[]) {
		Calculator c = new Calculator();
		System.out.println(c.a);
		System.out.println(c.d);
	}
}

	
  









