package CheckEta;
import java.util.Scanner;
public class checkEta {
public static void main(String[] args) {
Scanner pippo=new Scanner(System.in);
System.out.println("inserisci la prima età:");
String num1=pippo nextString();
System.out.println("inserisci la seconda età:");
String num2=pippo nextString();
if(num1>=18)
System.out.println("la prima persona è maggiorenne.");
else System.out.println("la prima persona è minorenne.");
if(num2>=18)
System.out.println("la seconda persona è maggiorenne.");
else System.out.println("la seconda persona è minorenne.");
}
}