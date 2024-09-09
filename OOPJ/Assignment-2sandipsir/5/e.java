package five.w;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String strNumber = "Ab12Cd3";
        try {
            long number = Long.parseLong(strNumber);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
	}

}
/*Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).*/