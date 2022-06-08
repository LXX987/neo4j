package movies.spring.data.neo4j.Author;


import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;


interface AuthorRepository extends Repository<AuthorEntity, String> {

    @Query("MATCH (n:Author{AuthorId:$AuthorId}) RETURN n")
    List<AuthorEntity> findByAuthorId(@Param("AuthorId") String AuthorId);

}
