import java.io.*;
import java.util.*;
class Sum_of_digit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
int num1;
while(num>0){
num1=num%10;// remainder 
sum=sum+num1;//0+num1
num=num/10;//quotient
}
System.out.println("sum of digit : "+ sum);
}
}


