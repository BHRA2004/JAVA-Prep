// Define the BankApplication interface
interface BankApplication {
    void getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

// Implement the AxisBank class
class AxisBank implements BankApplication {
    private double balance;

    // Constructor
    public AxisBank(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void getBalance() {
        System.out.println("Axis Bank Balance: " + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        getBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
        getBalance();
    }
}

// Implement the HDFC class
class HDFC implements BankApplication {
    private double balance;

    // Constructor
    public HDFC(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void getBalance() {
        System.out.println("HDFC Bank Balance: " + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        getBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
        getBalance();
    }
}

// Main class to test the implementation
public class BankApplicationTest {
    public static void main(String[] args) {
        // Creating instances of AxisBank and HDFC classes
        AxisBank axisBank = new AxisBank(1000);
        HDFC hdfcBank = new HDFC(1500);

        // Testing deposit and withdrawal operations
        axisBank.deposit(500);
        axisBank.withdraw(200);

        hdfcBank.deposit(1000);
        hdfcBank.withdraw(300);
    }
}