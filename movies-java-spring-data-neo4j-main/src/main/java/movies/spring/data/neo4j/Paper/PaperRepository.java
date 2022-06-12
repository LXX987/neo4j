package movies.spring.data.neo4j.Paper;

import movies.spring.data.neo4j.Author.AuthorEntity;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface PaperRepository extends Repository<PaperEntity, String> {


}
