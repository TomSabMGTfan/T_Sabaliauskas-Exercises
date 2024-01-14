package lt.techin.tomas;

public class PD8_5_1_MoneyBox {
    private double totalAmuont;
    private double depositCount;
    private static final double MAX_AMOUNT = 1000.0;

    public PD8_5_1_MoneyBox() {
        this.totalAmuont = 0.0;
        this.depositCount = 0;
    }

    public boolean deposit(double amount){
        if (amount <= 0 || amount + totalAmuont > MAX_AMOUNT){
            return false;
        }
        totalAmuont += amount;
        depositCount++;
        return true;
    }

    public boolean withDraw(double amount){
        if (amount <= 0 || amount > totalAmuont){
            return false;
        }

        totalAmuont -= amount;
        return true;
    }
    public double getAverageAmount(){
        if (depositCount == 0){
            return 0.0;
        }
        return totalAmuont / depositCount;
    }
    public boolean isEmpty(){
        return totalAmuont == 0.0;
    }
}
