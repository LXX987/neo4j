package movies.spring.data.neo4j.CooperateWith;

import movies.spring.data.neo4j.Author.AuthorEntity;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("COOPERATE_WITH")
public class cooperateWithEntity {
    @Id
    private AuthorEntity start;

}
