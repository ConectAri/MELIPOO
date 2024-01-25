public class Animal {

    private String name;

    private String gender; //genero

    private Integer age;// idade

    private Integer weight; //peso

    private String color;



    // Getters and Setters servem para acessar os atributos privados de uma classe e alterar seus valores.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Metodos de comportamento da classe

    protected void eat() {System.out.println("Animal is eating..."); //eat significa comer
    }

    protected void sleep() {System.out.println("Animal is sleeping..."); //sleep significa dormir
    }

    protected void walk() {System.out.println("Animal is walking..."); //walk significa andar

    }

    protected void run() {System.out.println("Animal is running..."); //run significa correr

    }

    protected void breathe() {System.out.println("Animal is breathing..."); //breathe significa respirar

    }
}
