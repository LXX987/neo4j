package movies.spring.data.neo4j.Author;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Author")
public class AuthorEntity {
    @Id
    private String AuthorId;
    private String authorName;
    private Integer pc;
    private Integer cn;
    private Integer hi;
    private String pi;
    private String upi;

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String authorId) {
        AuthorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public Integer getCn() {
        return cn;
    }

    public void setCn(Integer cn) {
        this.cn = cn;
    }

    public Integer getHi() {
        return hi;
    }

    public void setHi(Integer hi) {
        this.hi = hi;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }
}
