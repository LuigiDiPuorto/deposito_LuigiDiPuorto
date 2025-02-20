package AnnoBis;
import java.util.Scanner;
public static void main(String[] args) {
    Scanner ins=new Scanner(System.in);
    System.out.println("inserisci l'anno:");
    int anno=ins.nextInt();
    if(anno%4==0 && anno%400==0 && anno%100!=0)
    System.out.println("l'anno inserito è bisestile.");
    else if(anno%4==0 && anno%400==0 && anno%100==0)
    System.out.println("l'anno inserito non è bisestile.");

}