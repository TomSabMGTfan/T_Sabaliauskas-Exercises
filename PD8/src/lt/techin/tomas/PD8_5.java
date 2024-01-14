package lt.techin.tomas;

public class PD8_5 {
    public static void main(String[] args) {
        PD8_5_1_MoneyBox moneyBox = new PD8_5_1_MoneyBox();
        moneyBox.deposit(100);
        moneyBox.deposit(400);
        moneyBox.deposit(400);
        moneyBox.deposit(300);
        System.out.println(moneyBox.withDraw(900));
        System.out.println(moneyBox.getAverageAmount());
        System.out.println(moneyBox.isEmpty());
    }
}
