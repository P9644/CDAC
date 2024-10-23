class Demo{
	static int count;
	int a = 10;
	{
		a = count;
	}
	/*static{
		System.out.println("Static 2");
		count = 100;
	}
	static{
		System.out.println("Static 1");
		count = 1000;
	}*/
	
	/*void Demo(){
		//this(1);
	}
	Demo(int a){
		this();
	}
	Demo(){
	}*/
	/*void m1(){
		m1();
	
	}*/
	/* void m2(){
		m1();

	}*/
}
class Main1{
	public static void main (String args[]){
		Demo d = new Demo();
		
		Demo.count = 10000;
		System.out.println("count "+ Demo.count);
		System.out.println("count "+ d.a);
		//System.out.println("count "+ Demo.a);error
		//d.m1();
	 
	}

}