public class BankAccount {

    private String IBAN;
    private Client client;
    private float balance;


    public BankAccount(String IBAN, Client client,float balance){
        this.IBAN=IBAN;
        this.client=client;
        this.balance=balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
