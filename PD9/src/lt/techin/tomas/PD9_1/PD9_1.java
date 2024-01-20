package lt.techin.tomas.PD9_1;

public class PD9_1 {
    public static void main(String[] args) {
        BankAcount_PD9_1 myAccount = new BankAcount_PD9_1("LT123456789369852", "Vaclav");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(256);
//        System.out.println(myAccount.getBalance());
//        myAccount.withdraw(500);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));
        System.out.println(myAccount.getBalance());
    }
}
