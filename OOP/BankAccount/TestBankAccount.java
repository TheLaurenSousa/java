public class TestBankAccount {
    public static void main(String[] args){

        // Create User
        BankAccount account1 = new BankAccount();
        account1.depositMoney("checking", 500.0);
        account1.depositMoney("savings", 200.0);
        System.out.println(BankAccount.totalMoneyInAllAccounts());
        System.out.println(account1.withdrawMoney("checking", 401.0));
        System.out.println(account1.withdrawMoney("savings", 250.0));
        System.out.println(account1.totalBalance());
        System.out.println(BankAccount.totalAccounts());
        System.out.println(BankAccount.totalMoneyInAllAccounts());
    }
}