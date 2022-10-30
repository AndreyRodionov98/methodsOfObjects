import java.util.Objects;

public class Author {
    private String autorName;
    private String authorLastName;
    public Author(String authorName ,String authorLastName) {
        this.autorName = authorName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorName() {
        return autorName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return autorName.equals(author.autorName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autorName, authorLastName);
    }

    @Override
    public String toString() {
        return "Author{" +
                " " + autorName + '\'' +
                " " + authorLastName + '\'' +
                '}';
    }
}
