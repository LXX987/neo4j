package movies.spring.data.neo4j.Cache;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheRepository extends MongoRepository<CacheEntity.cacheResult,String> {
}
