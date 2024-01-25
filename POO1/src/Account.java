
//Classe abstrata, significa que não pode ser instanciada, mas pode ser herdada
public  abstract class Account {

    private Double balance; //saldo


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //Método abstrato, significa que não tem implementação, mas precisa ser implementado nas classes filhas

    public abstract void printBalance();

}
