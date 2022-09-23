package sesiunea17ExVacanta;

public class Transaction  {
    private String id;
    private int amount;
    private Account account;

    public Transaction(String id, int amount, Account account) {
        this.id = id;
        this.amount = amount;
        this.account = account;
    }
    public Transaction(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
