package lt.techin;

import java.util.Scanner;

public class PD4_12 {
    public static void main(String[] args) {
//Akvariume gyvena a žuvų. Kiekvieną dieną Akvilė į akvariumą įdeda b žuvų.
// Parašykite programą, kuri suskaičiuotų kiek iš viso bus žuvų po n dienų.
// Rezultatą reikia išvesti su paaiškinamaisiais žodžiais.
//Duomenys
//Kiek žuvų gyvena akvariume? 5
//Kiek žuvų į akvariumą įdedama kiekvieną dieną? 3
//Kiek dienų praėjo? 3
//Rezultatas
//Po 3 dienų akvariume gyvens 14 žuvų.

        System.out.println("Kiek zuvu gyvena akvariume: ");
        Scanner scanner1 = new Scanner(System.in);
        int zuvuKiekis = scanner1.nextInt();

        System.out.println("Kiek zuvu idedama kiekviena diena: ");
        Scanner scanner2 = new Scanner(System.in);
        int idetaZuvu = scanner2.nextInt();

        System.out.println("Kiek dienu praejo: ");
        Scanner scanner3 = new Scanner(System.in);
        int dienuSkaicius = scanner3.nextInt();

        int sumZuvu = zuvuKiekis + (idetaZuvu * dienuSkaicius) ;

        System.out.println("Zuvu kiekis akvariume: " + zuvuKiekis + " vnt.");
        System.out.println("Kiekviena diena zuvu i akrariuma idedama: " + idetaZuvu + " vnt.");
        System.out.println("Kiek dienu praejo: " + dienuSkaicius + " vnt.");
        System.out.println("Viso kiekis zuvu esanciu akvariume: " + sumZuvu + " vnt.");
    }
}
