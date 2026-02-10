package Classworks.animals.base;
//base package
public class Animal {
    //Encapsulation
    private String name;   // private → data hiding
    private int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Animal() {
    }

    //public getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void birthday(){
        age++;
        System.out.println(name + " is now " + age + " years old.");
    }

}