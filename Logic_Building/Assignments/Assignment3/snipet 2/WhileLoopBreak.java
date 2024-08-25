public class WhileLoopBreak { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 5) { 
 System.out.print(count + " "); 
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); 
 } 
} 
// Guess the output of this while loop. 
initial count =0
count<5
count=0--->0
count=1--->1
count=2--->2
count=3--->3
breaks and exits loop