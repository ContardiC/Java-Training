public class Operations {

    private BankAccount bankAccount;
    private float amount=0;
    private float tmp;

    public Operations(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public Operations(BankAccount bankAccount, float amount){
        this.bankAccount=bankAccount;
        this.amount=amount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void withdraw(float amount){
        tmp=bankAccount.getBalance();
        tmp-=amount;
        bankAccount.setBalance(tmp);
    }
    public void deposit(float amount){
        tmp=bankAccount.getBalance();
        tmp+=amount;
        bankAccount.setBalance(tmp);
    }

}
