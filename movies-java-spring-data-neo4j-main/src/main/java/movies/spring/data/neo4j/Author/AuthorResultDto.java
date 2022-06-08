package movies.spring.data.neo4j.Author;



import java.util.Objects;

public class AuthorResultDto {
    private final AuthorEntity author;

    public AuthorResultDto(AuthorEntity author) {
        this.author = author;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorResultDto that = (AuthorResultDto) o;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
