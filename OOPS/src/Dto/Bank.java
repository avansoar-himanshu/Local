package Dto;

public class Bank {

    private String name;

    private Double balance;

    private Long acc_number;

    public Bank(String name, Long acc_number, Double balance) {

        this.acc_number = acc_number;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(Double balance) {
        balance += balance;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", acc_number=" + acc_number +
                '}';
    }
}
