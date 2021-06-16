package Challenge4;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public Account(){
        this(123, 20.99, "default name", "default email","my tele numb");
        // creating the default values within the constructor
        System.out.println("empty constructor called");
    }
    public Account(int accountNumber, double balance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNumber() {
        return accountNumber;
    }

    public void setNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " added to your account, now your balance is "+ balance);
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount");
        } else {
            balance -= amount;
            System.out.println(amount + " was withdrawn from your account now your current balance is " + balance);
        }
    }

}
