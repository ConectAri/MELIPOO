
//Classe PersonAccount herdando de Account porque a classe Account é abstrata e
// toda classe abstrata precisa ser herdada para que consiga ser instanciada
//precisa colocar o @Override para sobrescrever o método printBalance
//modo de forcar a implementacao do metodo printBalance a heranca

public class PersonAccount extends Account{

    @Override  //Para mudar o comportamento do método printBalance, eu preciso sobrescrever o método printBalance da classe Account
    public void printBalance() {
        System.out.println(" Person Account Balance " + getBalance()); //Saldo da conta pessoal
    }







}
