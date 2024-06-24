package api;

public class Coin {
    String coinFrom;
    String coinTo;
    int ValueTransaction;
    public Coin(String coinFrom, String coinTo, int ValueTransaction) {
        this.coinFrom = coinFrom;
        this.coinTo = coinTo;
        this.ValueTransaction = ValueTransaction;
    }
}
