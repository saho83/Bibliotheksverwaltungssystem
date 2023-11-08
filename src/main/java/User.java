

public abstract class User extends Person {


    // Konstruktor für User
    public User(String name, int age) {
        super(name, age);
    }


    // Abstrakte Methode Buch ausleihen
    public abstract void ausleihen(IBookable bookable);


}
