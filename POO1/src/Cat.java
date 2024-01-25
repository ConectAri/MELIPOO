


//palavra reservada extends indica que a classe Cat herda da classe Animal (conceito de herança)
public class Cat  extends Animal {
    @Override  //Para mudar o comportamento do método eat, eu preciso sobrescrever o método eat da classe Animal
    protected void eat() {
        System.out.println(" Cat is eating Fish"); // Aqui o gato come peixe
    }
}
