package movies.spring.data.neo4j.PublicationVenue;

import org.neo4j.driver.Driver;

import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;

@Service
public class PublicationVenueService {
    private  final PublicationVenueRepository publicationVenueRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public PublicationVenueService(PublicationVenueRepository publicationVenueRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.publicationVenueRepository = publicationVenueRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }

    public List<PublicationVenueEntity> findKeyVenue(String researchInterest) {
        return this.publicationVenueRepository.findKeyVenue(researchInterest);
    }

    public List<PublicationVenueEntity> findKeyVenueTime(String researchInterest, int time) {
        return this.publicationVenueRepository.findKeyVenueTime(researchInterest,time);
    }
}
