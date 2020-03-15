package trainor.sean;

class Book {
    int bookID;
    String bookName, author;
    int amountOfBooks;

    public Book(int bookID, String bookName, String author, int amountOfBooks) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.amountOfBooks = amountOfBooks;
    }
}