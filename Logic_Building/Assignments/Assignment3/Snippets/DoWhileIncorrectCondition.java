public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num  0); 
 } 
} 
// Error to investigate: Why does the loop only execute once? //What is wrong with the loop condition in the `dowhile` //loop? 

it runs infinitely no compile time error 
initially num is zero 
num++ will store value 1  in while condition
while(1>0) is true therefore it will run infinite times
we must change condition to while(num<0) to make run condition only once