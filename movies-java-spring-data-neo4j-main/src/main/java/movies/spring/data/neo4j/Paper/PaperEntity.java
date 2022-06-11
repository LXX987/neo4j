package movies.spring.data.neo4j.Paper;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Paper")
public class PaperEntity {

    @Id
    private String PaperId;

    @Property("year")
    private Integer year;


    @Property("author")
    private String author;

    @Property("affiliations")
    private String affiliations;

    @Property("title")
    private String title;

    public String getPaperId() {
        return PaperId;
    }

    public void setPaperId(String paperId) {
        PaperId = paperId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(String affiliations) {
        this.affiliations = affiliations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
