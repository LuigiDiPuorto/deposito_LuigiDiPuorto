package VerSegno;

import java.util.Scanner;
public class verSegno {
    public static void main(String[] args) {
        Scanner pippo=new Scanner(System.in);
      System.out.println("Inserisci un numero intero:");
      int numero=pippo.nextInt();
      if(numero>0)
      System.out.println("il numero è maggiore di 0.");
      else if(numero==0)
      System.out.println("il numero è 0.");
      else if(numero<0)
      System.out.println("il numero è minore di 0.");

    
}
}