package movies.spring.data.neo4j.CooperateWith;


import movies.spring.data.neo4j.Author.AuthorEntity;
import org.neo4j.driver.Driver;
import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cooperateWithService {
    private final cooperateWithRepository cooperateWithRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public cooperateWithService(movies.spring.data.neo4j.CooperateWith.cooperateWithRepository cooperateWithRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.cooperateWithRepository = cooperateWithRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }

    public List<AuthorEntity> findCooperationByAuthorName(String authorName) {
        System.out.println("tesssst" + this.cooperateWithRepository.findCooperationByAuthorName(authorName));
        return this.cooperateWithRepository.findCooperationByAuthorName(authorName);
    }
}
