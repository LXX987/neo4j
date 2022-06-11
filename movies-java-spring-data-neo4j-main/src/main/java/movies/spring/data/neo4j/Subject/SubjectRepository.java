package movies.spring.data.neo4j.Subject;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRepository extends Repository<SubjectEntity, String> {

    @Query("MATCH (n:Subject) WHERE n.researchInterest =~ ('.*'+$researchInterest+'.*') RETURN n LIMIT 20")
    List<SubjectEntity> findResearchInterest(@Param("researchInterest") String researchInterest);
}
