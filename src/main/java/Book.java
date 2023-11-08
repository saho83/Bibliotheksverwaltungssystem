public class Book implements IBookable {

    // Attribute von Book
   static String title;
    String author;
    static boolean isAvailable;

    // Konstruktor




    public Book(String title, String author, boolean isAvailable) {
        super();
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // getter / setter
    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
            return isAvailable;

    }

    public static void setAvailable(boolean available) {
        isAvailable = available;
    }


    // Interface Methoden
    @Override
    public void borrow() {
        setAvailable(false);



    }

    @Override
    public void bringBack() {
        setAvailable(true);


    }


}
