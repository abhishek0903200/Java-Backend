package three.abstraction;

abstract public class BankAccount {
    private String accountNumber;
    private double balance;

    public abstract void deposits(double amount);
    public abstract void withdraws(double amount);
}
