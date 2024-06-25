package api;

import com.google.gson.annotations.SerializedName;

public class Coin {

    @SerializedName("base_code")
    private String coinFrom;
    @SerializedName("target_code")
    private String coinTo;
    @SerializedName("conversion_rate")
    private double valueTransaction;

    public Coin(String coinFrom, String coinTo, double valueTransaction) {
        this.coinFrom = coinFrom;
        this.coinTo = coinTo;
        this.valueTransaction = valueTransaction;
    }

    public double getValueTransaction(){
        return valueTransaction;
    }
    public String getCoinTo(){
        return coinTo;
    }
    public String getCoinFrom(){
        return coinFrom;
    }
}