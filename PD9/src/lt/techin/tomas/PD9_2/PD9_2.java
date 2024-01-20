/*
Realizuokite parduotuvės funkcionalumą. Parduotuvė parduoda prekes: maisto prekes, alkoholinius gėrimus, knygas ir laikraščius. Bet kokios parduodamos prekės savybė:
Ê Pavadinimas
Ê Kaina
Prekė žino savo kaina ir kainą su PVM. Apie PVM tarifus galite paskaityti čia: ”Pridėtinės
vertės mokestis”. Klientai gali apsipirkti parduotuvėje ir nupirkti bet kokias ir bet kiek prekių.
Apmokant prekių krepšelį klientui turi būti nurodoma bendra prekių kaina, kaina su PVM ir kaina
doleriais pagal galiojanti šiai dienai Eur / USD keitimo kursą. Taip pat parduotuvėje gali vykti
įvairios akcijos, tad klientui turi būti pritaikomos nuolaidos jei tokios priklauso.
 */

package lt.techin.tomas.PD9_2;

public class PD9_2 {
    public static void main(String[] args) {
        Food_PD9_2 bread = new Food_PD9_2("Vilniaus duona", 1.69);
        Medicine_PD9_2 panadol = new Medicine_PD9_2("Panadol", 2.50);
        Alcohol_PD9_2 likeris = new Alcohol_PD9_2("Bosca", 15.0);

        ShopingCart_PD9_2 myShopingCart = new ShopingCart_PD9_2();
        myShopingCart.addItem(bread);
        myShopingCart.addItem(panadol);
        myShopingCart.addItem(likeris);

        System.out.println(myShopingCart.getTotalPrice());
        System.out.println(myShopingCart.getTotalPriceWithVat());


    }
}
