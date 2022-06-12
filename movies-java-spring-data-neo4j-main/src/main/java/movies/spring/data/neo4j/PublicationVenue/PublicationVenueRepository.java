package movies.spring.data.neo4j.PublicationVenue;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface PublicationVenueRepository extends Repository<PublicationVenueEntity, String> {

    @Query("MATCH p=(na:Author)-[r:RESEARCH_IN]->(nb:Subject) WHERE nb.researchInterest=$researchInterest WITH id(na) as naid " +
            "MATCH (nc:Author)-[rb:WRITE]->(nd:Paper) WHERE id(nc)=naid WITH id(nd) as ndid " +
            "MATCH (ne:Paper)-[rc:PUBLISHED_BY]->(nf:PublicationVenue) WHERE id(ne)=ndid " +
            "WITH nf,count(nf) as count_nf RETURN nf,count_nf ORDER BY count_nf DESC LIMIT 10")
    List<PublicationVenueEntity> findKeyVenue(@Param("researchInterest") String researchInterest);

}
