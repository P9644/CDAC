import java.io.*;
import java.util.*;
class Discount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int purchase=sc.nextInt();
float discount=0;
if (purchase>=1000){
discount=0.20*purchase;
}
else if (purchase >500&&purchase<999){
discount=0.10*purchase;

}else {
discount=0.05*purchase;

}System.out.println(discount);
}
System.out.println("do you have a membership: y/n");
String m=new Scanner(System.in);
String membership=m.next();

if (membership =="y"){
            discount += purchase * 0.05;
        System.out.println("Additional discount for membership card: " + purchase * 0.05);
        }

        System.out.println("Total discount: " + discount);
        System.out.println("Purchase amount  to be paid: " + (Purchase - discount));

}