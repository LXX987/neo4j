package movies.spring.data.neo4j.api;

import movies.spring.data.neo4j.Affiliation.AffiliationEntity;
import movies.spring.data.neo4j.Affiliation.AffiliationService;
import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.Author.AuthorService;
import movies.spring.data.neo4j.PublicationVenue.PublicationVenueEntity;
import movies.spring.data.neo4j.PublicationVenue.PublicationVenueService;
import movies.spring.data.neo4j.Subject.SubjectEntity;
import movies.spring.data.neo4j.Subject.SubjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class FieldSearchController {
    private final SubjectService subjectService;
    private final AuthorService authorService;
    private final AffiliationService affiliationService;
    private final PublicationVenueService publicationVenueService;

    public FieldSearchController(SubjectService subjectService, AuthorService authorService, AffiliationService affiliationService, PublicationVenueService publicationVenueService) {
        this.subjectService = subjectService;
        this.authorService = authorService;
        this.affiliationService = affiliationService;
        this.publicationVenueService = publicationVenueService;
    }

    @GetMapping("/findResearchInterest")
    public List<SubjectEntity> findResearchInterest(@RequestParam("researchInterest") String researchInterest) {
        return subjectService.findResearchInterest(researchInterest);
    }

    @GetMapping("/findKeyAuthor")
    public List<AuthorEntity> findKeyAuthor(@RequestParam("researchInterest") String researchInterest) {
        return authorService.findKeyAuthor(researchInterest);
    }

    @GetMapping("/findKeyAffiliation")
    public List<AffiliationEntity> findKeyAffiliation(@RequestParam("researchInterest") String researchInterest) {
        return affiliationService.findKeyAffiliation(researchInterest);
    }

    @GetMapping("/findKeyVenue")
    public List<PublicationVenueEntity> findKeyVenue(@RequestParam("researchInterest") String researchInterest) {
        return publicationVenueService.findKeyVenue(researchInterest);
    }
}
