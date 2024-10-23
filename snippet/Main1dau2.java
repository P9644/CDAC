class Product{
	int productID;
	String prodName;
	Float price;
	Product(){
		
		
		this(1, "Laptop",50.0f);
		productID = 100;
		prodName = "XYZ";
		price = 40.0f;
		System.out.println("In 0 para. constr." );
	}
	Product(int a, String s, float f){
		this();
		productID = a;
		prodName = s;
		price = f;
		System.out.println("In 3 para. constr.");
	}
	
	/*@Override
	public String toString(){
		return productID+" "+prodName+" "+price;
	}*/
	
}


class Main1{
public static void main(String[] args) 
    { 
		Product obj = new Product();
		//Product P = new Product(1, "Laptop",50.0f);
		//System.out.println( P );
		System.out.println( obj.productID );
	
	}

}