package ex_28072024_exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) {
        if (!bankName.currency.equalsIgnoreCase("INR")){
            throw new RuntimeException("Currency is not match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;

    }
}
