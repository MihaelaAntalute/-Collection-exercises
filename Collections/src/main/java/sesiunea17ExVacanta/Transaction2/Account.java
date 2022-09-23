package sesiunea17ExVacanta.Transaction2;

import java.util.List;

public class Account {
    private double balance;
    private String accountNumber;
    private List<Transaction> transactionList;

    public Account(double balance, String accountNumber, List<Transaction> transactionList) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactionList = transactionList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", transactionList=" + transactionList +
                '}';
    }
}
