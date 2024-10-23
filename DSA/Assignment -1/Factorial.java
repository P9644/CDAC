public class Factorial {
    public static int factorial(int n) {
        if (n == 0) 
			return 1;
		else
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); 
        System.out.println(factorial(0));  
    }
}
/*
product of number given till one 
ex. 5factorial=5*4*3*2*1
*/