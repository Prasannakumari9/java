class Test{
	int a;
	static int c;
}
 class variables {
	public static void main(String args[]){
		System.out.println(Test.c);//0
		
		Test t1=new Test();//t1 is local
		t1.a=10;
		t1.c=200;
		System.out.println(t1.a);//10
		System.out.println(t1.c);//200
		
		Test t2=new Test();
		t2.a=10;
		System.out.println(t1.a);
		System.out.println(t1.c);
		
		Test t3=new Test();
		
		Test t4=new Test();
	}

}
