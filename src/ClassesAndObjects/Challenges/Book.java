// Create a Book Class for a library System =>
//Instance Variable: title, author, isbn.
//Static Variable: totalBooks, aCounter for the total number of book instances.
//Instance methods: borrowBooks(), returnBook.
//Static methods: getTotalBooks(), to get the total number of books in the library.

package ClassesAndObjects.Challenges;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
        totalNoOfBooks=0;
            }
    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn, "unknown", "unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy"+title);
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }else{
            System.out.println("This book is already in the library.");
        }
    }
    public static void main(String[] args){
        Book designOfThings = new Book("1", "Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
