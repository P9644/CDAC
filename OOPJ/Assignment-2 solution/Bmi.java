import java.util.*;
class Bmi{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter your height and weight :");
double height=sc.nextDouble();
double weight=sc.nextDouble();
double bmi = weight / (height * height);
System.out.println("Your BMI is :"+bmi);
if(bmi<18.5){
System.out.println("you are underweight");
}
else if(bmi>18.5 && bmi <24.9){
System.out.println("you are Normal ");
}
else if(bmi>25 && bmi <29.9){
System.out.println("you are overweight");
}
else{
System.out.println("you are obsese");
}
}
}


