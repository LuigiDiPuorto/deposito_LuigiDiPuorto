import java.util.Scanner;
public class tabWhile{
public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.err.println("inserisci il numero:");
    int ins=input.nextInt();
    int i=0;
    while ( i<11)
    {
        int molt=i*ins;
        System.out.println(ins+"x"+i+"="+molt);
        i++;
    }
}
}