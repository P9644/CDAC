public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) { 
 count += i++ - ++i; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this code snippet.
equation

0-1=-1
1-3=-2
2-4=-2
3-5=-2
count=count+equation
	
	