import java.io.*;
import java.util.*;
class Rev{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rev=0;
while(num>0){
int num1=num%10;//1234%10-->4
rev=rev*10+num1;//0+4
num/=10;//1234/10=123
}
System.out.println(rev);
}}
