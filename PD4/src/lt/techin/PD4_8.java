package lt.techin;

import java.util.Scanner;

public class PD4_8 {
    public static void main(String[] args) {
//        Parašykite programą, kuri padėtų studentui suskaičiuoti, kiek paskaitų jis turi per savaitę ir kiek
//        tai sudarys minučių. Klaviatūra įvedami 5 skaičiai, reiškiantys kiekvienos dienos paskaitų skaičių.
//        Duomenys
//        Kiek paskaitų yra pirmadienį? 5
//        Kiek paskaitų yra antradienį? 6
//        Kiek paskaitų yra trečiadienį? 4
//        Kiek paskaitų yra ketvirtadienį? 5
//        Kiek paskaitų yra penktadienį? 4
//        Rezultatas
//        Paskaitų skaičius per savaitę - 24
//        Tai sudaro 1080 minučių

        System.out.println("Pirmadienis: ");
        Scanner scanner1 = new Scanner(System.in);
        int p = scanner1.nextInt();

        System.out.println("Antradienis: ");
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner2.nextInt();

        System.out.println("Treciadienis: ");
        Scanner scanner3 = new Scanner(System.in);
        int t = scanner3.nextInt();

        System.out.println("Ketvirtadienis: ");
        Scanner scanner4 = new Scanner(System.in);
        int k = scanner4.nextInt();

        System.out.println("Penktadienis: ");
        Scanner scanner5 = new Scanner(System.in);
        int pe = scanner5.nextInt();

        System.out.println("Pirmadienis turi: " + p);
        System.out.println("Antradienis turi: " + a);
        System.out.println("Treciadienis turi: " + t);
        System.out.println("Ketvirtadienis turi: " + k);
        System.out.println("Penktadienis turi: " + pe);

        int sumDay = p + a + t + k + pe;
        System.out.println("Visos savaites paskaitu kiekis: " + sumDay);
        int sumTime = sumDay * 45;
        System.out.println("Tai sudaro " + sumTime + " minutes.");

        if (sumDay < 24){
            System.out.println("Nevirsitas leistinas pamoku kiekis pagal sveikatos ir higienos normas per mokslo savaite.");
        }
        else{
            System.out.println("Virsitas leistinas pamoku kiekis  pagal sveikatos ir higienos normas per mokslo savaite.");
        }

    }
}
