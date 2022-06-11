package movies.spring.data.neo4j.Affiliation;
import org.neo4j.driver.Driver;

import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AffiliationService {
    private final AffiliationRepository affiliationRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public AffiliationService(AffiliationRepository affiliationRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.affiliationRepository = affiliationRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }
}
