package movies.spring.data.neo4j.Author;


import org.neo4j.driver.Driver;

import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public AuthorService(AuthorRepository authorRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.authorRepository = authorRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }

    public List<AuthorEntity> findByAuthorId(String AuthorId) {
        return this.authorRepository.findByAuthorId(AuthorId);
    }

    public List<Object> getAllRelation(String authorName) {
        return this.authorRepository.getAllRelation(authorName);
    }

    public List<AuthorEntity> findKeyAuthor(String researchInterest) {
        return this.authorRepository.findKeyAuthor(researchInterest);
    }
}
