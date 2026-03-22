package three.abstraction;

public class abstractionDemo {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposits(100);

        BankAccount savingAccount1 = new SavingsAccount();
        savingAccount1 = new CurrentAccount();
        savingAccount1.deposits(200);
        }
    }

