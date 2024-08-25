import java.io.*;
import java.util.*;
class Largest{
public static void main(String args[]){
int rev=0;
int num=4825;
while(num>0){
int num1=num%10;//4825%10-->5
num/=10;//1
if(num1>num){
System.out.println("largest"+num1);}
}


}}
