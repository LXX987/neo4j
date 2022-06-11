package movies.spring.data.neo4j.Subject;

import movies.spring.data.neo4j.PublicationVenue.PublicationVenueEntity;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface SubjectRepository extends Repository<SubjectEntity, String> {
}
