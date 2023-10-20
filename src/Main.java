import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de animale
        List<String> animale = new ArrayList<>();
        animale.add("Câine");
        animale.add("Pisică");
        animale.add("Papagal");

        // Afișăm animalele din listă
        afisareAnimale(animale);

        // Meniu
        Scanner scanner = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Adăugare animal");
            System.out.println("2. Afișare animale");
            System.out.println("3. Verificare dacă un animal există");
            System.out.println("4. Obține animal după index");
            System.out.println("5. Sortare animale");
            System.out.println("0. Ieșire");

            System.out.print("Alege o opțiune: ");
            optiune = scanner.nextInt();

            switch (optiune) {
                case 1:
                    // Adăugare animal
                    scanner.nextLine(); // Consumăm newline rămas de la nextInt()
                    System.out.print("Introdu un nou animal: ");
                    String nouAnimal = scanner.nextLine();
                    animale.add(nouAnimal);
                    break;
                case 2:
                    // Afișare animale
                    afisareAnimale(animale);
                    break;
                case 3:
                    // Verificare dacă un animal există
                    scanner.nextLine(); // Consumăm newline rămas de la nextInt()
                    System.out.print("Introdu un animal pentru a verifica dacă este în listă: ");
                    String animalVerificare = scanner.nextLine();
                    if (animale.contains(animalVerificare)) {
                        System.out.println("Animalul " + animalVerificare + " este în listă.");
                    } else {
                        System.out.println("Animalul " + animalVerificare + " nu este în listă.");
                    }
                    break;
                case 4:
                    // Obține animal după index
                    try {
                        System.out.print("Introdu un index pentru a obține animalul din listă: ");
                        int index = scanner.nextInt();
                        if (index < 0) {
                            throw new IndexOutOfBoundsException("Indexul nu poate fi negativ.");
                        }
                        String animalObtinut = animale.get(index);
                        System.out.println("Animalul de la indexul " + index + " este: " + animalObtinut);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Eroare: " + e.getMessage());
                    }
                    break;
                case 5:
                    // Sortare animale în ordine crescătoare
                    Collections.sort(animale);
                    System.out.println("Animale sortate în ordine crescătoare: " + animale);
                    break;
                case 0:
                    // Ieșire din program
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Te rog alege o opțiune validă.");
            }

        } while (optiune != 0);

        // Închidem scanner-ul
        scanner.close();
    }

    private static void afisareAnimale(List<String> animale) {
        System.out.println("Lista de animale: " + animale);
    }
}
