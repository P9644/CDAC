public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
// Error to investigate: Why does the loop print unexpected //results or run infinitely? How should the loop update 
//expression be corrected?

because it starts with zero and incremented by 2 each time to fix it change condition from i=1 and i+=1