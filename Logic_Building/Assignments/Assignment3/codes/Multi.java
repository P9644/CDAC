import java.io.*;
import java.util.*;
class Multi{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++){
if(i%7==0){
System.out.println(i);
}
}
}
}