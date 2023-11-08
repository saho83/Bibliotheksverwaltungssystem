public class Person {

    // Eigenschaften die eine Person definieren
    private String name;
    private int age;



    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
