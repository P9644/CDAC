package pri.ja;

public class Primitiv {
		// TODO Auto-generated method stub
		    boolean instanceBoolean;
		    char instanceChar;
		    byte instanceByte;
		    short instanceShort;
		    int instanceInt;
		    long instanceLong;
		    float instanceFloat;
		    double instanceDouble;

		    static boolean staticBoolean;
		    static char staticChar;
		    static byte staticByte;
		    static short staticShort;
		    static int staticInt;
		    static long staticLong;
		    static float staticFloat;
		    static double staticDouble;

		    public static void main(String[] args) {
		      
		    	Primitiv obj = new Primitiv();

		        System.out.println("Instance Variables:");
		        System.out.println("boolean: " + obj.instanceBoolean);
		        System.out.println("char: '" + obj.instanceChar + "'");
		        System.out.println("byte: " + obj.instanceByte);
		        System.out.println("short: " + obj.instanceShort);
		        System.out.println("int: " + obj.instanceInt);
		        System.out.println("long: " + obj.instanceLong);
		        System.out.println("float: " + obj.instanceFloat);
		        System.out.println("double: " + obj.instanceDouble);

		   
		        System.out.println("\nStatic Variables:");
		        System.out.println("boolean: " + staticBoolean);
		        System.out.println("char: '" + staticChar + "'");
		        System.out.println("byte: " + staticByte);
		        System.out.println("short: " + staticShort);
		        System.out.println("int: " + staticInt);
		        System.out.println("long: " + staticLong);
		        System.out.println("float: " + staticFloat);
		        System.out.println("double: " + staticDouble);
		    }


	}
/*9. Default Values of Primitive Types
Declare variables of each primitive type as fields of a class and check their default values. (Note: Default values depend on whether the variables are instance variables or static variables).
*/
