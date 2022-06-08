package movies.spring.data.neo4j.CooperateWith;

import movies.spring.data.neo4j.Author.AuthorEntity;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface cooperateWithRepository extends Repository<AuthorEntity, String> {
    @Query("Match (a:Author{authorName:$authorName})-[r:COOPERATE_WITH]->(b) RETURN b")
    List<AuthorEntity> findCooperationByAuthorName(@Param("authorName") String authorName);
}
