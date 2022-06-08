package movies.spring.data.neo4j.Author;


import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Author")
public class AuthorEntity {
    @Id
    private String AuthorId;

    @Property("authorName")
    private String authorName;

    @Property("pc")
    private Integer pc;

    @Property("cn")
    private Integer cn;

    @Property("hi")
    private Integer hi;

    @Property("pi")
    private String pi;

    @Property("upi")
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
//    @Relationship(type = "COOPERATE_WITH", direction = OUTGOING)
//    private cooperateWithRelationship cooperateWithStartRelationships;
//
//    @Relationship(type = "COOPERATE_WITH", direction = INCOMING)
//    private cooperateWithRelationship cooperateWithEndRelationships;
}
