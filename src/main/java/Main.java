public class Main {
    public static void main(String[] args) {

        //Student peter = new Student("123");

        Student studentTina = new Student("Tine", 21, "123");
        User teacherPeter = new Teacher("Peter", 45, "888");
        Student studentOtto = new Student("Otto", 23, "321");



        Book kafka = new Book("Kafka", "Kafka", true);

       studentTina.ausleihen(kafka);

        System.out.println(kafka.isAvailable());



    }


}
