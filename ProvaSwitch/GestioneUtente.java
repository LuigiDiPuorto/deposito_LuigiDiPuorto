
import java.util.Scanner;

public class GestioneUtente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Richiesta informazioni iniziali
        System.out.print("Inserisci il nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci il cognome: ");
        String cognome = input.nextLine();

        System.out.print("Inserisci la password: ");
        String password = input.nextLine();

        // Scelta dell'informazione da modificare
        System.out.println("Quale informazione vuoi modificare?");
        System.out.println("1 - Nome");
        System.out.println("2 - Cognome");
        System.out.println("3 - Password");
        System.out.print("Inserisci il numero corrispondente alla scelta: ");
        int scelta = input.nextInt();
        input.nextLine(); // Pulizia del buffer

        // Switch per la modifica dei dati
        switch (scelta) {
            case 1:
                System.out.print("Inserisci il nuovo nome: ");
                nome = input.nextLine();
                break;
            case 2:
                System.out.print("Inserisci il nuovo cognome: ");
                cognome = input.nextLine();
                break;
            case 3:
                System.out.print("Inserisci la nuova password: ");
                password = input.nextLine();
                break;
            default:
                System.out.println("Scelta non valida. Nessuna modifica effettuata.");
        }

        // Stampa dei dati finali
        System.out.println("--- Dati aggiornati ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Password: " + password);

        input.close();
    }
}