public class Main {
    public static void main(String[] args) {

        //Exemplo de herança
        Animal cat = new Cat(); //Crio um objeto do tipo Cat que está herdando da classe Animal
        cat.setName("Mimi");
        cat.setAge(3);
        cat.setColor("Black");
        cat.setGender("Male");//Gender significa gênero, male significa masculino
        cat.setWeight(5);//Weight significa peso

        //POLIMORFISMO: Objetos diferentes, comportamentos diferentes e mesmo método
        cat.eat(); // Aqui o gato come peixe


        Animal dog = new Dog(); //Crio um objeto do tipo Dog que está herdando da classe Animal
        dog.setName("Bob");
        dog.setAge(5);
        dog.setColor("brown"); // cor marrom em inglês é brown
        dog.setWeight(5);//Weight significa peso

        //POLIMORFISMO: Objetos diferentes, comportamentos diferentes e mesmo método
        dog.eat(); // Aqui o cachorro come carne


        //Apos criar a classe abstrata Account, eu não consigo mais instanciar um objeto do tipo Account, mas consigo da subclasse PersonAccount
        //Garantindo que a herança seja feita e aplicada

        PersonAccount personAccount = new PersonAccount();
        personAccount.setBalance(1000.00); //Balance significa saldo
        personAccount.printBalance(); //Saldo da conta pessoal





    }
}