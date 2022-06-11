package movies.spring.data.neo4j.Affiliation;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Affiliation")
public class AffiliationEntity {
    @Id
    private String AffiliationId;

    public String getAffiliationId() {
        return AffiliationId;
    }
    public void setAffiliationId(String affiliationId) {
        AffiliationId = affiliationId;
    }
}
