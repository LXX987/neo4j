package movies.spring.data.neo4j.Author;

import movies.spring.data.neo4j.movies.MovieResultDto;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.Value;
import org.neo4j.driver.types.TypeSystem;
import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<AuthorEntity> findByAuthorName(String AuthorId) {
        return this.authorRepository.findByAuthorName(AuthorId);
    }

}
