package movies.spring.data.neo4j.Author;


import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;


interface AuthorRepository extends Repository<AuthorEntity, String> {

    @Query("MATCH (n:Author{AuthorId:$AuthorId}) RETURN n")
    List<AuthorEntity> findByAuthorId(@Param("AuthorId") String AuthorId);

    @Query("MATCH (n:Author{authorName:$authorName})-[r]->(b) RETURN n,r,b")
    List<Object> getAllRelation(@Param("authorName") String authorName);

    @Query("MATCH p=(na:Author)-[r:RESEARCH_IN]->(nb:Subject) WHERE nb.researchInterest=$researchInterest RETURN na ORDER BY na.hi DESC LIMIT 5")
    List<AuthorEntity> findKeyAuthor(@Param("researchInterest") String researchInterest);
}
