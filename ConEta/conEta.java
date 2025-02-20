package ConEta;
import java.util.Scanner;
public class conEta {
    public static void main(String[] args) {
        Scanner pippi=new Scanner(System.in);
      System.out.println("Inserisci un numero intero:");
      int numero1=pippi.nextInt();
      System.out.println("Inserisci un numero intero:");
      int numero2=pippi.nextInt();
      if(numero1>numero2)
      System.out.println("il primo numero è maggiore ed è:"+numero1);
  else if(numero1<numero2)
      System.out.println("il secondo numero è maggiore ed è:"+numero2);
    if(numero1==numero2)
      System.out.println("i numei sono uguali e sono:"+numero1);
}
}