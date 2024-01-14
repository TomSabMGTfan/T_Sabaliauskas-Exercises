public class Test {
    public static void main(String[] args) {
        int skaicius = 40;
        long faktorialas = apskaiciuotiFaktoriala(skaicius);
        System.out.println(skaicius + "! = " + faktorialas);
    }

    public static long apskaiciuotiFaktoriala(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * apskaiciuotiFaktoriala(n - 1); // Rekursyvus kvietimas
        }
    }
}
