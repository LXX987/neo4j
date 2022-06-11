package movies.spring.data.neo4j.api;

import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.Author.AuthorService;
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

    public FieldSearchController(SubjectService subjectService, AuthorService authorService) {
        this.subjectService = subjectService;
        this.authorService = authorService;
    }

    @GetMapping("/findResearchInterest")
    public List<SubjectEntity> findResearchInterest(@RequestParam("researchInterest") String researchInterest, @RequestParam("entity") String entity) {
        if(entity.equals("Author")) {
            return subjectService.findResearchInterest(researchInterest);
        }
        else {
            return null;
        }
    }

    @GetMapping("/findKeyAuthor")
    public List<AuthorEntity> findKeyAuthor(@RequestParam("researchInterest") String researchInterest) {
        return authorService.findKeyAuthor(researchInterest);
    }
}
