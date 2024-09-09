package six.jd;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String strNumber = "Ab12Cd3";
	        try {
	            float number = Float.parseFloat(strNumber);
	            System.out.println("Converted number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid number format.");
	        }
	}
}
/*Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).*/