package three.abstraction;

public class SavingsAccount extends BankAccount{


    @Override
    public void deposits(double amount) {
        System.out.println("Deposited ");
    }

    @Override
    public void withdraws(double amount) {
        System.out.println("withdrawn ");
    }


}
