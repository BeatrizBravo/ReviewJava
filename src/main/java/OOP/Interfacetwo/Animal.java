package OOP.Interfacetwo;

public class Animal {
    public String name;
}

interface sleep{
   // void sleep(); //abstract method that is going be override
    default void sleep(){
        System.out.println("ñññññ");
        }
    }




class Dog extends Animal implements sleep {
    public String name;

    public Dog() {
        sleep (); //the constructor is going to call the mehod by default
    }
}