package cd.eg;

public class Program_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 int number = 7;
	        String binaryString = Integer.toBinaryString(number);
	        String octalString = Integer.toOctalString(number);
	        String hexString = Integer.toHexString(number);

	        System.out.println("Binary representation of 7: " + binaryString);
	        System.out.println("Octal representation of 7: " + octalString);
	        System.out.println("Hexadecimal representation of 7: " + hexString);
    }
	}


/* Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).*/