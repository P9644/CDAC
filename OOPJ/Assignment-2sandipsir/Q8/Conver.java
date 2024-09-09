package convjav.kd;

public class Conver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int intVar = 42;
		        long longVar = 123456789L;
		        float floatVar = 3.14f;
		        double doubleVar = 123.456;
		        boolean booleanVar = true;
		        char charVar = 'A';
		        byte byteVar = 10;
		        short shortVar = 1000;

		        System.out.println("Using toString method:");
		        System.out.println("int: " + Integer.toString(intVar));
		        System.out.println("long: " + Long.toString(longVar));
		        System.out.println("float: " + Float.toString(floatVar));
		        System.out.println("double: " + Double.toString(doubleVar));
		        System.out.println("boolean: " + Boolean.toString(booleanVar));
		        System.out.println("char: " + Character.toString(charVar));
		        System.out.println("byte: " + Byte.toString(byteVar));
		        System.out.println("short: " + Short.toString(shortVar));

		        System.out.println("\nUsing valueOf method:");
		        System.out.println("int: " + String.valueOf(intVar));
		        System.out.println("long: " + String.valueOf(longVar));
		        System.out.println("float: " + String.valueOf(floatVar));
		        System.out.println("double: " + String.valueOf(doubleVar));
		        System.out.println("boolean: " + String.valueOf(booleanVar));
		        System.out.println("char: " + String.valueOf(charVar));
		        System.out.println("byte: " + String.valueOf(byteVar));
		        System.out.println("short: " + String.valueOf(shortVar));
		    }

	}
/*8. Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).
*/