public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }


    // Order Methods

    public void depositMoney(String account, double amount){
        if(account == "checking"){
            checkingBalance += amount;
        } else {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public String withdrawMoney(String account, double amount){
        if(account == "checking"){
            if(getCheckingBalance() - amount >= 0){
                this.checkingBalance -= amount;
                totalMoney -= amount;
                return "Withdrawal successful. Remaining balance in checking account is: "+ this.checkingBalance;
            } else {
                return "Insufficient funds.";
            }
        } else {
            if (getSavingsBalance() - amount >= 0){
                this.savingsBalance -= amount;
                totalMoney -= amount;
                return "Withdrawal successful. Remaining balance in savings account is: "+ this.checkingBalance;
            } else {
                return "Insufficient funds.";
            }
        }
    }

    public double totalBalance(){
        return this.savingsBalance + this.checkingBalance;
    }

    public static int totalAccounts(){
        return numberOfAccounts;
    }

    public static double totalMoneyInAllAccounts(){
        return totalMoney;
    }


    // Getters and Setters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

}