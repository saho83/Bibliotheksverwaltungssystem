public class Teacher extends User {

    //Attribute für Teacher
    private String teacherId;


    // Konstruktor
    public Teacher(String name, int age, String teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }


    // abstrakte Methoden
    @Override
    public void ausleihen(IBookable bookable) {

    }


    // getter / setter
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }


    // Methoden


}
