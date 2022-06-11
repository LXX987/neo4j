package movies.spring.data.neo4j.PublicationVenue;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface PublicationVenueRepository extends Repository<PublicationVenueEntity, String> {
}
