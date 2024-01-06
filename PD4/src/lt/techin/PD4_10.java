package lt.techin;

import java.util.Scanner;

public class PD4_10 {
    public static void main(String[] args) {
        //Į vieną kartoninę dėžutę telpa trys puodeliai. Pakuotojas užklijuoja dėžutę ir išsiunčia ją į parduotuvę, jei ji pilna.
        // Iš viso reikia supakuoti m puodelių. Parašykite programą, kuri apskaičiuotų,
        //kelios bus pilnos dėžutės ir kiekpuodelių liks nesupakuota.
        //Duomenys
        //Puodelių, kuriuos reikia supakuoti, skaičius: 7
        //Rezultatas
        //Pilnų dėžučių skaičius: 2
        //Nesupakuotų puodelių skaičius: 1

        System.out.println("Iveskite puodeliu skaiciu: ");
        Scanner scanner1 = new Scanner(System.in);
        int puodSkaicius = scanner1.nextInt();

        System.out.println("Iveskite kartoniniu dezuciu skaiciu: ");
        Scanner scanner2 = new Scanner(System.in);
        int dezuciuSkaicius = scanner2.nextInt();

        int sum1 = puodSkaicius - (dezuciuSkaicius * 3);
        // int sum2 = (sum1 / 3) - dezuciuSkaicius;

        System.out.println("Puodeliu yra: " + puodSkaicius + " vnt.");
        System.out.println("Pakuociu yra: " + dezuciuSkaicius + " vnt.");
        System.out.println("Puodeliu likutis po dezuciu supakavimo: " + sum1);

        if (sum1 < 0) {
            //System.out.println("Neisnaudotas rezervas dezuciu : " + sum2 + " vnt.");
            System.out.println("Neisnaudotas rezervas puodeliu pakavime: " + sum1 + " vnt.");
            System.out.println("Reiksme su neigiamu zenklu reiskia puodeliu likutis, kuriam reikia pakuociu.");
        }

    }

}
