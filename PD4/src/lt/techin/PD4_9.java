package lt.techin;

import java.util.Scanner;

import static java.lang.Double.valueOf;

public class PD4_9 {
    public static void main(String[] args) {
//Statybininkui reikia pastatyti sieną, kurios ilgis yra a metrų, o aukštis h metrų (a ir h yra sveikieji
//skaičiai). Kiek reikės plytų, kurių ilgis 20 cm, o aukštis 10 cm ir kiek kainuos plytos, jeigu
//vienos plytos kaina k Eur. Pinigų sumą pateikti šimtųjų tikslumu. Parametrai a, h ir k įvedami iš
//klaviatūros.
//Duomenys
//Sienos ilgis m: 4
//Sienos aukštis m: 3
//Plytos kaina Eur: 0.5
//Rezultatas
//Plytų kiekis 600
//Plytos kainuos 300.00 Eur


        System.out.println("Iveskite sienos ilgi metrais: ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();

        System.out.println("Iveskite sienos auksti metrais: ");
        Scanner scanner2 = new Scanner(System.in);
        int h = scanner2.nextInt();

        System.out.println("Iveskite 1 plytos kaina: ");
        Scanner scanner3 = new Scanner(System.in);
        //double vntKaina = scanner3.nextInt();
        double vntKaina = scanner3.nextInt();
        //double vntKaina1 = Double.valueOf(vntKaina);
        //double vntKaina = scanner3.nextInt();

        System.out.println("Sienos ilgis: " + a + " m.");
        System.out.println("Sienos aukstis: " + h + " m.");
        System.out.println("Vienos plytos kaina: " + vntKaina + " Eur su PVM.");

        int sMetrai = a * h;
        int sCentimetrai = (a * h) * 10000;
        System.out.println("Bendras plotas yra: " + sMetrai + " m2.");
        System.out.println("Bendras plotas yra: " + sCentimetrai + " cm2.");

        int sumPlytos = sCentimetrai / (20 * 10);
        System.out.println("reikalingas plytu kiekis: " + sumPlytos + " vnt.");

        double sumKaina = sumPlytos * vntKaina;
        System.out.println("Visos plytos kainuos: " + sumKaina + " Eur su PVM");

    }
}
