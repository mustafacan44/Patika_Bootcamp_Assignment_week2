package entity;

public class MemberAccount {
    //Müşteri bilgileri burada tutulur

    private String name;
    private String surName;
    private int id;
    private String code;
    private int balance;
    private String mobilePhone;

    public MemberAccount(String name, String surName, int id, int balance, String mobilePhone) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.balance = balance;
        this.mobilePhone = mobilePhone;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.getId() + this.name.substring(0, 2);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
