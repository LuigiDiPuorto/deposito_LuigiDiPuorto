import java.util.Scanner;
public class sommWhile
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int add=0;
        int i=0;
        int minus=0;
                while(i>=0)
        {
            System.out.println("inserisci un numero maggiore o uguale di 0:");
            int num=input.nextInt();
             add=add+num;
             minus=num;
            i=minus-0;
        }
            System.out.println("la somma è:"+add);
    }
}