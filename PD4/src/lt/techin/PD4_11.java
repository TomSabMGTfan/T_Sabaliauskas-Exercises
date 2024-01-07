package lt.techin;

import java.util.Scanner;

public class PD4_11 {

    public static void main(String[] args) {

        //Automobilių tunelio po Nepriklausomybės aikšte Vilniuje ilgis lygus 264 m. Parašykite programą,
        //kuri apskaičiuotų, kelias sekundes sautomobilis važiuoja šiuo tuneliu, jei jo greitis yra v km/h?
        //Rezultatus pateikite šimtųjų tikslumu.
        //Duomenys
        //Koks automobilio greitis?: 60
        //Rezultatas
        //Automobilis tunelį pravažiuos per 15.84 s
        //v=s/t         t=s/v         s=v x t

        System.out.println("Koks automobilio greitis: ");
        Scanner scanner1 = new Scanner(System.in);
        int autoGreitis = scanner1.nextInt();

        double tunelioIlgis = 264;
        double greitisSekundemis = (double) (autoGreitis * 1000) / 3600;

        //To convert 60km/h to m/s:
        //Since 1 km=1000m and 1 hr=3600 sec.
        //60×1000= 60,000
        //60,000÷3,600
        //=16.667m/s

        double laikas = tunelioIlgis / greitisSekundemis;

        System.out.println("Automobilio greitis: " + autoGreitis + " km/h.");
        System.out.println("Tunelio ilgis: " + tunelioIlgis + " m.");
        System.out.println("Automobilis tunelį pravažiuos per" + " " + String.format("%.2f", laikas) + " " + "s");

    }
}
