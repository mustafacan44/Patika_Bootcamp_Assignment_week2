package entity;

public class Bill {
    // fatura ile ilgili bilgiler burada tutulur.

    private int amount;
    private int bill_type;
    private String process_date;


    public Bill(int amount, int bill_type, String process_date) {
        this.amount = amount;
        this.bill_type = bill_type;
        this.process_date = process_date;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public String getProcess_date() {
        return process_date;
    }
}
