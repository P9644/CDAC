import java.io.*;
import java.util.*;
class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++){
if(num%i==0){
System.out.println("Not Prime number"+num);
}
else{System.out.println(" Prime number"+num);
}
}
}
}
