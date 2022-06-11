package movies.spring.data.neo4j.Subject;

import org.neo4j.driver.Driver;

import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    private final Neo4jClient neo4jClient;

    private final Driver driver;

    private final DatabaseSelectionProvider databaseSelectionProvider;

    public SubjectService(SubjectRepository subjectRepository, Neo4jClient neo4jClient, Driver driver, DatabaseSelectionProvider databaseSelectionProvider) {
        this.subjectRepository = subjectRepository;
        this.neo4jClient = neo4jClient;
        this.driver = driver;
        this.databaseSelectionProvider = databaseSelectionProvider;
    }

    public List<SubjectEntity> findResearchInterest(String researchInterest) {
        return this.subjectRepository.findResearchInterest(researchInterest);
    }
}
