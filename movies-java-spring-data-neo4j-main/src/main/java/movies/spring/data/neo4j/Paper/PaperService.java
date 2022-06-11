package movies.spring.data.neo4j.Paper;

import org.neo4j.driver.Driver;

import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PaperService {
    private final PaperRepository paperRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public PaperService(PaperRepository paperRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.paperRepository = paperRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }
}
