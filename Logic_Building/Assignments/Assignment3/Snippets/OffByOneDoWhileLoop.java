public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num >0); 
 } 
} 
// Error to investigate: Why does this loop print unexpected //numbers? What adjustments are needed to print the 
//numbers from 1 to 5? 
loop prints only one because of num--
w need to change condition to num++ and while (num<6)