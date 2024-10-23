class Demo{
	static int count;
	int a;
	{
		a = 10;
		//count = 100;
		System.out.println("Init ");
	}
	static{
		//count = 1000;
		System.out.println("Static ");
	}
	Demo(){
		//count = 10000;
		System.out.println("In Constr.");
	}

}
class Main2{
	public static void main (String args[]){
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		//System.out.println(Demo.count);
		
		
	 
	}

}