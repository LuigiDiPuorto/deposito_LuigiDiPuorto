import java.util.Scanner;
public class tryArray{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int[] numeri=new int [3];
int u=0;
int i=2;
    while(u<3){
System.out.print("inserisci numeri:");
  numeri[u]=input.nextInt(); 
  if(numeri[u]>99)
  u++; 
  i++;
}
System.out.println(numeri[0]);
System.out.println(numeri[1]);
System.out.println(numeri[2]);
}


}