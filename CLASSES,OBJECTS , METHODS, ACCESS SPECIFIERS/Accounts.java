public class Accounts {

    // DATA FIELDS
    String name;
    int accountNumber;
    String address;
    long mobileNumber;
    double balance;

    // CONSTRUCTOR 1
    Accounts(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.address = "Not Provided"; 
        this.mobileNumber = 0; 
    }

    // CONSTRUCTOR 2
    Accounts(String name, int accountNumber, String address,
            long mobileNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    // METHOD 1: Deposit
    void Deposit(double amount) {
        if (amount > 0) { 
            balance = balance + amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // METHOD 2: Withdraw
    void Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdraw amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw: Rs. " + amount);
        }
    }

    // METHOD 3: Get Balance
    void Get_Balance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // METHOD: Display Account Details
    void displayDetails() {
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Address        : " + address);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Balance        : Rs. " + balance);
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       SAVINGS BANK ACCOUNT SYSTEM      ");
        System.out.println("========================================");

        // Object 1 - Using Constructor 1
        Accounts acc1 = new Accounts("Monkey D. Luffy", 1001, 30000);

        System.out.println("\n--- Account 1 Details (Constructor 1) ---");
        acc1.displayDetails();

        System.out.println("\n--- Operations on Account 1 ---");
        acc1.Deposit(20000);
        acc1.Get_Balance();
        acc1.Withdraw(15000);
        acc1.Get_Balance();
        acc1.Withdraw(100000);

        // Object 2 - Using Constructor 2 
        Accounts acc2 = new Accounts("Nami", 1003,
                "East Blue", 9876543210L, 150000);

        System.out.println("\n--- Account 2 Details (Constructor 2) ---");
        acc2.displayDetails();

        System.out.println("\n--- Operations on Account 2 ---");
        acc2.Deposit(50000);
        acc2.Get_Balance();
        acc2.Withdraw(30000);
        acc2.Get_Balance();
        acc2.Deposit(-5000);

        // Comparing Balance
        System.out.println("\n========== Balance Comparison ==========");
        if (acc1.balance > acc2.balance) {
            System.out.println(acc1.name + " has higher balance!");
        } else if (acc2.balance > acc1.balance) {
            System.out.println(acc2.name + " has higher balance!");
        } else {
            System.out.println("Both accounts have equal balance!");
        }

        System.out.println("========================================");
    }
}