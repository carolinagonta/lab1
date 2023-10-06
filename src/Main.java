import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creează un obiect Scanner pentru a citi de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Solicită utilizatorului să introducă un număr întreg
        System.out.print("Introduceți un număr întreg: ");
        int numar = scanner.nextInt();

        // Verifică dacă numărul este pozitiv, negativ sau zero și afișează un mesaj corespunzător
        if (numar > 0) {
            System.out.println("Numărul introdus este pozitiv.");
        } else if (numar < 0) {
            System.out.println("Numărul introdus este negativ.");
        } else {
            System.out.println("Numărul introdus este zero.");
        }

        // Închide scanner-ul pentru a evita scurgeri de resurse
        scanner.close();
    }
}
