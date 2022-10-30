import java.util.Objects;

public class Book {
    private String titleOfTheBook;
    private Author author;
    int publisherYear;


    public Book(String titleOfTheBook,Author author, int publisherYear ) {
        this.titleOfTheBook = titleOfTheBook;
        this.publisherYear=publisherYear;
        this.author=author;
    }
    public Author getAuthor(){
        return author;
    }
    public  String getTitleOfTheBook() {
        return titleOfTheBook;
    }
    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(titleOfTheBook, book.titleOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, publisherYear);
    }

    @Override
    public String toString() {
        return
                " " + titleOfTheBook + '\'' +
                "" + author +
                ", год публикации " + publisherYear +
                '}';
    }
}

