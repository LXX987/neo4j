package movies.spring.data.neo4j.Affiliation;

import movies.spring.data.neo4j.Author.AuthorEntity;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface AffiliationRepository extends Repository<AffiliationEntity, String> {

    @Query("MATCH p=(na:Author)-[r:RESEARCH_IN]->(nb:Subject) WHERE nb.researchInterest=$researchInterest WITH id(na) as naid " +
            "MATCH (nc:Author)-[rb:BELONG_TO]->(nd:Affiliation) WHERE id(nc)=naid WITH nd,SUM(nc.hi) as sum_hi " +
            "RETURN nd,sum_hi ORDER BY sum_hi DESC LIMIT 10")
    List<AffiliationEntity> findKeyAffiliation(@Param("researchInterest") String researchInterest);

}
