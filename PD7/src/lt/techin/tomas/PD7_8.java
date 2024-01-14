/**
 * Parašykite Java metodą, kuris patikrina ar teksto eilutė yra palindromas, ar ne?
 */

package lt.techin.tomas;

public class PD7_8 {
    public static void main(String[] args) {
        //String text = "Anna";
        String text = "tAnna";
        System.out.println(isPalindrome(text));
    }
    public static boolean isPalindrome(String text){
        text = text.toLowerCase();
        int lenght = text.length();
        for (int i = 0; i < lenght/2; i++){
            if (text.charAt(i) != text.charAt(lenght - 1 -i)){
                return false;
            }
        }
        return true;
    }
}
