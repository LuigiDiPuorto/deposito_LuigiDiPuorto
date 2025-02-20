import java.util.Scanner;
public class tryFoe
{

    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            // Primo inserimento dei dati
            System.out.print("Inserisci il tuo nome: ");
            String nome = input.nextLine();
    
            System.out.print("Inserisci il tuo cognome: ");
            String cognome = input.nextLine();
    
            System.out.print("Inserisci la tua password: ");
            String password = input.nextLine();
    
            System.out.print("Inserisci la tua età: ");
            int eta = input.nextInt();
            input.nextLine(); // Consuma il newline rimasto dopo nextInt()
    
            // L'utente ha 3 tentativi per reinserire correttamente i dati
            boolean datiCorretti = false;
            int tentativi = 3;
    
            while (tentativi > 0 && !datiCorretti) {
                System.out.println("\n** Verifica dei dati - Tentativi rimasti: " + tentativi + " **");
    
                System.out.print("Reinserisci il tuo nome: ");
                String nomeCheck = input.nextLine();
    
                System.out.print("Reinserisci il tuo cognome: ");
                String cognomeCheck = input.nextLine();
    
                System.out.print("Reinserisci la tua password: ");
                String passwordCheck = input.nextLine();
    
                System.out.print("Reinserisci la tua età: ");
                int etaCheck = input.nextInt();
                input.nextLine(); // Consuma newline
    
                // Controllo dei dati
                if (nome.equals(nomeCheck) &&
                    cognome.equals(cognomeCheck) &&
                    password.equals(passwordCheck) &&
                    eta == etaCheck) {
    
                    datiCorretti = true;
                    System.out.println("\n✅ Dati inseriti correttamente. Accesso consentito!");
                } else {
                    tentativi--;
                    if (tentativi > 0) {
                        System.out.println("\n⚠️ I dati non corrispondono. Riprova.");
                    } else {
                        System.out.println("\n❌ Tentativi esauriti. Accesso negato.");
                    }
                }
            }
    
            input.close();
        }
    }