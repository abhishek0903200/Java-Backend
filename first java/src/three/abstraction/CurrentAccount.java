package three.abstraction;

public class CurrentAccount extends BankAccount{
    @Override
    public void deposits(double amount) {
        System.out.println("deposited currently");
    }

    @Override
    public void withdraws(double amount) {
        System.out.println("withdrawn currently");
    }
}
