public class Student extends User {

    // Attribute für Student
    private String studentId;

    //Konstruktor
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }


    // abstrakte Methoden
    @Override
    public void ausleihen(IBookable bookable) {

         // überprüft, ob das Buch verfügbar ist
        if (Book.isAvailable) {
            System.out.println("Buch " + Book.getTitle() + "wurde von Student " + getName() + " ausgeliehen.");
            Book.setAvailable(false); // Buch als ausgeliehen markieren
        } else {
            System.out.println("Buch " + Book.getTitle() + " ist bereits ausgeliehen.");
        }

    }


    //getter / setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


}
